package control;

import java.io.Serializable;
import modelo.Estudiante;
import modelo.Asistencia;
import java.time.LocalDate;
import java.util.ArrayList;

public class GestorAsistencias implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    public void registrarAsistencia(Estudiante e, LocalDate fecha, boolean presente){
        e.agregarAsistencia(new Asistencia(fecha, presente));
    }

    public ArrayList<Asistencia> obtenerAsistenciasEnFecha(
            ArrayList<Estudiante> lista, LocalDate fecha){

        ArrayList<Asistencia> aux = new ArrayList<>();

        for(Estudiante e : lista){
            for(Asistencia a : e.getAsistencias()){
                if(a.getFecha().equals(fecha)){
                    aux.add(a);
                }
            }
        }
        return aux;
    }
    
    public double calcularPorcentajeAnual(Estudiante e){
        int total = e.getAsistencias().size();
        if(total == 0) return 0;

        int presentes = 0;
        for(Asistencia a : e.getAsistencias()){
            if(a.isPresente()) presentes++;
        }
        return (presentes * 100.0) / total;
    }
    
}
