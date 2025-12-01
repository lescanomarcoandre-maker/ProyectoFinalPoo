package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class AppData implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private static AppData instance;
    
    private GestorProfesores gp = new GestorProfesores();
    private GestorEstudiantes ge = new GestorEstudiantes();
    private GestorAsistencias ga = new GestorAsistencias();
    private GestorNotas gn = new GestorNotas();
    
    
    private HashMap<String, HashMap<Integer, char[]>> asis = new HashMap<>();
    private HashMap<String, HashMap<String, char[]>> asisCurso = new HashMap<>();
    
    public GestorProfesores getGP(){ return gp; }
    public GestorEstudiantes getGE(){ return ge; }
    public GestorAsistencias getGA(){ return ga; }
    public GestorNotas getGN(){ return gn; }

    public HashMap<String, HashMap<Integer, char[]>> getAsis(){ return asis; }
    public HashMap<String, HashMap<String, char[]>> getAsisCurso(){ return asisCurso; }
    
    private static File getDataFile() {
        String base = System.getProperty("user.home")
                + File.separator + "Documents"
                + File.separator + "proyectoFinalData";

        File dir = new File(base);
        if (!dir.exists()) dir.mkdirs();

        return new File(dir, "appdata.dat");
    }
    
    public static AppData cargarDatos(){
        File archivo = getDataFile();

        if (!archivo.exists()) {
            AppData nueva = new AppData();
            nueva.restaurarGestores();
            return nueva;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            Object o = ois.readObject();
            if (o instanceof AppData data) {
                data.restaurarGestores();
                return data;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        AppData nueva = new AppData();
        nueva.restaurarGestores();
        return nueva;
    }
    
    public void guardarDatos(){
        File archivo = getDataFile();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(this);
            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar datos: " + e.getMessage());
        }
    }
    
    private void restaurarGestores() {
        if (gp == null) gp = new GestorProfesores();
        if (ge == null) ge = new GestorEstudiantes();
        if (ga == null) ga = new GestorAsistencias();
        if (gn == null) gn = new GestorNotas();
    }
    
    public static void setInstance(AppData data){
        instance = data;
    }

    public static AppData getInstance(){
        if(instance == null){
            instance = cargarDatos();
        }
        return instance;
    }
    
}
