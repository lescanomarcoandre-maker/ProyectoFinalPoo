
package vista;

import modelo.Profesor;
import modelo.Estudiante;
import modelo.Bimestre;
import control.AppData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmRegistroNotas extends javax.swing.JInternalFrame {
    
    private Profesor profesor;
    private String seccion;
    private int bimestre;
    private int grado;
    
    public FrmRegistroNotas(Profesor profesor, int grado, String seccion) {
        initComponents();

        this.profesor = profesor;
        this.seccion = seccion;
        this.grado = grado;
        
        // Mostrar datos fijos
        cmbCurso.removeAllItems();
        
        for(String c : profesor.getCursos()){
            cmbCurso.addItem(c);
        }
        
        cmbBimestre.removeAllItems();
        for (int i = 1; i <= 4; i++) {
            cmbBimestre.addItem(String.valueOf(i));
        }
        
        lblSeccion.setText("Sección: ");
        lblCurso.setText("Curso:");
        lblBimestre.setText("Bimestre:");
        lblGrado.setText("Grado: ");
        
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
        tblNotas = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbBimestre = new javax.swing.JComboBox<>();
        cmbCurso = new javax.swing.JComboBox<>();
        lblCodigoProfesor = new javax.swing.JLabel();
        txtCodigoProfesor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCurso.setText("Curso:");

        lblGrado.setText("Grado: ");

        lblSeccion.setText("Sección: ");

        lblBimestre.setText("Bimestre:");

        lblWelcome.setText("Registrar notas:");

        tblNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGOS", "NOMBRES", "APELLIDOS", "TS", "PC1", "PC2", "EF", "PROM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNotas);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
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
                                .addComponent(lblCodigoProfesor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurso))
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

    private void cargarNotas(int grado, String seccion, String curso, int bim) {
        
        DefaultTableModel modelo = (DefaultTableModel) tblNotas.getModel();
        modelo.setRowCount(0);

        for (Estudiante est : AppData.getInstance().getGE().listarPorSalon(grado, seccion)) {
            
            Bimestre b = est.getBimestre(bim);

            // PRIMERO obtiene las notas del curso
            Bimestre.NotasPorCurso n = b.getNotas(curso);

            // Luego crea la fila
            Object fila[] = new Object[]{
                est.getCodigo(),
                est.getNombre(),
                est.getApellido(),

                // Notas del curso
                n.getTS()[0],   // TS (promedio)
                n.getPC1(),
                n.getPC2(),
                n.getEF(),
                n.getPromedio()
            };

            modelo.addRow(fila);
        }
    }
    
    private void actualizarTablaSiYaBusco() {
        if (txtCodigoProfesor.getText().trim().isEmpty()) return;

        Profesor p = AppData.getInstance().getGP().buscarPorCodigo(txtCodigoProfesor.getText().trim());
        if (p == null) return;

        cargarNotas(
            p.getGradoP(),
            p.getSeccionP(),
            cmbCurso.getSelectedItem().toString(),
            Integer.parseInt(cmbBimestre.getSelectedItem().toString())
        );
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        int bim = Integer.parseInt(cmbBimestre.getSelectedItem().toString());
        String curso = cmbCurso.getSelectedItem().toString();

        DefaultTableModel modelo = (DefaultTableModel) tblNotas.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {

            String codEst = modelo.getValueAt(i, 0).toString();
            Estudiante est = AppData.getInstance().getGE().buscarPorCodigo(codEst);
            if (est == null) continue;

            Bimestre b = est.getBimestre(bim);

            try {
                // Leer valores de la tabla
                double ts = Double.parseDouble(modelo.getValueAt(i, 3).toString());
                double pc1 = Double.parseDouble(modelo.getValueAt(i, 4).toString());
                double pc2 = Double.parseDouble(modelo.getValueAt(i, 5).toString());
                double ef  = Double.parseDouble(modelo.getValueAt(i, 6).toString());

                // Actualizar notas
                Bimestre.NotasPorCurso n = b.getNotas(curso);

                n.setTS(new double[]{ ts, ts, ts, ts });
                n.setPC1(pc1);
                n.setPC2(pc2);
                n.setEF(ef);
                
                n.calcularPromedio();
                
                modelo.setValueAt(n.getPromedio(), i, 7);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, 
                    "Error en los datos de la fila " + (i + 1));
            }
        }

        JOptionPane.showMessageDialog(this, "Notas guardadas.");
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

        Profesor prof = AppData.getInstance().getGP().buscarPorCodigo(codigo);

        if(prof == null){
            JOptionPane.showMessageDialog(this, "No se encontró el profesor.");
            return;
        }

        // Actualizar etiquetas
        lblSeccion.setText("Sección: " + prof.getSeccionP());
        lblGrado.setText("Grado: " + prof.getGradoP());

        // Verificar curso y bimestre
        if(cmbCurso.getSelectedItem() == null){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un curso.");
            return;
        }
        if(cmbBimestre.getSelectedItem() == null){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un bimestre.");
            return;
        }

        String curso = cmbCurso.getSelectedItem().toString();
        int bimestre = Integer.parseInt(cmbBimestre.getSelectedItem().toString());

        // Limpiar tabla
        DefaultTableModel modelo = (DefaultTableModel) tblNotas.getModel();
        modelo.setRowCount(0);

        for(Estudiante est : AppData.getInstance().getGE().listarPorSalon(prof.getGradoP(), prof.getSeccionP())){
            Bimestre b = est.getBimestre(bimestre);
            Bimestre.NotasPorCurso n = b.getNotas(curso);

            modelo.addRow(new Object[]{
                est.getCodigo(),
                est.getNombre(),
                est.getApellido(),
                n.getTS()[0],
                n.getPC1(),
                n.getPC2(),
                n.getEF(),
                n.getPromedio()
            });
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCodigoProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProfesorActionPerformed

    private void cmbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoActionPerformed
        // TODO add your handling code here:
        actualizarTablaSiYaBusco();
    }//GEN-LAST:event_cmbCursoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbBimestre;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBimestre;
    private javax.swing.JLabel lblCodigoProfesor;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblGrado;
    private javax.swing.JLabel lblSeccion;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTable tblNotas;
    private javax.swing.JTextField txtCodigoProfesor;
    // End of variables declaration//GEN-END:variables
}
