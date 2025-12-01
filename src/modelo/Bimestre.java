package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Bimestre implements Serializable {
    private static final long serialVersionUID = 1L;

    // Mapas
    private HashMap<String, NotasPorCurso> cursos = new HashMap<>();
    private HashMap<String, AsistenciasPorCurso> asistenciasCursos = new HashMap<>();

    // Constructor
    public Bimestre() {
        cursos = new HashMap<>();
        asistenciasCursos = new HashMap<>();
    }

    // Métodos para obtener o crear notas de un curso
    public NotasPorCurso getNotas(String curso) {
        return cursos.computeIfAbsent(curso, c -> new NotasPorCurso());
    }

    // Métodos para obtener o crear asistencias de un curso
    public AsistenciasPorCurso getAsistenciaCurso(String curso) {
        return asistenciasCursos.computeIfAbsent(curso, c -> new AsistenciasPorCurso());
    }

    // Clases internas serializables
    public static class NotasPorCurso implements Serializable {
        private static final long serialVersionUID = 1L;

        private double[] ts = new double[4]; // Trabajos
        private double pc1;
        private double pc2;
        private double ef;
        private double prom;

        public double[] getTS() { return ts; }
        public void setTS(double[] ts) { this.ts = ts; }

        public double getPC1() { return pc1; }
        public void setPC1(double pc1) { this.pc1 = pc1; }

        public double getPC2() { return pc2; }
        public void setPC2(double pc2) { this.pc2 = pc2; }

        public double getEF() { return ef; }
        public void setEF(double ef) { this.ef = ef; }

        public double getPromedio() { return prom; }

        public void calcularPromedio() {
            prom = (ts[0] + ts[1] + ts[2] + ts[3] + pc1 + pc2 + ef) / 7.0;
        }
    }

    public static class AsistenciasPorCurso implements Serializable {
        private static final long serialVersionUID = 1L;

        private ArrayList<String> fechas = new ArrayList<>();
        private ArrayList<Boolean> presentes = new ArrayList<>();

        public void registrar(String fecha, boolean presente) {
            fechas.add(fecha);
            presentes.add(presente);
        }

        public ArrayList<String> getFechas() { return fechas; }
        public ArrayList<Boolean> getPresentes() { return presentes; }
    }
}
