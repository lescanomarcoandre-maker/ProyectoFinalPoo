package modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Asistencia implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private LocalDate fecha;
    private boolean presente;
    
    public Asistencia(LocalDate fecha, boolean presente){
        this.fecha = fecha;
        this.presente = presente;
    }
    
    public LocalDate getFecha(){ return fecha; }
    public boolean isPresente(){ return presente; }
}
