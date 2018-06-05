package Ventanas;

import Clases.Conexion;
import Clases.Paciente;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class VerPaciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarDoctor
     */
    public VerPaciente() {
        initComponents();
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ver Paciente");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435355589_floppy.png"))); // NOI18N
        jButton2.setText("Modificar");
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

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel1.setText("Buscar:");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1439253074_power_off.png"))); // NOI18N
        jButton4.setText("Activar/Desactivar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1252, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 1288, 510);
    }// </editor-fold>//GEN-END:initComponents

    public void Expediente(int ID_P, String Paciente) {

        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("IDPaciente", ID_P);

        File miDir = new File("");

        String reporte = miDir.getAbsolutePath() + "/src/Reportes/Expediente.jasper";

        JasperPrint jp = null;
        try {
            jp = JasperFillManager.fillReport(reporte, parametros, Conexion.con);
        } catch (JRException ex) {

            //   Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        JasperViewer view = new JasperViewer(jp, false);
        view.setTitle("Expediente - " + Paciente.trim());

        view.setZoomRatio((float) 0.95);
        view.setVisible(true);

        view.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        view.toFront();

    }

    public void Modificar() {

        int Fila = jTable1.getSelectedRow();

        //   System.out.println("Fila "+Fila);
        if (Fila >= 0) {

            int ID = Integer.parseInt(model.getValueAt(Fila, 0).toString());

            ModificarPaciente MP = new ModificarPaciente(null, true);
            MP.CargarDatos(ID);
            MP.setVP(this);
            MP.setVisible(true);

//        this.toBack();
//        ME.toFront();
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el registro a modificar",
                    "Seleccione", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Modificar();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    ResultSet resultado;

    public void CargarDatos() {
        model.setRowCount(0);

        String[] Header = {"No.", "Nombres", "Apellidos", "Telefono", "Genero",
            "Cedula", "Correo", "Estado"};
        model.setColumnIdentifiers(Header);

        String[] Datos = new String[11];

        try {

            resultado = Conexion.consulta("Select * from Paciente");

            while (resultado.next()) {
                Datos[0] = String.valueOf(resultado.getInt(1));
                Datos[1] = resultado.getString(2);
                Datos[2] = resultado.getString(3);
                Datos[3] = resultado.getString(4);
                Datos[4] = resultado.getString(5);
                Datos[5] = resultado.getString(7);
                Datos[6] = resultado.getString(8);

                boolean Estado = resultado.getBoolean(6);
                String Estate = "Inactivo";

                if (Estado) {
                    Estate = "Activo";
                }
                Datos[7] = Estate;

                model.addRow(Datos);
            }

        } catch (SQLException ex) {

        }

        jTable1.setModel(model);

    }

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        CargarDatos();
// TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    public void ActDes() {

        int Fila = jTable1.getSelectedRow();
        int Col = 10;

        //   System.out.println("Fila "+Fila);
        if (Fila >= 0) {

            int ID = Integer.parseInt(model.getValueAt(Fila, 0).toString());
            String Estado = model.getValueAt(Fila, Col).toString();

            if (Estado.equalsIgnoreCase("Activo")) {
                Paciente.Desactivar_Paciente(ID); //Des  
            }
            if (Estado.equalsIgnoreCase("Inactivo")) {
                Paciente.Activar_Paciente(ID);  //Act
            }

            CargarDatos();

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el registro a Activar/Desactivar",
                    "Seleccione", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ActDes();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    public void Buscar() {

        String Buscar = txtBuscar.getText();

        model.setRowCount(0);

        String[] Header = {"No.", "Nombres", "Apellidos", "Telefono", "Género",
            "Cédula", "Correo", "Estado"};
        model.setColumnIdentifiers(Header);

        String[] Datos = new String[11];

        try {

            resultado = Conexion.consulta("Select * from Paciente where Nombres like '%" + Buscar + "%' "
                    + "or Apellidos like '%" + Buscar + "%'");

            while (resultado.next()) {
                Datos[0] = String.valueOf(resultado.getInt(1));
                Datos[1] = resultado.getString(2);
                Datos[2] = resultado.getString(3);
                Datos[3] = resultado.getString(4);
                Datos[4] = resultado.getString(5);
                Datos[5] = resultado.getString(7);
                Datos[6] = resultado.getString(8);

                boolean Estado = resultado.getBoolean(6);
                String Estate = "Inactivo";

                if (Estado) {
                    Estate = "Activo";
                }
                Datos[7] = Estate;

                model.addRow(Datos);
            }

        } catch (SQLException ex) {

        }

        jTable1.setModel(model);

    }


    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        Buscar();        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyReleased

    public void VerExpediente() {

        int Fila = jTable1.getSelectedRow();

        //   System.out.println("Fila "+Fila);
        if (Fila >= 0) {

            int ID = Integer.parseInt(model.getValueAt(Fila, 0).toString());

            String Paciente = model.getValueAt(Fila, 1).toString().trim() + " " + model.getValueAt(Fila, 2).toString().trim();

            Expediente(ID, Paciente);

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el registro a modificar",
                    "Seleccione", JOptionPane.ERROR_MESSAGE);
        }

    }

    DefaultTableModel model = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int row, int column) {

            return false;
        }

    };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
