
package vista;

import modelo.Profesor;
import control.AppData;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JFMenu extends javax.swing.JFrame {
    
    public JFMenu() {
        initComponents();
        
        AppData data = AppData.cargarDatos();
        AppData.setInstance(data);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                AppData.getInstance().guardarDatos();
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mRegistrar = new javax.swing.JMenu();
        iRegEst = new javax.swing.JMenuItem();
        iRegDoc = new javax.swing.JMenuItem();
        mSalones = new javax.swing.JMenu();
        iReporteSalones = new javax.swing.JMenuItem();
        mNotas = new javax.swing.JMenu();
        iRegistrarNotas = new javax.swing.JMenuItem();
        mAsistencias = new javax.swing.JMenu();
        iRegistrarAsistencias = new javax.swing.JMenuItem();
        mSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setForeground(new java.awt.Color(62, 67, 76));
        jDesktopPane1.setToolTipText("");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );

        jDesktopPane2.setForeground(new java.awt.Color(62, 67, 76));
        jDesktopPane2.setToolTipText("");

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenuBar1.setForeground(new java.awt.Color(62, 67, 76));

        mRegistrar.setText("Registrar");

        iRegEst.setText("Registrar Estudiantes");
        iRegEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iRegEstActionPerformed(evt);
            }
        });
        mRegistrar.add(iRegEst);

        iRegDoc.setText("Registrar Docentes");
        iRegDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iRegDocActionPerformed(evt);
            }
        });
        mRegistrar.add(iRegDoc);

        jMenuBar1.add(mRegistrar);

        mSalones.setText("Salones");

        iReporteSalones.setText("Reporte de Salones");
        iReporteSalones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iReporteSalonesActionPerformed(evt);
            }
        });
        mSalones.add(iReporteSalones);

        jMenuBar1.add(mSalones);

        mNotas.setText("Notas");

        iRegistrarNotas.setText("Registrar Notas");
        iRegistrarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iRegistrarNotasActionPerformed(evt);
            }
        });
        mNotas.add(iRegistrarNotas);

        jMenuBar1.add(mNotas);

        mAsistencias.setText("Asistencias");

        iRegistrarAsistencias.setText("Registrar Asistencias");
        iRegistrarAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iRegistrarAsistenciasActionPerformed(evt);
            }
        });
        mAsistencias.add(iRegistrarAsistencias);

        jMenuBar1.add(mAsistencias);

        mSalir.setText("Salir");
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuItemSalir.setText("Salir del Sistema");

        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });

        mSalir.add(jMenuItemSalir);
        jMenuBar1.add(mSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jDesktopPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iRegDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iRegDocActionPerformed
        FrmRegistrarProfesor frm = new FrmRegistrarProfesor();
        jDesktopPane1.add(frm);  
        frm.setVisible(true);    
    }//GEN-LAST:event_iRegDocActionPerformed

    private void iReporteSalonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iReporteSalonesActionPerformed
      FrmReporteSalones frm = new FrmReporteSalones();
      jDesktopPane1.add(frm);
      frm.setVisible(true);
    }//GEN-LAST:event_iReporteSalonesActionPerformed

    private void iRegistrarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iRegistrarNotasActionPerformed
        
        Profesor profTemp = new Profesor(
            " ",
            " ",
            " ",
            " ",
            0,
            " "
        );

        FrmRegistroNotas frm = new FrmRegistroNotas(
            profTemp,   // profesor por defecto (NO null)
            0,          // bimestre
            " "         // seccion
        );
        jDesktopPane1.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_iRegistrarNotasActionPerformed

    private void iRegEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iRegEstActionPerformed
        FrmRegistrarEstudiante frm = new FrmRegistrarEstudiante();
        jDesktopPane1.add(frm);  
        frm.setVisible(true);    
    }//GEN-LAST:event_iRegEstActionPerformed

    private void iRegistrarAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iRegistrarAsistenciasActionPerformed
        // TODO add your handling code here:
        Profesor profTemp = new Profesor("","", "", "", 0,"");
        FrmRegistroAsistencia frm = new FrmRegistroAsistencia(profTemp, 0, "");
        jDesktopPane1.add(frm);  
        frm.setVisible(true);    
    }//GEN-LAST:event_iRegistrarAsistenciasActionPerformed

    
    public static void main(String args[]) {

    /* ACTIVAR NIMBUS */
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (Exception e) {
        System.out.println("No se pudo activar Nimbus : " + e.getMessage());
    }
    
    /* POPO */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new JFMenu().setVisible(true);
        }
    });
    }
    
    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {                                              
        int r = javax.swing.JOptionPane.showConfirmDialog(
            this,
            "¿Seguro que deseas salir?",
            "Confirmar salida",
            javax.swing.JOptionPane.YES_NO_OPTION
        );

        if (r == javax.swing.JOptionPane.YES_OPTION) {
            AppData.getInstance().guardarDatos();
            System.exit(0);
        }
}
    
    private javax.swing.JMenuItem jMenuItemSalir;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem iRegDoc;
    private javax.swing.JMenuItem iRegEst;
    private javax.swing.JMenuItem iRegistrarAsistencias;
    private javax.swing.JMenuItem iRegistrarNotas;
    private javax.swing.JMenuItem iReporteSalones;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mAsistencias;
    private javax.swing.JMenu mNotas;
    private javax.swing.JMenu mRegistrar;
    private javax.swing.JMenu mSalir;
    private javax.swing.JMenu mSalones;
    // End of variables declaration//GEN-END:variables
}
