package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Profesor extends Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    private String codigoProfesor;
    private int gradoP;
    private String seccionP;
    private ArrayList<String> cursos;

    public Profesor() {
        super();
        cursos = new ArrayList<>();
    }

    // Constructor principal: código siempre como String limpio
    public Profesor(String nombre, String apellido, String dni, String codigo, int grado, String seccion){
        super(nombre, apellido, dni);
        this.codigoProfesor = codigo.trim(); // limpia espacios
        this.gradoP = grado;
        this.seccionP = seccion;

        cursos = new ArrayList<>();
        cursos.add("Matemática");
        cursos.add("Comunicación");
        cursos.add("Personal Social");
        cursos.add("Ciencia y Tecnología");
        cursos.add("Religión");
    }

    // Getters y setters
    public String getCodigoProfesor() { return codigoProfesor; }
    public void setCodigoProfesor(String codigoProfesor) { this.codigoProfesor = codigoProfesor.trim(); }

    public int getGradoP() { return gradoP; }
    public void setGradoP(int gradoP) { this.gradoP = gradoP; }

    public String getSeccionP() { return seccionP; }
    public void setSeccionP(String seccionP) { this.seccionP = seccionP; }

    public ArrayList<String> getCursos() { return cursos; }
}
