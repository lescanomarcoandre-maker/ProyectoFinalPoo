package vista;

import modelo.Estudiante;
import control.AppData;
import javax.swing.JOptionPane;

public class FrmRegistrarEstudiante extends javax.swing.JInternalFrame {
    
    
    public FrmRegistrarEstudiante() {
        initComponents();
        
        // Grados 1 a 6
        cmbGrado.removeAllItems();
        for(int i = 1; i <= 6; i++) {
            cmbGrado.addItem(String.valueOf(i));
        }

        // Secciones
        cmbSeccion.removeAllItems();
        cmbSeccion.addItem("A");
        cmbSeccion.addItem("B");
        cmbSeccion.addItem("C");
        cmbSeccion.addItem("D");
        
        System.out.println("Instance hash: " + AppData.getInstance().hashCode());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        labelRegistrarEst = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        cmbGrado = new javax.swing.JComboBox<>();
        cmbSeccion = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelDni = new javax.swing.JLabel();
        labelGrado = new javax.swing.JLabel();
        labelSeccion = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(433, 377));

        labelRegistrarEst.setText("Registrar estudiante:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        cmbGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        labelNombre.setText("Nombre:");

        labelApellido.setText("Apellido:");

        labelDni.setText("DNI:");

        labelGrado.setText("Grado:");

        labelSeccion.setText("Sección:");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(labelRegistrarEst)))
                .addGap(60, 60, 60)
                .addComponent(btnSalir)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addComponent(labelDni)
                    .addComponent(labelNombre)
                    .addComponent(labelApellido)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSeccion)
                    .addComponent(cmbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGrado)
                    .addComponent(cmbSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRegistrarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDni)
                    .addComponent(labelGrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(cmbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(labelSeccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean camposVacios(String... campos) {
        for (String c : campos) {
            if (c == null || c.trim().isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nom = txtNombre.getText();
        String ape = txtApellido.getText();
        String dni = txtDni.getText();
        
        if (camposVacios(nom, ape, dni)) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.");
            return;
        }
        
        int grado = Integer.parseInt(cmbGrado.getSelectedItem().toString());
        String seccion = cmbSeccion.getSelectedItem().toString();
        
        String codEst = AppData.getInstance().getGE().generarCodigo();
        
        Estudiante e = new Estudiante(nom, ape, dni, codEst, seccion);
        
        if(AppData.getInstance().getGE().dniExiste(e.getDni())){
            JOptionPane.showMessageDialog(this, "El DNI escrito ya está registrado.");
        }else{
            AppData.getInstance().getGE().registrarEstudiante(e);
            JOptionPane.showMessageDialog(this, "Estudiante registrado.\nCódigo asignado: " + codEst);
            
            txtNombre.setText("");
            txtApellido.setText("");
            txtDni.setText("");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String dni = txtDni.getText().trim();
        Estudiante e = AppData.getInstance().getGE().buscarPorDni(dni);
        if(e == null) {
            JOptionPane.showMessageDialog(this, "Estudiante no encontrado.");
            return;
        }
        String nom = txtNombre.getText().trim();
        String ape = txtApellido.getText().trim();
        int grado = Integer.parseInt(cmbGrado.getSelectedItem().toString());
        String seccion = cmbSeccion.getSelectedItem().toString();
        if(camposVacios(nom, ape, dni)) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.");
            return;
        }
        // Actualizar datos
        e.setNombre(nom);
        e.setApellido(ape);
        e.setSeccion(seccion);

        JOptionPane.showMessageDialog(this, "Datos del estudiante actualizados.");
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String dni = txtDni.getText().trim();
        Estudiante e = AppData.getInstance().getGE().buscarPorDni(dni);
        if(e == null) {
            JOptionPane.showMessageDialog(this, "Estudiante no encontrado.");
            return;
        }

        int opc = JOptionPane.showConfirmDialog(this, "¿Desea eliminar al estudiante?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if(opc == JOptionPane.YES_OPTION) {
            AppData.getInstance().getGE().eliminarEstudiante(e);
            JOptionPane.showMessageDialog(this, "Estudiante eliminado.");

            // Limpiar campos
            txtNombre.setText("");
            txtApellido.setText("");
            txtDni.setText("");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String dni = txtDni.getText().trim();
        if(dni.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un DNI para buscar.");
            return;
        }

        Estudiante e = AppData.getInstance().getGE().buscarPorDni(dni);
        if(e != null) {
            txtNombre.setText(e.getNombre());
            txtApellido.setText(e.getApellido());
            cmbSeccion.setSelectedItem(e.getSeccion());
            JOptionPane.showMessageDialog(this, "Estudiante encontrado.");
        } else {
            JOptionPane.showMessageDialog(this, "Estudiante no encontrado.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbGrado;
    private javax.swing.JComboBox<String> cmbSeccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelDni;
    private javax.swing.JLabel labelGrado;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelRegistrarEst;
    private javax.swing.JLabel labelSeccion;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}