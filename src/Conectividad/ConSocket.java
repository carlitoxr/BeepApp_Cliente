package Conectividad;

import Logica.Cuenta2;
import Logica.Dominio;
import Logica.Fachada;
import Logica.Usuario;
import java.net.*;
import java.io.*;
import java.util.ArrayList;

public class ConSocket {

    private Socket cliente;
    private int puerto = 6000;
    private String ip = "127.0.0.1";
    private DataOutputStream salida;
    private DataInputStream entrada;

    public ConSocket(){

    }
	
    public void ConToServer(String cedula, String password){
        String msg;

        //Info de usuario:
        String nombre, apellido, celular;

        //Info de cuenta:
        String nom_cuenta = null;
        Dominio dominio;
        Usuario usuario;
        int habilitada;

        //Info dominio:
        String nom_dominio;
        int prioridad;

        try{
            cliente = new Socket(ip, puerto);
            entrada = new DataInputStream(cliente.getInputStream());
            salida = new DataOutputStream(cliente.getOutputStream());

            msg = "Conn";
            salida.writeUTF(msg);

            salida.writeUTF(cedula);
            salida.writeUTF(password);

            msg = entrada.readUTF();

            if(msg.compareToIgnoreCase("finUsuario") != 0){
                nombre = msg;
                apellido = entrada.readUTF();
                celular = entrada.readUTF();

                //Prueba:
                //System.out.println(nombre + " " + apellido + " " + celular);

                msg = entrada.readUTF();
            }

            msg = entrada.readUTF();
            while (msg.compareToIgnoreCase("fin") != 0){
                nom_cuenta = msg;
                nom_dominio = entrada.readUTF();
                prioridad = Integer.parseInt(entrada.readUTF());
                habilitada = Integer.parseInt(entrada.readUTF());

                //Prueba:
                //System.out.println(nom_cuenta + " " + nom_dominio + " " + prioridad + " " + habilitada);

                msg = entrada.readUTF();
            }
            //System.out.println("Soy libre :)");

            entrada.close();
            salida.close();
            cliente.close();
        }catch(Exception e){};
    }
	
	
    public String Login(String cedula, String pass) throws IOException{
        String msg, result;
        result = "No_Conect";

        System.out.println("ConSocket Login " + ip + puerto);
        cliente = new Socket(ip, puerto); 
        entrada = new DataInputStream(cliente.getInputStream());
        salida = new DataOutputStream(cliente.getOutputStream());

        msg = "Auth";
        salida.writeUTF(msg);

        salida.writeUTF(cedula);
        salida.writeUTF(pass);

        result = entrada.readUTF();

        /*Traigo las cuentas del usuario para que seleccione en el cliente con cuál quiere conectarse*/
        if(result.equals("Valid")){
            String c = entrada.readUTF();

            while(!c.equals("Valido")){
                //System.out.println("" + c);
                Fachada.getInstancia().cargar_cuentas_email(c);
                c = entrada.readUTF();
            }

            result = c;
        }

        entrada.close();
        salida.close();
        cliente.close();

        return result;
    }
        
    /*Trato de autenticar el email al q se le manda el correo*/
    public String autenticar_email(String nom_usuario, String nom_dominio) throws IOException{
        String msg, result;

        cliente = new Socket(ip, puerto); 
        entrada = new DataInputStream(cliente.getInputStream());
        salida = new DataOutputStream(cliente.getOutputStream());

        msg = "Email";
        salida.writeUTF(msg);

        salida.writeUTF(nom_dominio); //valido dominio
        result = entrada.readUTF();

        if(result.equals("dominio_valido")){
            salida.writeUTF(nom_usuario); //valido cuenta de correo
            result = entrada.readUTF(); //System.out.println("autenticar_email " + result);
        }

        entrada.close();
        salida.close();
        cliente.close();

        return result;
    }
    
    public boolean UsuToServer(String cuenta, String dom, String password){
        String msg;
        
        //Cuenta:
        String nom_cuenta, nom_dominio, pass;
        
        boolean hecho = false;
        
        try {
            cliente = new Socket(ip, puerto); //System.out.println("ConSocket UsuToServer " + ip + puerto);
            entrada = new DataInputStream(cliente.getInputStream());
            salida = new DataOutputStream(cliente.getOutputStream());
            
            msg = "Usu";
            salida.writeUTF(msg);
            
            nom_cuenta = cuenta; //linea 104
            salida.writeUTF(nom_cuenta);
            
            nom_dominio = dom; //linea 107
            salida.writeUTF(nom_dominio);
            
            //System.out.println("ConSocket" + msg);
            msg = entrada.readUTF(); //acá queda
            pass = password; //linea 111
            RecibeCorreo r = new RecibeCorreo(nom_cuenta, pass);
            //System.out.println("" + nom_cuenta + pass);
            r.getMails();
            
            msg = "OK";
            salida.writeUTF(msg);
            
            entrada.close();
            salida.close();
            cliente.close();
            hecho = true;
            
            return hecho;            
        } catch (Exception e) {
            e.printStackTrace();

            return hecho;
        }
    }
    
}
