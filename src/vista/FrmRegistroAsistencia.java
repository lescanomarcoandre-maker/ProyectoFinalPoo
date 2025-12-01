package vista;

import modelo.Profesor;
import modelo.Estudiante;
import modelo.Bimestre;
import control.AppData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmRegistroAsistencia extends javax.swing.JInternalFrame {

    private Profesor profesor;
    private int grado;
    private String seccion;
    private boolean busco = false;
    
    private boolean inicializando = true;  // FLAG temporal

    public FrmRegistroAsistencia(Profesor profesor, int grado, String seccion) {
        initComponents();

        this.profesor = profesor;
        this.grado = grado;
        this.seccion = seccion;

        // llenar combos
        cmbBimestre.removeAllItems();
        for (int i = 1; i <= 4; i++) cmbBimestre.addItem(String.valueOf(i));
        cmbBimestre.setSelectedIndex(0);  // seleccion por defecto

        cmbCurso.removeAllItems();
        
        cmbCurso.removeAllItems();
        for(String c : profesor.getCursos()){
            cmbCurso.addItem(c);
        }
        
        cmbCurso.setSelectedIndex(0); // seleccion por defecto

        cmbDia.removeAllItems();
        for (int i = 1; i <= 40; i++) cmbDia.addItem(String.valueOf(i));
        cmbDia.setSelectedIndex(0);  // seleccion por defecto

        lblGrado.setText("Grado: " + grado);
        lblSeccion.setText("Sección: " + seccion);

        inicializando = false;  //aqui ya terminó la inicialización
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCurso = new javax.swing.JLabel();
        lblGrado = new javax.swing.JLabel();
        lblSeccion = new javax.swing.JLabel();
        lblBimestre = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAsistencia = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbBimestre = new javax.swing.JComboBox<>();
        cmbCurso = new javax.swing.JComboBox<>();
        lblCodigoProfesor = new javax.swing.JLabel();
        txtCodigoProfesor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblDia = new javax.swing.JLabel();
        cmbDia = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCurso.setText("Curso:");

        lblGrado.setText("Grado: ");

        lblSeccion.setText("Sección: ");

        lblBimestre.setText("Bimestre:");

        lblWelcome.setText("Registrar asistencia:");

        tblAsistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CÓDIGOS", "NOMBRES", "APELLIDOS", "ASISTENCIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAsistencia);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cmbBimestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbBimestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBimestreActionPerformed(evt);
            }
        });

        cmbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursoActionPerformed(evt);
            }
        });

        lblCodigoProfesor.setText("Código:");

        txtCodigoProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProfesorActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblDia.setText("Día:");

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWelcome)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblGrado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSeccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblBimestre)
                                            .addComponent(lblCurso))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbBimestre, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodigoProfesor)
                                    .addComponent(lblDia))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigoProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(cmbDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBimestre)
                    .addComponent(cmbBimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoProfesor)
                    .addComponent(txtCodigoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDia))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCurso)))
                .addGap(18, 18, 18)
                .addComponent(lblSeccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblAsistencia.getModel();
        
        // Obtener los valores seleccionados
        int bim = Integer.parseInt(cmbBimestre.getSelectedItem().toString());
        int dia = Integer.parseInt(cmbDia.getSelectedItem().toString()) - 1;
        String curso = cmbCurso.getSelectedItem().toString();
        
        // Iterar sobre las filas de la tabla y guardar los valores de asistencia
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String codEst = modelo.getValueAt(i, 0).toString();
            String valor = (modelo.getValueAt(i, 3) + "").trim().toUpperCase();
            
            if (!valor.equals("A") && !valor.equals("F")) {
                JOptionPane.showMessageDialog(this, "Fila " + (i + 1) + ": ingrese A o F.");
                return;
            }
            
            // Crear la estructura de asistencia si no existe
            Estudiante est = AppData.getInstance().getGE().buscarPorCodigo(codEst);

            Bimestre.AsistenciasPorCurso asisCurso =
                    est.getBimestre(bim).getAsistenciaCurso(curso);

            boolean presente = valor.equals("A");
            
            // Si el día ya existe, reemplazarlo
            if (dia < asisCurso.getPresentes().size()) {
                asisCurso.getPresentes().set(dia, presente);
            } else {
                // Rellenar días faltantes con present=false hasta llegar al día actual
                while (asisCurso.getPresentes().size() < dia) {
                    asisCurso.registrar("Día " + (asisCurso.getPresentes().size() + 1), false);
                }
                asisCurso.registrar("Día " + (dia + 1), presente);
            }
        }
        
        // mostrar mensaje de confirmación
        JOptionPane.showMessageDialog(this, "Asistencia guardada.");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmbBimestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBimestreActionPerformed
        // TODO add your handling code here:
        actualizarTablaSiYaBusco();
    }//GEN-LAST:event_cmbBimestreActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigo = txtCodigoProfesor.getText().trim();

        if(codigo.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese un código de profesor.");
            return;
        }

        // buscar profesor
        Profesor prof = AppData.getInstance().getGP().buscarPorCodigo(codigo);

        if(prof == null){
            JOptionPane.showMessageDialog(this, "No se encontró el profesor.");
            return;
        }

        // actualizar profesor en formulario
        this.profesor = prof;

        // recargar cursos
        cmbCurso.removeAllItems();
        if(prof.getCursos() != null){
            for(String c : prof.getCursos()){
                cmbCurso.addItem(c);
            }
        }
        cmbCurso.setSelectedIndex(0);

        // validaciones de selección
        if(cmbCurso.getSelectedItem() == null){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un curso.");
            return;
        }

        // obtener curso, bimestre y día
        String curso = cmbCurso.getSelectedItem().toString();
        int bimestre = Integer.parseInt(cmbBimestre.getSelectedItem().toString());
        int dia = Integer.parseInt(cmbDia.getSelectedItem().toString()) - 1;

        // limpiar tabla
        DefaultTableModel modelo = (DefaultTableModel) tblAsistencia.getModel();
        modelo.setRowCount(0);

        // cargar estudiantes del salón
        for(Estudiante est : AppData.getInstance().getGE().listarPorSalon(prof.getGradoP(), prof.getSeccionP())){
            Bimestre.AsistenciasPorCurso asisCurso =
                    est.getBimestre(bimestre).getAsistenciaCurso(curso);

            String asist = "";
            if(dia < asisCurso.getPresentes().size()){
                asist = asisCurso.getPresentes().get(dia) ? "A" : "F";
            }

            modelo.addRow(new Object[]{
                est.getCodigo(),
                est.getNombre(),
                est.getApellido(),
                asist
            });
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    private void actualizarTablaSiYaBusco() {
        // verificar si el código del profesor fue ingresado
        if (txtCodigoProfesor.getText().trim().isEmpty()) return;

        // buscar el profesor
        Profesor p = AppData.getInstance().getGP().buscarPorCodigo(txtCodigoProfesor.getText().trim());
        if (p == null) return;
        
        // obtiene el curso y el bimestre seleccionados
        if(cmbCurso.getSelectedItem() == null){
            return; // evita el crash
        }
        String curso = cmbCurso.getSelectedItem().toString();
        String bimestre = cmbBimestre.getSelectedItem().toString();

        DefaultTableModel modelo = (DefaultTableModel) tblAsistencia.getModel();
        modelo.setRowCount(0);  // limpia la tabla antes de cargar los datos

        // sirve para buscar estudiantes y cargar su asistencia para el curso seleccionado
        for (Estudiante est : AppData.getInstance().getGE().listarPorSalon(p.getGradoP(), p.getSeccionP())) {
            // crea estructura de asistencia si no existe
            int dia = Integer.parseInt(cmbDia.getSelectedItem().toString()) - 1;

            Bimestre.AsistenciasPorCurso asisCurso =
                    est.getBimestre(Integer.parseInt(bimestre))
                       .getAsistenciaCurso(curso);

            String asist = "";

            if (dia < asisCurso.getPresentes().size()) {
                asist = asisCurso.getPresentes().get(dia) ? "A" : "F";
            }
            
            // agregar una fila en la tabla con la información de asistencia
            modelo.addRow(new Object[]{
                est.getCodigo(),
                est.getNombre(),
                est.getApellido(),
                asist
            });
        }
    }
    
    private void txtCodigoProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProfesorActionPerformed

    private void cmbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoActionPerformed
        if(cmbCurso.getSelectedItem() == null){
            return;  // evita llamar actualizarTabla con un item vacío
        }

        actualizarTablaSiYaBusco();
    }//GEN-LAST:event_cmbCursoActionPerformed

    private void cmbDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDiaActionPerformed
        // TODO add your handling code here:
        actualizarTablaSiYaBusco();
    }//GEN-LAST:event_cmbDiaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbBimestre;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBimestre;
    private javax.swing.JLabel lblCodigoProfesor;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblGrado;
    private javax.swing.JLabel lblSeccion;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTable tblAsistencia;
    private javax.swing.JTextField txtCodigoProfesor;
    // End of variables declaration//GEN-END:variables
}
