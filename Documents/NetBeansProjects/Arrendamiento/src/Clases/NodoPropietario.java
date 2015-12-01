
package Clases;


public class NodoPropietario {
    
    
    private int documento;
    private String nombre;
    private String apellido;
    private String telefono;
    private String celular;
    private String email;
    private NodoPropietario liga;

    public NodoPropietario(int documento, String nombre, String apellido, String telefono, String celular, String email) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.celular = celular;
        this.email = email;
        this.liga=null;//La liga del nodo se hace igual a null '0'
    }
    
        //SE CREA EL NODO VACIO
    public NodoPropietario()
    {
        this.documento = 0;
        this.nombre = "";
        this.apellido = "";
        this.telefono = "";
        this.celular = "";
        this.email = "";
        this.liga=null;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NodoPropietario getLiga() {
        return liga;
    }

    public void setLiga(NodoPropietario liga) {
        this.liga = liga;
    }

   
    
    
    
}
