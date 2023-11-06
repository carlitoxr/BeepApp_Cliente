package Conectividad;

import java.io.IOException;

import javax.mail.MessagingException;

import com.icegreen.greenmail.user.UserException;

public class FachadaCon {
    
    private String cedula, pass;

    private static FachadaCon instancia;
	
    //Esta clase utiliza el patron Singleton
    public static FachadaCon getInstancia(){
        if (instancia == null)
            instancia = new FachadaCon();

        return instancia;
    }
	
	
    public boolean EnviaCorreo(String nom_cuenta_emisor, String nom_dominio_emisor, String cedula_usuario_emisor, String pass, String nom_usuario_receptor, String nom_dominio_receptor, String asunto, String texto) throws IOException, MessagingException, UserException, InterruptedException{
        boolean realizado;
        ConSocket S = new ConSocket();
        
        EnviaCorreo C = new EnviaCorreo(nom_cuenta_emisor, nom_dominio_emisor, cedula_usuario_emisor, pass, nom_usuario_receptor, nom_dominio_receptor, asunto, texto);
        
        realizado = C.Enviar();
        return realizado;
    }
        
    public boolean EnviaCorreo(String nom_cuenta_emisor, String nom_dominio_emisor, String cedula_usuario_emisor, String pass, String nom_usuario_receptor, String nom_dominio_receptor, String asunto, String texto, int id_conversacion) throws IOException, MessagingException, UserException, InterruptedException{
        boolean realizado;
        ConSocket S = new ConSocket();
        
        EnviaCorreo C = new EnviaCorreo(nom_cuenta_emisor, nom_dominio_emisor, cedula_usuario_emisor, pass, nom_usuario_receptor, nom_dominio_receptor, asunto, texto, id_conversacion);
        
        realizado = C.Enviar();
        return realizado;
    }
        
    public boolean RecibeCorreo(String cuenta, String dom, String password){
        boolean realizado;
        ConSocket s = new ConSocket();

        realizado = s.UsuToServer(cuenta, dom, password);
        return realizado;
    }
	
    public void IniSocket(){
        ConSocket S = new ConSocket();
        S.ConToServer(cedula, pass);
    }
	
    public String Login(String cedula, String pass) throws IOException{
        this.cedula = cedula;
        this.pass = pass;

        ConSocket s = new ConSocket();
        return s.Login(cedula, pass);
    }
	
    public String autenticar_email(String nom_usuario, String nom_dominio) throws IOException {
        ConSocket S = new ConSocket();
        return S.autenticar_email(nom_usuario, nom_dominio);
    }
}
