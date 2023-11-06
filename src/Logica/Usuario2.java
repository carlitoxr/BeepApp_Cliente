
package Logica;

public class Usuario2 {
    
    private static Usuario2 instancia;
    
    private String cedula;
    private String password;
    private String nombre;
    private String apellido;
    private String celular;
    
    private Cuenta2 cuenta;
    
    private Usuario2(){
        cuenta = Cuenta2.getInstancia();
    }
    
    public static Usuario2 getInstancia(){
        if(instancia == null)
            instancia = new Usuario2();
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

    public Cuenta2 getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta.cargar_cuenta(cuenta);
    }
}
