/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Cita;
import Clases.Conexion;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Clases.Consulta;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author UNI
 */
public class AgregarDiagnostico extends javax.swing.JDialog {

    /**
     * Creates new form AgregarDiagnostico
     */
    public AgregarDiagnostico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsulta = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtReceta = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDr = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Consulta | Diagnostico | Receta | Archivos al expediente");

        jLabel14.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel14.setText("Consulta(*)");

        txtConsulta.setColumns(20);
        txtConsulta.setRows(5);
        txtConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtConsulta);

        jLabel15.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel15.setText("Diagnostico(*)");

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(5);
        txtDiagnostico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiagnosticoKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtDiagnostico);

        jLabel16.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel16.setText("Receta(*)");

        txtReceta.setColumns(20);
        txtReceta.setRows(5);
        jScrollPane3.setViewportView(txtReceta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435355589_floppy.png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435355601_sign-error.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(10, 10, 10)
                        .addComponent(jButton3))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel7.setText("Paciente");

        txtPaciente.setEditable(false);
        txtPaciente.setDoubleBuffered(true);

        jLabel10.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel10.setText("Doctor");

        txtDr.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtDr, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(78, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(79, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDr, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(552, 552, 552))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(78, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String Paciente;
    private String Medico;
    private int ID_Cita = 0;
    private AgregarConsulta AC;

    public void setAC(AgregarConsulta AC) {
        this.AC = AC;
    }

    public void setPaciente(String Paciente) {
        this.Paciente = Paciente;
    }

    public void setMedico(String Medico) {
        this.Medico = Medico;
    }

    public void setID_Cita(int ID_Cita) {
        this.ID_Cita = ID_Cita;
    }

    public void MostrarDrPaciente() {
        txtDr.setText(Medico);
        txtPaciente.setText(Paciente);
    }

    public void Guardar() {
        String ConsultaF = txtConsulta.getText().trim();
        String Diagnostico = txtDiagnostico.getText().trim();
        String Receta = txtReceta.getText().trim();

        if (ID_Cita == 0 || ("".equals(ConsultaF) && "".equals(Diagnostico) && "".equals(Receta))) {
            JOptionPane.showMessageDialog(this, "Complete los campos necesarios",
                    "Complete", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Consulta.Agregar_Consulta(ID_Cita, ConsultaF, Diagnostico, Receta);
        Cita.Cita_Atendida(ID_Cita);
        
        AC.dispose();
        
        this.setVisible(false);
        
          Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("ID_C", ID_Cita);

          
        File miDir = new File ("");
        
        String reporte = miDir.getAbsolutePath()+"/src/Reportes/Receta.jasper";

        JasperPrint jp = null;
        try {
            jp = JasperFillManager.fillReport(reporte, parametros, Conexion.con);
        } catch (JRException ex) {

            //   Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        JasperViewer view = new JasperViewer(jp, false);
        view.setTitle("Receta - "+Paciente.trim());

        view.setZoomRatio((float) 0.95);
        view.setVisible(true);

        view.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        view.toFront();
        
        
        
        CopiarArchivos();
        
        this.dispose();

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Guardar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    int returnVal = 1;
    File[] files;

      public void CopiarArchivos() {

        if (returnVal == JFileChooser.APPROVE_OPTION) {

            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyy hh_mm a");
            String Fecha = sdf.format(date);
            String carpeta = "/Expedientes/" + Paciente.trim() + "/Cita_" + ID_Cita + "_Fecha_" + Fecha;
            String SO = System.getProperty("os.name");
            CharSequence windows = "windows";
            if (SO.toLowerCase().contains(windows)) {

                carpeta = carpeta.replace('/', '\\');
            }
            File ruta = new File("");
            String ruta_carpeta = ruta.getAbsolutePath() + carpeta;

            File folder = new File(ruta_carpeta);

            if (!folder.exists()) {
                folder.mkdirs();
            }

            CopyOption[] options = new CopyOption[]{
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES
            };

            for (File file : files) {
                String ruta_archivo_destino = ruta_carpeta + "/" + file.getName();

                if (SO.toLowerCase().contains(windows)) {

                    ruta_archivo_destino = ruta_archivo_destino.replace('/', '\\');
                }
                Path TO = Paths.get(ruta_archivo_destino);
                Path FROM = Paths.get(file.getAbsolutePath());

                //   File target = new File("/"+file.getName());
                try {
                    Files.copy(FROM, TO, options);
                    // Files.copy(Paths.get(System.getProperty("user.dir"),ruta_carpeta), file.toPath());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Archivos No guardados en el expediente " + Paciente.trim() + ""
                            + "en la carpeta Cita_" + ID_Cita + "_Fecha_" + Fecha,
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;

                }

            }

            JOptionPane.showMessageDialog(this, "Archivos guardados en el expediente de " + Paciente.trim() + ""
                    + "en la carpeta Cita_" + ID_Cita + "_Fecha_" + Fecha,
                    "Guardado", JOptionPane.INFORMATION_MESSAGE);

            int opcion = JOptionPane.showConfirmDialog(this, "Desea ver los archivos del expediente?", "Ver archivos", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                Desktop desktop = null;

                if (Desktop.isDesktopSupported()) {
                    desktop = Desktop.getDesktop();
                }
                try {
                    desktop.open(folder);
                } catch (IOException e) {
                }
            }
        }

    }

    private void txtConsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaKeyTyped
if(evt.getKeyChar() == KeyEvent.VK_TAB){
  txtDiagnostico.requestFocus();
}
        
// TODO add your handling code here:
    }//GEN-LAST:event_txtConsultaKeyTyped

    private void txtDiagnosticoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiagnosticoKeyTyped
if(evt.getKeyChar() == KeyEvent.VK_TAB){
  txtReceta.requestFocus();
}        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiagnosticoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarDiagnostico dialog = new AgregarDiagnostico(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtConsulta;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtDr;
    private javax.swing.JTextField txtPaciente;
    private javax.swing.JTextArea txtReceta;
    // End of variables declaration//GEN-END:variables
}
