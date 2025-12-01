
package vista;

import modelo.Profesor;
import control.AppData;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class FrmRegistrarProfesor extends javax.swing.JInternalFrame {


    private boolean camposVacios(String... campos) {
        for (String c : campos) {
            if (c == null || c.trim().isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
   public FrmRegistrarProfesor() {
        initComponents();


        cmbGrado.removeAllItems();
        for (int i = 1; i <= 6; i++) {
            cmbGrado.addItem(String.valueOf(i));
        }

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
        labelRegistrarProf = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        cmbGrado = new javax.swing.JComboBox<>();
        cmbSeccion = new javax.swing.JComboBox<>();
        btnRegistrarProfesor = new javax.swing.JButton();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelDni = new javax.swing.JLabel();
        labelGrado = new javax.swing.JLabel();
        labelSeccion = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(469, 365));

        labelRegistrarProf.setText("Registrar profesor y salón:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        cmbGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnRegistrarProfesor.setText("Registrar profesor");
        btnRegistrarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProfesorActionPerformed(evt);
            }
        });

        labelNombre.setText("Nombre:");

        labelApellido.setText("Apellido:");

        labelDni.setText("DNI:");

        labelGrado.setText("Grado:");

        labelSeccion.setText("Sección:");

        labelCodigo.setText("Código (obligatorio):");

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

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Mofidicar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDni)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelNombre)
                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelApellido)
                        .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtDni, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelCodigo)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnBuscar)))
                    .addComponent(labelRegistrarProf))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelGrado)
                    .addComponent(cmbSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSeccion)
                    .addComponent(cmbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 42, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrarProfesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRegistrarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCodigo)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelApellido))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelGrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelSeccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarProfesor)
                    .addComponent(btnSalir)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProfesorActionPerformed

        String codigo = txtCodigo.getText().trim();
        String nom = txtNombre.getText().trim();
        String ape = txtApellido.getText().trim();
        String dni = txtDni.getText().trim();
        int grado = Integer.parseInt(cmbGrado.getSelectedItem().toString());
        String seccion = cmbSeccion.getSelectedItem().toString();

        if (camposVacios(nom, ape, dni, codigo)) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.");
            return;
        }

        if(AppData.getInstance().getGP().dniExiste(dni) || AppData.getInstance().getGP().buscarPorCodigo(codigo) != null){
            JOptionPane.showMessageDialog(this, "El DNI o código ya está registrado.");
            return;
        }
        if(AppData.getInstance().getGP().salonOcupado(grado, seccion)){
            JOptionPane.showMessageDialog(this, "Este salón YA tiene un profesor asignado.");
            return;
        }

        Profesor nuevo = new Profesor(nom, ape, dni, codigo, grado, seccion);
        AppData.getInstance().getGP().registrarProfesor(nuevo);
        
        JOptionPane.showMessageDialog(this, "Profesor registrado correctamente.");

        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        txtCodigo.setText("");
    }//GEN-LAST:event_btnRegistrarProfesorActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
           String codigo = txtCodigo.getText().trim();

    if (codigo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese un código para eliminar.");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(
            this,
            "¿Seguro que deseas eliminar al profesor?",
            "Confirmar",
            JOptionPane.YES_NO_OPTION
    );

    if (confirm != JOptionPane.YES_OPTION) return;

    boolean eliminado = AppData.getInstance().getGP().eliminarProfesor(codigo);

    if (eliminado) {
        JOptionPane.showMessageDialog(this, "Profesor eliminado correctamente.");

        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        txtCodigo.setText("");
    } else {
        JOptionPane.showMessageDialog(this, "No existe un profesor con ese código.");
    }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigo = txtCodigo.getText().trim();

        if(codigo.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese un código para buscar.");
            return;
        }

        Profesor p = AppData.getInstance().getGP().buscarPorCodigo(codigo);

        if(p == null){
            JOptionPane.showMessageDialog(this, "No existe un profesor con ese código.");
            return;
        }

        // Actualizar campos del formulario
        txtNombre.setText(p.getNombre());
        txtApellido.setText(p.getApellido());
        txtDni.setText(p.getDni());
        cmbGrado.setSelectedItem(String.valueOf(p.getGradoP()));
        cmbSeccion.setSelectedItem(p.getSeccionP());
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    String codigo = txtCodigo.getText().trim();
    String nom = txtNombre.getText().trim();
    String ape = txtApellido.getText().trim();
    String dni = txtDni.getText().trim();
    int grado = Integer.parseInt(cmbGrado.getSelectedItem().toString());
    String seccion = cmbSeccion.getSelectedItem().toString();
    
    Profesor ocupante = AppData.getInstance().getGP().buscarPorSalon(grado, seccion);

    if (ocupante != null && !ocupante.getCodigoProfesor().equals(codigo)) {
        JOptionPane.showMessageDialog(this, 
            "Ese salón ya está asignado a otro profesor.");
        return;
    }
    
    if (camposVacios(codigo, nom, ape, dni)) {
        JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.");
        return;
    }

    Profesor existente = AppData.getInstance().getGP().buscarPorCodigo(codigo);
    if (existente == null) {
        JOptionPane.showMessageDialog(this, "El código no existe. Use Buscar primero.");
        return;
    }

    Profesor nuevosDatos = new Profesor(nom, ape, dni, codigo, grado, seccion);

    boolean ok = AppData.getInstance().getGP().actualizarProfesor(codigo, nuevosDatos);

    if (ok) {
        JOptionPane.showMessageDialog(this, "Datos actualizados correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "Error al actualizar los datos.");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrarProfesor;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbGrado;
    private javax.swing.JComboBox<String> cmbSeccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDni;
    private javax.swing.JLabel labelGrado;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelRegistrarProf;
    private javax.swing.JLabel labelSeccion;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}