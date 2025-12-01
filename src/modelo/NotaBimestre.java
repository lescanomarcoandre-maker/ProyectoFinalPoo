package modelo;

import java.io.Serializable;

public class NotaBimestre implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String codigoEst;   
    private int grado;          
    private String seccion;     
    private String curso;       
    private int bimestre;       
    private Bimestre notas;     

    public NotaBimestre(String codigoEst, int grado, String seccion,
                        String curso, int bimestre, Bimestre notas) {
        this.codigoEst = codigoEst;
        this.grado = grado;
        this.seccion = seccion;
        this.curso = curso;
        this.bimestre = bimestre;
        this.notas = notas;
    }

    public String getCodigoEst(){ return codigoEst; }
    public int getGrado(){ return grado; }
    public String getSeccion(){ return seccion; }
    public String getCurso(){ return curso; }
    public int getBimestre(){ return bimestre; }
    public Bimestre getNotas(){ return notas; }
}
