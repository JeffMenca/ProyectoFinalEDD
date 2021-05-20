/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.claseMain;
import Objects.Asignar;
import Objects.Curso;
import Objects.Estudiante;
import Objects.Horario;
import btree.LlaveEntero;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey
 */
public class CrearAsignacion extends javax.swing.JFrame {

    public ArrayList<Horario> horarios = new ArrayList<>();

    /**
     * Creates new form CrearAsignacion
     */
    public CrearAsignacion() {
        initComponents();
        setVisible(true);
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TipojComboBox = new javax.swing.JComboBox<>();
        PasswordJTextField = new javax.swing.JTextField();
        IDJTextField = new javax.swing.JTextField();
        NombreJTextField1 = new javax.swing.JTextField();
        IngresarjButton = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 143, 157));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 143, 157));
        jLabel1.setText("Asignar estudiante");

        TipojComboBox.setBackground(new java.awt.Color(51, 51, 51));
        TipojComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TipojComboBox.setForeground(new java.awt.Color(255, 255, 255));

        PasswordJTextField.setBackground(new java.awt.Color(51, 51, 51));
        PasswordJTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PasswordJTextField.setForeground(new java.awt.Color(255, 255, 255));
        PasswordJTextField.setText("Final");
        PasswordJTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordJTextFieldMouseClicked(evt);
            }
        });

        IDJTextField.setBackground(new java.awt.Color(51, 51, 51));
        IDJTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IDJTextField.setForeground(new java.awt.Color(255, 255, 255));
        IDJTextField.setText("Carnet ");
        IDJTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDJTextFieldMouseClicked(evt);
            }
        });

        NombreJTextField1.setBackground(new java.awt.Color(51, 51, 51));
        NombreJTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NombreJTextField1.setForeground(new java.awt.Color(255, 255, 255));
        NombreJTextField1.setText("Zona ");
        NombreJTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreJTextField1MouseClicked(evt);
            }
        });

        IngresarjButton.setBackground(new java.awt.Color(0, 143, 157));
        IngresarjButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IngresarjButton.setForeground(new java.awt.Color(255, 255, 255));
        IngresarjButton.setText("Asignar estudiante");
        IngresarjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        IngresarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarjButtonActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(51, 51, 51));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton8)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(198, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(IngresarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(355, 355, 355))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(IDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TipojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NombreJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PasswordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(IngresarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordJTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordJTextFieldMouseClicked
        PasswordJTextField.setText("");
    }//GEN-LAST:event_PasswordJTextFieldMouseClicked

    private void IDJTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDJTextFieldMouseClicked
        IDJTextField.setText("");
    }//GEN-LAST:event_IDJTextFieldMouseClicked

    private void NombreJTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreJTextField1MouseClicked
        NombreJTextField1.setText("");
    }//GEN-LAST:event_NombreJTextField1MouseClicked

    private void IngresarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarjButtonActionPerformed
        try {
            //Estudiante
            if (IDJTextField.getText() != null && !"".equals(IDJTextField.getText())) {
                if (NombreJTextField1.getText() != null && !"".equals(NombreJTextField1.getText())) {
                    if (PasswordJTextField.getText() != null && !"".equals(PasswordJTextField.getText())) {

                        try {
                            Estudiante nuevo = claseMain.listaEstudiantes.get(Integer.valueOf(IDJTextField.getText()));
                            if (nuevo != null) {
                                claseMain.cantidadAsignaciones++;
                                Horario horario = horarios.get(TipojComboBox.getSelectedIndex());
           
                                if (claseMain.listaAsignaciones.obtenerAsignacionesSalon(horario.getSalon().getNumero(), horario.getEdificio().getNombre()) < horario.getSalon().getCapacidad()) {
                                    Asignar asignacion = new Asignar(claseMain.cantidadAsignaciones, Integer.valueOf(IDJTextField.getText()), horario, Integer.valueOf(NombreJTextField1.getText()), Integer.valueOf(PasswordJTextField.getText()));
                                    claseMain.listaAsignaciones.add(asignacion);
                                    JOptionPane.showMessageDialog(null, "Se creo la asignacion correctamente");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Ya se alcanzo la capacidad maxima en ese salon");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "No se encontro un estudiante con ese carnet");
                            }

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Ocurrio un error o no se encontro el estudiante");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "No ingreso cuanto vale el final ");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No ingreso cuanto vale la zona");
                }

            } else {
                JOptionPane.showMessageDialog(null, "No ingreso su carnet estudiantil");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_IngresarjButtonActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        mainFrame main = new mainFrame();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try {
            horarios = claseMain.listaHorarios.getmRaiz().toArray();
            DefaultComboBoxModel dml = new DefaultComboBoxModel();
            for (int i = 0; i < horarios.size(); i++) {
                Horario horario = horarios.get(i);
                Curso curso = horario.getCurso();
                String horarioString = curso.getNombre() + ", " + horario.getPeriodo() + ", " + horario.getDia() + ", Edificio: " + horario.getEdificio().getNombre() + ", Salon: " + horario.getSalon().getNumero();
                dml.addElement(horarioString);
            }
            TipojComboBox.setModel(dml);
        } catch (Exception e) {
            DefaultComboBoxModel dml = new DefaultComboBoxModel();
            dml.addElement("Aun no existen horarios");
            TipojComboBox.setModel(dml);
        }

    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(CrearAsignacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearAsignacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearAsignacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearAsignacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearAsignacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDJTextField;
    private javax.swing.JButton IngresarjButton;
    private javax.swing.JTextField NombreJTextField1;
    private javax.swing.JTextField PasswordJTextField;
    private javax.swing.JComboBox<String> TipojComboBox;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
