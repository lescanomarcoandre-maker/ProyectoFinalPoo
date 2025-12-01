package control;

import java.io.Serializable;
import modelo.Profesor;
import java.util.ArrayList;

public class GestorProfesores implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private ArrayList<Profesor> lista = new ArrayList<>();

    
    public void registrarProfesor(Profesor p){
        if(p != null) lista.add(p);
    }

    // buscar profesor por código seguro
    public Profesor buscarPorCodigo(String codigo) {
        for(Profesor p : lista){ // ArrayList de profesores
            if(p.getCodigoProfesor().equals(codigo)){ 
                return p;
            }
        }
        return null; // si no encuentra
    }

    // verifica si el DNI ya existe
    public boolean dniExiste(String dni){
        if(dni == null) return false;
        for(Profesor p : lista){
            if(p != null && dni.equals(p.getDni())){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Profesor> getLista() {
        return lista;
    }

    // verifica si un salón ya tiene profesor asignado
    public boolean salonOcupado(int grado, String seccion) {
        if(seccion == null) return false;
        for(Profesor p : lista) {
            if(p != null && p.getGradoP() == grado && seccion.equalsIgnoreCase(p.getSeccionP())){
                return true;
            }
        }
        return false;
    }

    // READ
    public Profesor verificarCodigo(String codigo){
        return buscarPorCodigo(codigo);
    }

    public ArrayList<Profesor> listarTodosProfesores(){
        return new ArrayList<>(lista);
    }

    public boolean actualizarProfesor(String codigo, Profesor nuevosDatos){
        Profesor p = buscarPorCodigo(codigo);
        if(p == null || nuevosDatos == null) return false;

        p.setNombre(nuevosDatos.getNombre());
        p.setApellido(nuevosDatos.getApellido());
        p.setDni(nuevosDatos.getDni());
        p.setGradoP(nuevosDatos.getGradoP());
        p.setSeccionP(nuevosDatos.getSeccionP());

        return true;
    }

    public Profesor buscarPorSalon(int grado, String seccion) {
        if(seccion == null) return null;
        for(Profesor p : lista){
            if(p != null && p.getGradoP() == grado && seccion.equalsIgnoreCase(p.getSeccionP())){
                return p;
            }
        }
        return null;
    }

    public boolean eliminarProfesor(String codigo){
        Profesor p = buscarPorCodigo(codigo);
        if(p != null){
            lista.remove(p);
            return true;
        }
        return false;
    }
}

