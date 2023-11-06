
package Logica;

public class Dominio {
    
    private String nom_dominio;
    private int prioridad;

    public Dominio(String nom_dominio, int prioridad) {
        this.nom_dominio = nom_dominio;
        this.prioridad = prioridad;
    }

    public String getNom_dominio() {
        return nom_dominio;
    }

    public void setNom_dominio(String nom_dominio) {
        this.nom_dominio = nom_dominio;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    
    
}
