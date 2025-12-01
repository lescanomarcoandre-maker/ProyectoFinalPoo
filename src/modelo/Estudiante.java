package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Estudiante extends Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    private String codigo;
    private String seccion;
    private ArrayList<Bimestre> bimestres;
    private int grado;
    private ArrayList<Asistencia> asistencias;

    // constructor vacío
    public Estudiante() {
        this.bimestres = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            bimestres.add(new Bimestre());
        }
        this.asistencias = new ArrayList<>();
    }

    // constructor con datos
    public Estudiante(String nombre, String apellido, String dni, String codigo, String seccion) {
        super(nombre, apellido, dni);
        this.codigo = codigo;
        this.seccion = seccion;

        this.bimestres = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            bimestres.add(new Bimestre());
        }

        this.asistencias = new ArrayList<>();
    }

    // getters y setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public int getGrado() { return grado; }
    public void setGrado(int grado) { this.grado = grado; }

    public String getSeccion() { return seccion; }
    public void setSeccion(String seccion) { this.seccion = seccion; }

    public ArrayList<Asistencia> getAsistencias() { return asistencias; }
    public void setAsistencias(ArrayList<Asistencia> asistencias) { this.asistencias = asistencias; }

    // metodos 
    public Bimestre getBimestre(int n) {
        if (n >= 1 && n <= bimestres.size()) {
            return bimestres.get(n - 1);
        }
        return null;
    }

    public void setBimestre(int n, Bimestre b) {
        if (n >= 1 && n <= bimestres.size()) {
            bimestres.set(n - 1, b);
        }
    }

    public void agregarAsistencia(Asistencia a) {
        asistencias.add(a);
    }
}

