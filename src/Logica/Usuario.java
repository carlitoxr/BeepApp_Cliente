
package Logica;

public class Usuario {
    
    private static Usuario instancia;
    
    private String cedula;
    private String password;
    private String nombre;
    private String apellido;
    private String celular;
    
    private Usuario(){
    }
    
    public static Usuario getInstancia(){
        if(instancia == null)
            instancia = new Usuario();
        return instancia;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
}
