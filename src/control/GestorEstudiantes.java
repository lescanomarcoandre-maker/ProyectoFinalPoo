package control;

import java.io.Serializable;
import modelo.Estudiante;
import java.util.ArrayList;

public class GestorEstudiantes implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private ArrayList<Estudiante> lista = new ArrayList<>();
    
    // MÉTODOS PRINCIPALES
    
    // Registrar estudiante con validación previa en el formulario
    public void registrarEstudiante(Estudiante e) {
        lista.add(e);
    }
    
    // Verifica si un DNI ya está registrado
    public boolean dniExiste(String dni) {
        for (Estudiante e : lista) {
            if (e.getDni().equals(dni)) {
                return true;
            }
        }
        return false;
    }
    
    // Busca un estudiante por su DNI y lo retorna, o null si no existe
    public Estudiante buscarPorDni(String dni) {
        for (Estudiante e : lista) {
            if (e.getDni().equals(dni)) {
                return e;
            }
        }
        return null; // No encontrado
    }
    
    // Devuelve los estudiantes del salón indicado (grado y sección)
    public ArrayList<Estudiante> listarPorSalon(int grado, String seccion) {
        ArrayList<Estudiante> aux = new ArrayList<>();

        for (Estudiante e : lista) {
            if (
                e.getSeccion().equalsIgnoreCase(seccion)) {
                aux.add(e);
            }
        }

        return aux;
    }
    
    // Elimina un estudiante
    public void eliminarEstudiante(Estudiante e) {
        lista.remove(e);
    }

    // Devuelve todos los estudiantes
    public ArrayList<Estudiante> listarTodos() {
        return lista;
    }

    private int contador = 1; // dentro de GestorEstudiantes

    public String generarCodigo() {
        // Devuelve un código de 8 dígitos secuencial
        return String.format("%08d", contador++);
    }
    
    public Estudiante buscarPorCodigo(String codigo) {
        for (Estudiante e : lista) {
            if (e.getCodigo().equalsIgnoreCase(codigo)) {
                return e;
            }
        }
        return null; // No encontrado
    }
}
