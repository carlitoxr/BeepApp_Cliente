
package Logica;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class Cuenta2 {
    private static Cuenta2 instancia;
    
    private String nom_cuenta;
    /*private Dominio dominio;*/ private String dominio;
    //private Usuario usuario;
    //private int habilitada;
    
    private Carpetas carpetas;
    private Correos correos;
    
    private Cuenta2(){
        //correos = Correos.getInstancia();
        correos = new Correos();
    }
    
    public static Cuenta2 getInstancia(){
        if(instancia == null){
            instancia = new Cuenta2();
        }
        return instancia;
    }
    
    public DefaultComboBoxModel cargar_cb(ArrayList<String> cuentas){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        for(String cuenta : cuentas){
            modelo.addElement(cuenta);
        }
        
        return modelo;
    }
    
    public void cargar_cuenta(String cuenta_email){
        this.nom_cuenta = cuenta_email.substring(0,cuenta_email.indexOf("@"));
        this.dominio = cuenta_email.substring(cuenta_email.indexOf("@")+1);
        System.out.println("" + nom_cuenta + " " + dominio);
    }

    public String getNom_cuenta() {
        return nom_cuenta;
    }

    public String getDominio() {
        return dominio;
    }

    public Correos getCorreos() {
        return correos;
    }
    
    public void refrescar_correos(){
        this.correos = new Correos();
    }
}
