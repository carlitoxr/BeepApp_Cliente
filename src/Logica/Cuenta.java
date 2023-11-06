
package Logica;

public class Cuenta {
    private static Cuenta instancia;
    
    private String nom_cuenta;
    private Dominio dominio;
    private Usuario usuario;
    private int habilitada;
    
    private Carpetas carpetas;
    private Correos correos;
    
    private Cuenta(){
    }
    
    public static Cuenta getInstancia(){
        if(instancia == null){
            instancia = new Cuenta();
        }
        return instancia;
    }
}
