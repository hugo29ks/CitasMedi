package Ventanas;

import Clases.Cita;
import Clases.Conexion;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class AgregarCita extends javax.swing.JInternalFrame {

    public AgregarCita() {
        initComponents();
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ckL = new javax.swing.JCheckBox();
        ckM = new javax.swing.JCheckBox();
        ckX = new javax.swing.JCheckBox();
        ckJ = new javax.swing.JCheckBox();
        ckV = new javax.swing.JCheckBox();
        ckS = new javax.swing.JCheckBox();
        ckD = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbMedico = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        cmbEspecialidad = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        cmbPaciente = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar Cita");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
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

        jPanel2.setLayout(new java.awt.GridLayout(3, 2));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435355686_pencil.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        jCalendar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendar1PropertyChange(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setRowHeight(40);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText(" Dias disponibles                                ");

        ckL.setText("L");
        ckL.setEnabled(false);

        ckM.setText("M");
        ckM.setEnabled(false);

        ckX.setText("X");
        ckX.setEnabled(false);

        ckJ.setText("J");
        ckJ.setEnabled(false);

        ckV.setText("V");
        ckV.setEnabled(false);

        ckS.setText("S");
        ckS.setEnabled(false);

        ckD.setText("D");
        ckD.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckL)
                .addGap(5, 5, 5)
                .addComponent(ckM)
                .addGap(5, 5, 5)
                .addComponent(ckX)
                .addGap(5, 5, 5)
                .addComponent(ckJ)
                .addGap(5, 5, 5)
                .addComponent(ckV)
                .addGap(5, 5, 5)
                .addComponent(ckS)
                .addGap(5, 5, 5)
                .addComponent(ckD)
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ckL)
                        .addComponent(jLabel1))
                    .addComponent(ckM)
                    .addComponent(ckX)
                    .addComponent(ckJ)
                    .addComponent(ckV)
                    .addComponent(ckS)
                    .addComponent(ckD))
                .addGap(15, 15, 15))
        );

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione la hora de la cita en la tabla de horario");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Seleccione la fecha de la cita en los dias disponibles del medico");

        cmbMedico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccione>" }));
        cmbMedico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMedicoItemStateChanged(evt);
            }
        });
        cmbMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMedicoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel11.setText("Especialidad(*)");

        cmbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccione>" }));
        cmbEspecialidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEspecialidadItemStateChanged(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel16.setText("Medico(*)");

        cmbPaciente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccione>" }));

        jLabel8.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("Paciente(*)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(8, 8, 8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)))))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(cmbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(cmbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(25, 25, 25))))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        setBounds(0, 0, 999, 625);
    }// </editor-fold>//GEN-END:initComponents

    public void Guardar() {

        int cmbPac = cmbPaciente.getSelectedIndex();
        int cmbMed = cmbMedico.getSelectedIndex();
        int ID_Paciente = ID_Pac[cmbPac];
        int ID_Medico = ID_Med[cmbMed];

        Date Fecha = jCalendar1.getDate();

        int fila = jTable1.getSelectedRow();

        if (cmbMed == 0 || cmbPac == 0 || Fecha == null) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos y seleccione correctamente",
                    "Complete", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Seleccione la hora de la cita",
                    "Seleccione", JOptionPane.ERROR_MESSAGE);
        } else {

            if (DiaDisponible()) {

                String Estado = model.getValueAt(fila, 1).toString();
                String Hora = model.getValueAt(fila, 0).toString();

                if ("No disponible".equalsIgnoreCase(Estado.trim())) {
                    JOptionPane.showMessageDialog(this, "Hora no disponible",
                            "Hora no disponible", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Calendar cal = Calendar.getInstance();
                cal.setTimeInMillis(Fecha.getTime());
                int Dia = cal.get(Calendar.DAY_OF_WEEK);
                int Semana = cal.get(Calendar.WEEK_OF_YEAR);

                String Dia_Semana = "";
                switch (Dia) {
                    case 1:
                        Dia_Semana = "Domingo";
                        break;
                    case 2:
                        Dia_Semana = "Lunes";
                        break;
                    case 3:
                        Dia_Semana = "Martes";
                        break;
                    case 4:
                        Dia_Semana = "Miercoles";
                        break;
                    case 5:
                        Dia_Semana = "Jueves";
                        break;
                    case 6:
                        Dia_Semana = "Viernes";
                        break;
                    case 7:
                        Dia_Semana = "Sabado";
                        break;

                    default:
                        break;
                }

                Cita.Agregar_Cita(Fecha, Hora, ID_Medico, ID_Paciente, Dia_Semana, Semana);
                Limpiar();// TODO add your handling code here:

            }

        }

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Guardar();
    }//GEN-LAST:event_jButton2ActionPerformed

    ResultSet resultado;
    int ID_Esp[];
    int ID_Pac[];
    int ID_Med[];

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        Date Hoy = new Date();

        jCalendar1.setMinSelectableDate(Hoy);
        jCalendar1.setDate(Hoy);

        flag = true;

        String[] Header = {"Hora", "Estado"};
        String[] Horas = {"8:00 A.M", "9:00 A.M", "10:00 A.M", "11:00 A.M", "12:00 P.M", "1:00 P.M",
            "2:00 P.M", "3:00 P.M", "4:00 P.M", "5:00 P.M"};

        model.setColumnIdentifiers(Header);

        model.setRowCount(10);

        for (int k = 0; k < 10; k++) {

            String hr = Horas[k];
            model.setValueAt(hr, k, 0);
        }

        jTable1.setModel(model);

        jTable1.setModel(model);

        TableColumnModel columnModel = jTable1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(130);
        columnModel.getColumn(1).setPreferredWidth(210);

        columnModel.getColumn(0).setResizable(false);
        columnModel.getColumn(1).setResizable(false);

        jTable1.setColumnModel(columnModel);

        int ID_Especialidad = 0;

        try {

            resultado = Conexion.consulta("Select Max(ID_Especialidad) from Especialidad");

            while (resultado.next()) {
                ID_Especialidad = resultado.getInt(1);
            }
        } catch (SQLException ex) {

        }

        ID_Especialidad++;

        ID_Esp = new int[ID_Especialidad];

        ID_Esp[0] = 0;

        int i = 1;

        try {

            resultado = Conexion.consulta("Select ID_Especialidad, Nombre from Especialidad where Estado = " + true);

            while (resultado.next()) {
                ID_Esp[i] = resultado.getInt(1);
                cmbEspecialidad.addItem(resultado.getString(2));
                i++;
            }
        } catch (SQLException ex) {

        }

        int ID_Paciente = 0;

        try {

            resultado = Conexion.consulta("Select Max(ID_Paciente) from Paciente");

            while (resultado.next()) {
                ID_Paciente = resultado.getInt(1);
            }
        } catch (SQLException ex) {

        }

        ID_Paciente++;

        ID_Pac = new int[ID_Paciente];

        ID_Pac[0] = 0;

        int j = 1;

        try {

            resultado = Conexion.consulta("Select ID_Paciente, Nombres, Apellidos from Paciente where Estado = " + true);

            while (resultado.next()) {
                ID_Pac[j] = resultado.getInt(1);
                cmbPaciente.addItem(resultado.getString(2).trim() + " " + resultado.getString(3).trim());
                j++;
            }
        } catch (SQLException ex) {

        }

        int ID_Medico = 0;

        try {

            resultado = Conexion.consulta("Select Max(ID_Medico) from Medico");

            while (resultado.next()) {
                ID_Medico = resultado.getInt(1);
            }
        } catch (SQLException ex) {

        }

        ID_Medico++;

        ID_Med = new int[ID_Medico];

        ID_Med[0] = 0;

        jTable1.setDefaultRenderer(Object.class, new MiRender());

// TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    public void Limpiar() {
        cmbEspecialidad.setSelectedIndex(0);
        cmbPaciente.setSelectedIndex(0);
        cmbMedico.setSelectedIndex(0);
        ckD.setSelected(false);
        ckJ.setSelected(false);
        ckL.setSelected(false);
        ckM.setSelected(false);
        ckS.setSelected(false);
        ckV.setSelected(false);
        ckX.setSelected(false);

        Date hoy = new Date();
        jCalendar1.setDate(hoy);

        String[] Horas = {"8:00 A.M", "9:00 A.M", "10:00 A.M", "11:00 A.M", "12:00 P.M", "1:00 P.M",
            "2:00 P.M", "3:00 P.M", "4:00 P.M", "5:00 P.M"};

        model.setRowCount(10);

        for (int k = 0; k < 10; k++) {

            String hr = Horas[k];
            model.setValueAt(hr, k, 0);
            model.setValueAt("", k, 1);
        }

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Limpiar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cmbEspecialidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEspecialidadItemStateChanged

        int ID_Espec = cmbEspecialidad.getSelectedIndex();

        int ID_Especialidad = ID_Esp[ID_Espec];

        int i = 1;

        cmbMedico.removeAllItems();
        cmbMedico.addItem("<Seleccione>");

        try {

            resultado = Conexion.consulta("Select ID_Medico, Nombres, Apellidos from Medico where "
                    + "(ID_Especialidad = " + ID_Especialidad + ") and (Estado = " + true + ")");

            while (resultado.next()) {
                ID_Med[i] = resultado.getInt(1);
                cmbMedico.addItem(resultado.getString(2).trim() + " " + resultado.getString(3).trim());
                i++;
            }
        } catch (SQLException ex) {

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEspecialidadItemStateChanged

    public void CargarHorario() {

        this.jTable1.setEnabled(true);

        String[] Horas = {"8:00 A.M", "9:00 A.M", "10:00 A.M", "11:00 A.M", "12:00 P.M", "1:00 P.M",
            "2:00 P.M", "3:00 P.M", "4:00 P.M", "5:00 P.M"};

        model.setRowCount(10);

        for (int k = 0; k < 10; k++) {

            String hr = Horas[k];
            model.setValueAt(hr, k, 0);
        }

        int ID_Medic = cmbMedico.getSelectedIndex();

        if (ID_Medic < 0) {
            ID_Medic = 0;
        }

        int ID_Medico = ID_Med[ID_Medic];

        String HoraInicio = "8:00 AM";
        String HoraFinal = "5:00 PM";

        boolean L = false;
        boolean M = false;
        boolean X = false;
        boolean J = false;
        boolean V = false;
        boolean S = false;
        boolean D = false;

        ckL.setSelected(L);
        ckM.setSelected(M);
        ckX.setSelected(X);
        ckJ.setSelected(J);
        ckV.setSelected(V);
        ckS.setSelected(S);
        ckD.setSelected(D);

        ArrayList<String> Dias = new ArrayList<>();
        ArrayList<String> Hora_Inicial = new ArrayList<>();
        ArrayList<String> Hora_Final = new ArrayList<>();

        try {

            resultado = Conexion.consulta("Select Dia, Hora_Inicial, Hora_Final"
                    + " from Horario where ID_Medico = " + ID_Medico);

            while (resultado.next()) {
                Dias.add(resultado.getString(1));
                Hora_Inicial.add(resultado.getString(2));
                Hora_Final.add(resultado.getString(3));
            }
        } catch (SQLException ex) {

        }

        ArrayList<String> Hrs = new ArrayList<String>();
        ArrayList<String> Estados = new ArrayList<String>();

        long date = 0;

        try {
            Date Fecha = jCalendar1.getDate();
            date = Fecha.getTime();
            java.sql.Date Fechac = new java.sql.Date(date);
            resultado = Conexion.consulta("Select Hora_Cita, Estado from Cita where (ID_Medico = " + ID_Medico
                    + ") and (Fecha_Cita = '" + Fechac + "')");

            while (resultado.next()) {
                Hrs.add(resultado.getString(1));
                Estados.add(resultado.getString(2));
            }
        } catch (SQLException ex) {

        }

        Date Hoy = jCalendar1.getDate();
        long hoy = Hoy.getTime();

        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(hoy);
        int Dia = cal.get(Calendar.DAY_OF_WEEK);

        String Day = "";

        switch (Dia) {
            case 1:
                Day = "D";
                break;

            case 2:
                Day = "L";
                break;

            case 3:
                Day = "M";
                break;

            case 4:
                Day = "X";
                break;

            case 5:
                Day = "J";
                break;

            case 6:
                Day = "V";
                break;

            case 7:
                Day = "S";
                break;

            default:
                break;
        }

        int item = 0;

        if (Dias.contains(Day)) {

            item = Dias.indexOf(Day);

        } else {

            for (int r = 0; r < jTable1.getRowCount(); r++) {
                jTable1.setValueAt("No Disponible", r, 1);
            }

            this.jTable1.setEnabled(false);
            jTable1.setDefaultRenderer(Object.class, new MiRenderDisable());
            return;
        }

        int Horai = 0;
        int Horaf = 0;

        HoraInicio = Hora_Inicial.get(item);
        HoraFinal = Hora_Final.get(item);

        for (int r = 0; r < 10; r++) {

            String HRM = (String) model.getValueAt(r, 0);

            if (HRM.equalsIgnoreCase(HoraInicio)) {
                Horai = r;
            }
            if (HRM.equalsIgnoreCase(HoraFinal)) {
                Horaf = r;
            }

        }

        if (ID_Medico != 0) {

            model.setRowCount(0);

            Horaf++;

            int TamanoHorario = Horaf - Horai;

            for (int k = 0; k < TamanoHorario; k++) {
                model.addRow(new Object[]{"", ""});

                String hr = Horas[Horai];
                Horai++;

                model.setValueAt(hr, k, 0);
                model.setValueAt("Disponible", k, 1);
            }

            for (int q = 0; q < model.getRowCount(); q++) {

                String HRM = (String) model.getValueAt(q, 0);

                for (int p = 0; p < Hrs.size(); p++) {

                    if (Hrs.get(p).equalsIgnoreCase(HRM)) {
                        if ("Pendiente".equals(Estados.get(p))) {
                            model.setValueAt(" No disponible", q, 1);
                        }

                    }
                }

            }

        }

        for (String Dia1 : Dias) {

            if (Dia1.equalsIgnoreCase("L")) {
                L = true;
            }
            if (Dia1.equalsIgnoreCase("M")) {
                M = true;
            }
            if (Dia1.equalsIgnoreCase("X")) {
                X = true;
            }
            if (Dia1.equalsIgnoreCase("J")) {
                J = true;
            }
            if (Dia1.equalsIgnoreCase("V")) {
                V = true;
            }
            if (Dia1.equalsIgnoreCase("S")) {
                S = true;
            }
            if (Dia1.equalsIgnoreCase("D")) {
                D = true;
            }

        }

        ckL.setSelected(L);
        ckM.setSelected(M);
        ckX.setSelected(X);
        ckJ.setSelected(J);
        ckV.setSelected(V);
        ckS.setSelected(S);
        ckD.setSelected(D);

        jTable1.setModel(model);
        jTable1.setDefaultRenderer(Object.class, new MiRender());

    }

    public boolean DiaDisponible() {

        Date Fecha = jCalendar1.getDate();
        long date = Fecha.getTime();

        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(date);
        int Dia = cal.get(Calendar.DAY_OF_WEEK);

        this.jTable1.setEnabled(true);
        jTable1.setDefaultRenderer(Object.class, new MiRender());

        if (!ckD.isSelected() && Dia == 1) {
            this.jTable1.setEnabled(false);
            jTable1.setDefaultRenderer(Object.class, new MiRenderDisable());
            JOptionPane.showMessageDialog(this, "Dia Domingo no disponible en horario del medico", "No disponible",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!ckL.isSelected() && Dia == 2) {
            this.jTable1.setEnabled(false);
            jTable1.setDefaultRenderer(Object.class, new MiRenderDisable());
            JOptionPane.showMessageDialog(this, "Dia Lunes no disponible en horario del medico", "No disponible",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!ckM.isSelected() && Dia == 3) {
            this.jTable1.setEnabled(false);
            jTable1.setDefaultRenderer(Object.class, new MiRenderDisable());
            JOptionPane.showMessageDialog(this, "Dia Martes no disponible en horario del medico", "No disponible",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!ckX.isSelected() && Dia == 4) {
            this.jTable1.setEnabled(false);
            jTable1.setDefaultRenderer(Object.class, new MiRenderDisable());
            JOptionPane.showMessageDialog(this, "Dia Miercoles no disponible en horario del medico", "No disponible",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!ckJ.isSelected() && Dia == 5) {
            this.jTable1.setEnabled(false);
            jTable1.setDefaultRenderer(Object.class, new MiRenderDisable());
            JOptionPane.showMessageDialog(this, "Dia Jueves no disponible en horario del medico", "No disponible",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!ckV.isSelected() && Dia == 6) {
            this.jTable1.setEnabled(false);
            jTable1.setDefaultRenderer(Object.class, new MiRenderDisable());
            JOptionPane.showMessageDialog(this, "Dia Viernes no disponible en horario del medico", "No disponible",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!ckS.isSelected() && Dia == 7) {
            this.jTable1.setEnabled(false);
            jTable1.setDefaultRenderer(Object.class, new MiRenderDisable());
            JOptionPane.showMessageDialog(this, "Dia Sabado no disponible en horario del medico", "No disponible",
                    JOptionPane.ERROR_MESSAGE);
            return false;

        }

        return true;

    }

    private void cmbMedicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMedicoItemStateChanged

        CargarHorario();

        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMedicoItemStateChanged

    private void jCalendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendar1PropertyChange

        if (flag) {

            try {
                CargarHorario();
            } catch (java.lang.ArrayIndexOutOfBoundsException ex) {

            }

            int ID_Medico = cmbMedico.getSelectedIndex();

            if (ID_Medico != 0) {
                DiaDisponible();
            }

        }

// TODO add your handling code here:
    }//GEN-LAST:event_jCalendar1PropertyChange

    boolean flag = false;

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing

        flag = false;

// TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosing

    private void cmbMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMedicoActionPerformed

    public class MiRender extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (column == 1 && " No disponible".equalsIgnoreCase((String) value)) {
                this.setBackground(new Color(191, 54, 12));
                this.setForeground(Color.WHITE);
            } else {
                this.setBackground(new Color(27, 94, 32));
                this.setForeground(Color.WHITE);
            }

            if (column == 0) {
                this.setOpaque(true);
                this.setBackground(new Color(219, 208, 186));
                this.setForeground(Color.BLACK);
            }
            // Restaurar los valores por defecto

            return this;
        }
    }

    public class MiRenderDisable extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            this.setOpaque(true);
            this.setBackground(Color.GRAY);
            this.setForeground(Color.BLACK);

            // Restaurar los valores por defecto
            return this;
        }
    }

    DefaultTableModel model = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int row, int column) {

            return false;
        }

    };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ckD;
    private javax.swing.JCheckBox ckJ;
    private javax.swing.JCheckBox ckL;
    private javax.swing.JCheckBox ckM;
    private javax.swing.JCheckBox ckS;
    private javax.swing.JCheckBox ckV;
    private javax.swing.JCheckBox ckX;
    private javax.swing.JComboBox cmbEspecialidad;
    private javax.swing.JComboBox cmbMedico;
    private javax.swing.JComboBox cmbPaciente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
