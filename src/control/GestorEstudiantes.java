package control;

import java.io.Serializable;
import modelo.Estudiante;
import java.util.ArrayList;

public class GestorEstudiantes implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private ArrayList<Estudiante> lista = new ArrayList<>();
    
    
    // registrar estudiante con validación previa en el formulario
    public void registrarEstudiante(Estudiante e) {
        lista.add(e);
    }
    
    // sirve para verificar si un DNI ya está registrado
    public boolean dniExiste(String dni) {
        for (Estudiante e : lista) {
            if (e.getDni().equals(dni)) {
                return true;
            }
        }
        return false;
    }
    
    // busca un estudiante por su DNI y lo retorna o null si no existe
    public Estudiante buscarPorDni(String dni) {
        for (Estudiante e : lista) {
            if (e.getDni().equals(dni)) {
                return e;
            }
        }
        return null; // no encontrado
    }
    
    // devuelve los estudiantes del salón indicado 
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
    
    // elimina un estudiante
    public void eliminarEstudiante(Estudiante e) {
        lista.remove(e);
    }

    // devuelve todos los estudiantes
    public ArrayList<Estudiante> listarTodos() {
        return lista;
    }

    private int contador = 1; // dentro de GestorEstudiantes

    public String generarCodigo() {
        // devuelve un código de 8 dígitos secuencial
        return String.format("%08d", contador++);
    }
    
    public Estudiante buscarPorCodigo(String codigo) {
        for (Estudiante e : lista) {
            if (e.getCodigo().equalsIgnoreCase(codigo)) {
                return e;
            }
        }
        return null; // no encontrado
    }
}

