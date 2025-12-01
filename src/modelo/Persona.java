package modelo;

import java.io.Serializable;

public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    protected String nombre;
    protected String apellido;
    protected String dni;
    
    public Persona() {}
    
    public Persona(String nombre, String apellido, String dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
    // getters y Setters
    public String getNombre(){ return nombre; }
    public void setNombre(String nombre){ this.nombre = nombre; }
    
    public String getApellido(){ return apellido; }
    public void setApellido(String apellido){ this.apellido = apellido; }
    
    public String getDni(){ return dni; }
    public void setDni(String dni){ this.dni = dni; }
}

