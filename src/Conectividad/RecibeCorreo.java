package Conectividad;

import Logica.Correo;
import Logica.Fachada;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Properties;
 
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.URLName;

import com.icegreen.greenmail.user.UserException;
import com.icegreen.greenmail.util.ServerSetupTest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class RecibeCorreo {
	
    private static final String LOCALHOST = "127.0.0.1";
    private String Usuario;
    private String PassUsu;
    private ArrayList<Integer> ides = new ArrayList<>();

    public RecibeCorreo(String Usu, String PassUsu){
            this.Usuario = Usu;
            this.PassUsu = PassUsu;
    }

    /**
     * @return el nomUsuario
     */
    public String getNomUsuario() {
        return Usuario;
    }



    /**
     * @param nomUsuario el nomUsuario a establecer
     */
    public void setNomUsuario(String nomUsuario) {
        Usuario = nomUsuario;
    }

    /**
     * @return el passUsu
     */
    public String getPassUsu() {
        return PassUsu;
    }

    /**
     * @param passUsu el passUsu a establecer
     */
    public void setPassUsu(String passUsu) {
        PassUsu = passUsu;
    }

    public void getMails() throws IOException, MessagingException, UserException, InterruptedException {
        String asunto, recibidos, emisor, receptor;
        int cont, i, id_conv;
        try{
            Properties prop = new Properties();
            prop.setProperty("mail.pop3.connectiontimeout", "6000");
            Session session = Session.getInstance(prop);
            i = ServerSetupTest.POP3.getPort();

            URLName urlName = new URLName("pop3", LOCALHOST, ServerSetupTest.POP3.getPort(), null, Usuario, PassUsu);
            //System.out.println("RecibeCorreo " + Usuario + " " + PassUsu);
            Store store = session.getStore(urlName);
            //System.out.println("HOLA????" + urlName.toString());
            store.connect();

            Folder folder = store.getFolder("INBOX");
            folder.open(Folder.READ_ONLY);
            Message[] messages = folder.getMessages();
            cont = folder.getMessageCount();
            //System.out.println("RecibeCorreo cont " + cont);
            i = 0;
            while(cont > 0){
                Message m = messages[i];
                String cutStr[] = m.getSubject().split("%");    //System.out.println("m.getSubject " + m.getSubject() + "m.getSubject().split " + m.getSubject().split("%"));
                id_conv = Integer.parseInt(cutStr[0]);      //System.out.println("id_conv " + id_conv);
                asunto = cutStr[1];     //System.out.println("asunto " + asunto);

                emisor = m.getFrom()[0].toString().substring(0, m.getFrom()[0].toString().indexOf("@"));
                receptor = m.getHeader("To")[0].toString().substring(0, m.getHeader("To")[0].toString().indexOf("@"));
                String nom_dominio_emisor[] = m.getFrom()[0].toString().split("@");
                String nom_dominio_receptor[] = m.getHeader("To")[0].toString().split("@");

                /* MUESTRA EN CONSOLA LOS EMAILS:*/
                /*System.out.println("RecibeCorreo " + " id_conv: " + id_conv + " | asunto " + asunto + 
                        " | emisor " + emisor + " | nom_dominio_emisor " + nom_dominio_emisor[1] + 
                        " | receptor " +  " | nom_dominio_receptor " + nom_dominio_receptor[1] + 
                        " | content " + m.getContent().toString());*/

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String fecha = sdf.format(m.getSentDate());

                //Con id de conversacion:
                Correo c = new Correo(emisor, nom_dominio_emisor[1], nom_dominio_receptor[1], nom_dominio_receptor[1], fecha, asunto, m.getContent().toString(), id_conv);

                Fachada.getInstancia().cargar_correo_desde_srv(c);

                cont--;
                i++;

        }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
