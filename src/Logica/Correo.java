
package Logica;

public class Correo {
    private String nom_usuario_emisor;
    private String nom_dominio_emisor;
    //private String cedula_usuario_emisor;
    private String nom_usuario_receptor;
    private String nom_dominio_receptor;
    //private String cedula_usuario_receptor;
    private String fecha; //YYYY-MM-DD hh:mm:ss
    private String asunto;
    private String texto;
    private int id_conversacion;
    //private int enviado;

    public Correo() {
    }
    
    public Correo(String nom_usuario_emisor, String nom_dominio_emisor, String nom_usuario_receptor, String nom_dominio_receptor, String fecha, String asunto, String texto) {
        this.nom_usuario_emisor = nom_usuario_emisor;
        this.nom_dominio_emisor = nom_dominio_emisor;
        this.nom_usuario_receptor = nom_usuario_receptor;
        this.nom_dominio_receptor = nom_dominio_receptor;
        this.fecha = fecha;
        this.asunto = asunto;
        this.texto = texto;
    }

    public Correo(String nom_usuario_emisor, String nom_dominio_emisor, String nom_usuario_receptor, String nom_dominio_receptor, String fecha, String asunto, String texto, int id_conversacion) {
        this.nom_usuario_emisor = nom_usuario_emisor;
        this.nom_dominio_emisor = nom_dominio_emisor;
        this.nom_usuario_receptor = nom_usuario_receptor;
        this.nom_dominio_receptor = nom_dominio_receptor;
        this.fecha = fecha;
        this.asunto = asunto;
        this.texto = texto;
        this.id_conversacion = id_conversacion;
    }

    public String getNom_usuario_emisor() {
        return nom_usuario_emisor;
    }

    public String getNom_dominio_emisor() {
        return nom_dominio_emisor;
    }

    public String getNom_usuario_receptor() {
        return nom_usuario_receptor;
    }

    public String getNom_dominio_receptor() {
        return nom_dominio_receptor;
    }

    public String getFecha() {
        return fecha;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getTexto() {
        return texto;
    }

    public int getId_conversacion() {
        return id_conversacion;
    }

    
}
