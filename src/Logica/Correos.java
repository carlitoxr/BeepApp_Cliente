
package Logica;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Correos {
    
    //private static Correos instancia;
    
    private ArrayList<Correo> correos = new ArrayList<>();

//    private Correos() {
//    }
    public Correos(){
    }
    /*public static Correos getInstancia() {
        if(instancia == null)
            instancia = new Correos();
        return instancia;
    }*/
    
    public void cargar_correo_desde_srv(Correo c){
        correos.add(c);
    }
    
    public DefaultTableModel cargar_mails(){
        //Correo c = new Correo(emisor, nom_dominio_emisor[1], nom_dominio_receptor[1], nom_dominio_receptor[1], fecha, asunto, m.getContent().toString());
        String col[] = {"Emisor", "Asunto", "Fecha"};
        DefaultTableModel modelo = new DefaultTableModel(col, 0);
        
        ArrayList<Integer> ides = new ArrayList<>();
        boolean mismo_id = false;
        
        for(Correo c : correos){
            for(int id : ides){
                if(c.getId_conversacion() == id){
                    //System.out.println("mismo id" + c.getId_conversacion() + " " + id);
                    mismo_id = true;
                }
            }
            if(!mismo_id){
                String emisor = c.getNom_usuario_emisor() + "@" + c.getNom_dominio_emisor();
                String asunto = c.getAsunto();
                String fecha = c.getFecha();
                String row[] = {emisor, asunto, fecha};
                modelo.addRow(row);
                System.out.println("Correos " + row[0] + row[1] + row[2]);
                ides.add(c.getId_conversacion());
                mismo_id = false;
            }
        }
        
        return modelo;
    }
    
    public Correo obtener_email_fecha(String fecha){
        Correo correo = new Correo();
        
        for(Correo c : correos){
            if(c.getFecha().equals(fecha))
                return c;
        }
        
        return correo;
    }
    
    public String obtener_texto_email_responder(int id_conv){
        String texto = "";
        for(Correo c : correos){
            if(c.getId_conversacion() == id_conv){
                texto = texto + "\n";
                texto = texto + "-------------------------\n";
                texto = texto + c.getTexto();
            }
        }
        return texto;
    }
    
}
