package Logica;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Fachada {

    private static Fachada instancia;

    private Usuario2 usuario;
    //private Cuenta cuenta;
    //private Correos correos;

    private ArrayList<String> cuentas = new ArrayList<>();

    private Fachada() {
        usuario = Usuario2.getInstancia();
        //correos = Correos.getInstancia();
        //correos = new Correos();
    }

    public static Fachada getInstancia() {
        if (instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }

    public void cargar_cuentas_email(String cuenta) {
        cuentas.add(cuenta);
    }

    public ArrayList<String> getCuentas() {
        return cuentas;
    }

    //Faltan los demás campos
    public void cargar_usuario(String cedula, String pass) {
        Usuario2.getInstancia().setCedula(cedula);
        Usuario2.getInstancia().setPassword(pass);
//        Usuario2.getInstancia().setNombre();
//        Usuario2.getInstancia().setApellido();
//        Usuario2.getInstancia().setCelular();
    }

    public void cargar_cuenta(String cuenta_email) {
        //Cuenta2.getInstancia().cargar_cuenta(cuenta_email);
        usuario.setCuenta(cuenta_email);
    }

    public void cargar_correo_desde_srv(Correo c) {
        usuario.getCuenta().getCorreos().cargar_correo_desde_srv(c);
        //correos.cargar_correo_desde_srv(c);
    }

    public DefaultTableModel cargar_mails() {
        //Correo c = new Correo(emisor, nom_dominio_emisor[1], nom_dominio_receptor[1], nom_dominio_receptor[1], fecha, asunto, m.getContent().toString());
        //return correos.cargar_mails();
        return usuario.getCuenta().getCorreos().cargar_mails();
    }

    public Usuario2 getUsuario() {
        return usuario;
    }

    public Correo obtener_email_fecha(String fecha) {
        return usuario.getCuenta().getCorreos().obtener_email_fecha(fecha);
    }

    public String obtener_texto_email_responder(int id_conv) {
        return usuario.getCuenta().getCorreos().obtener_texto_email_responder(id_conv);
    }

    public void carpetaBD(String nombreCarpeta, String nombreCuenta, String dominio, String cedula) throws IOException, FileNotFoundException, SQLException {
       
        
    }

}
