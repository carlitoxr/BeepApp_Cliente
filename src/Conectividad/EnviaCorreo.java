package Conectividad;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

import com.icegreen.greenmail.util.ServerSetupTest;
import com.sun.mail.smtp.SMTPTransport;

public class EnviaCorreo {
    
    private String nom_cuenta_emisor;
    private String nom_dominio_emisor;
    private String pass;
    private String cedula_usuario_emisor;
    private String nom_cuenta_receptor;
    private String nom_dominio_receptor;
    private String cedula_usuario_receptor;
    private String fecha;
    private String asunto;
    private String texto;
    private int id_conversacion;
    private static final String LOCALHOST = "127.0.0.1";
    
    public EnviaCorreo(String nom_cuenta_emisor, String nom_dominio_emisor, String cedula_usuario_emisor, String pass, String nom_cuenta_receptor, String nom_dominio_receptor, String asunto, String texto) {
        this.nom_cuenta_emisor = nom_cuenta_emisor;
        this.nom_dominio_emisor = nom_dominio_emisor;
        this.pass = pass;
        this.cedula_usuario_emisor = cedula_usuario_emisor;
        this.nom_cuenta_receptor = nom_cuenta_receptor;
        this.nom_dominio_receptor = nom_dominio_receptor;
        this.asunto = asunto;
        this.texto = texto;
        this.id_conversacion = id_conversacion;
    }
    
    public EnviaCorreo(String nom_cuenta_emisor, String nom_dominio_emisor, String cedula_usuario_emisor, String pass, String nom_cuenta_receptor, String nom_dominio_receptor, String asunto, String texto, int id_conversacion) {
        this.nom_cuenta_emisor = nom_cuenta_emisor;
        this.nom_dominio_emisor = nom_dominio_emisor;
        this.pass = pass;
        this.cedula_usuario_emisor = cedula_usuario_emisor;
        this.nom_cuenta_receptor = nom_cuenta_receptor;
        this.nom_dominio_receptor = nom_dominio_receptor;
        this.asunto = asunto;
        this.texto = texto;
        this.id_conversacion = id_conversacion;
    }
    
    public boolean Enviar() {    
        boolean realizado = false;
        // Aca estamos asumiendo que el email sale de Localhost.
        String host = "localhost";

        // Se obtienen las propiedades del sistema
        Properties properties = System.getProperties();

        // Se realiza el setup del servidor de correo
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", ServerSetupTest.SMTP.getPort());

        // Se obtiene las sesion por defecto
        Session session = Session.getDefaultInstance(properties);

        try {
            // Creal el objeto MimeMessage por defecto
            MimeMessage message = new MimeMessage(session);

            // Hace el set del cabezal para el From
            String mail_from = nom_cuenta_emisor + "@" + nom_dominio_emisor;
            message.setFrom(new InternetAddress(mail_from));

            // Hace el set del cabezal para el To
            String mail_to = nom_cuenta_receptor + "@" + nom_dominio_receptor;
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(mail_to));

            // Hace el set para el Asunto
            message.setSubject(asunto);

            // Ahora seteamos el cuerpo del mensaje
            message.setText(texto);

            // Se envia el mensaje
            SMTPTransport t = (SMTPTransport) session.getTransport("smtp");
            
            t.connect(LOCALHOST, mail_from, pass);
            
            t.sendMessage(message, message.getAllRecipients());
            t.close();
            realizado = true;
            return realizado;
        }catch (MessagingException mex) {
            //System.out.println("cliente asdasd");
            return realizado;
        }
    }
}
