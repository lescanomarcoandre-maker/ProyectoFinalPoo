package control;

import java.io.Serializable;
import modelo.Estudiante;
import modelo.Bimestre;
import java.util.ArrayList;

public class GestorNotas implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    // guardar las 4 TS de un bimestre para un CURSO específico
    public void registrarTS(Estudiante e, int bimestre, String curso, double[] notas){
        Bimestre b = e.getBimestre(bimestre);

        Bimestre.NotasPorCurso n = b.getNotas(curso);
        n.setTS(notas);
    }

    // guardar o actualizar nota individual (PC1, PC2, EF) para un curso
    public void registrarNota(Estudiante e, int bimestre, String curso, String tipo, double valor){
        Bimestre b = e.getBimestre(bimestre);
        Bimestre.NotasPorCurso n = b.getNotas(curso);

        switch(tipo.toUpperCase()){
            case "PC1": n.setPC1(valor); break;
            case "PC2": n.setPC2(valor); break;
            case "EF" : n.setEF(valor);  break;
        }

        n.calcularPromedio();
    }

    // obtener todas las notas del bimestre
    public Bimestre obtenerNotas(Estudiante e, int bimestre){
        return e.getBimestre(bimestre);
    }

    // actualizar todas las notas del bimestre para un curso
    public void actualizarNotas(Estudiante e, int bimestre, String curso,
                                double[] ts, double pc1, double pc2, double ef){

        Bimestre b = e.getBimestre(bimestre);
        Bimestre.NotasPorCurso n = b.getNotas(curso);

        n.setTS(ts);
        n.setPC1(pc1);
        n.setPC2(pc2);
        n.setEF(ef);

        n.calcularPromedio();
    }

    // eliminar todas las notas del bimestre para un curso
    public void eliminarNotas(Estudiante e, int bimestre, String curso){
        Bimestre b = e.getBimestre(bimestre);
        Bimestre.NotasPorCurso n = b.getNotas(curso);

        n.setTS(new double[]{0,0,0,0});
        n.setPC1(0);
        n.setPC2(0);
        n.setEF(0);

        n.calcularPromedio();
    }

    // mostrar notas en consola (debug)
    public void mostrarNotas(Estudiante e, String curso){
        for(int i=1; i<=4; i++){
            Bimestre b = e.getBimestre(i);
            Bimestre.NotasPorCurso n = b.getNotas(curso);

            System.out.println("Bimestre " + i);
            System.out.println("TS: "  + n.getTS()[0] + ", " +
                                         n.getTS()[1] + ", " +
                                         n.getTS()[2] + ", " +
                                         n.getTS()[3]);
            System.out.println("PC1: " + n.getPC1());
            System.out.println("PC2: " + n.getPC2());
            System.out.println("EF: "  + n.getEF());
            System.out.println("PROM:" + n.getPromedio());
            System.out.println("----------------------");
        }
    }
}

