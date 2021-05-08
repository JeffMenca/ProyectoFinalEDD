/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.claseMain;
import Objects.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey
 */
public class CrearUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CrearUsuario
     */
    public CrearUsuario() {
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

        usuarioJTextField1 = new javax.swing.JTextField();
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

        usuarioJTextField1.setBackground(new java.awt.Color(51, 51, 51));
        usuarioJTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usuarioJTextField1.setForeground(new java.awt.Color(255, 255, 255));
        usuarioJTextField1.setText("Usuario");
        usuarioJTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioJTextField1MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 143, 157));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 143, 157));
        jLabel1.setText("Creacion de usuario");

        TipojComboBox.setBackground(new java.awt.Color(51, 51, 51));
        TipojComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TipojComboBox.setForeground(new java.awt.Color(255, 255, 255));
        TipojComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Colaborador" }));

        PasswordJTextField.setBackground(new java.awt.Color(51, 51, 51));
        PasswordJTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PasswordJTextField.setForeground(new java.awt.Color(255, 255, 255));
        PasswordJTextField.setText("Password");
        PasswordJTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordJTextFieldMouseClicked(evt);
            }
        });

        IDJTextField.setBackground(new java.awt.Color(51, 51, 51));
        IDJTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IDJTextField.setForeground(new java.awt.Color(255, 255, 255));
        IDJTextField.setText("Carne (Si es colaborador dejar vacio)");
        IDJTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDJTextFieldMouseClicked(evt);
            }
        });

        NombreJTextField1.setBackground(new java.awt.Color(51, 51, 51));
        NombreJTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NombreJTextField1.setForeground(new java.awt.Color(255, 255, 255));
        NombreJTextField1.setText("Nombre");
        NombreJTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreJTextField1MouseClicked(evt);
            }
        });

        IngresarjButton.setBackground(new java.awt.Color(0, 143, 157));
        IngresarjButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IngresarjButton.setForeground(new java.awt.Color(255, 255, 255));
        IngresarjButton.setText("Crear usuario");
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
                .addContainerGap(226, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IngresarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(368, 368, 368))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(TipojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(NombreJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PasswordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)))
                .addComponent(IngresarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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

    private void usuarioJTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioJTextField1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioJTextField1MouseClicked

    private void IDJTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDJTextFieldMouseClicked
        IDJTextField.setText("");
    }//GEN-LAST:event_IDJTextFieldMouseClicked

    private void NombreJTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreJTextField1MouseClicked
        NombreJTextField1.setText("");
    }//GEN-LAST:event_NombreJTextField1MouseClicked

    private void IngresarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarjButtonActionPerformed
        if (TipojComboBox.getSelectedIndex() == 0) {
            //Estudiante
            if (IDJTextField.getText() != null && !"".equals(IDJTextField.getText())) {
                if (NombreJTextField1.getText() != null && !"".equals(NombreJTextField1.getText())) {
                    if (PasswordJTextField.getText() != null && !"".equals(PasswordJTextField.getText())) {

                        try {
                            if (claseMain.listaUsuarios.buscarID(Integer.valueOf(IDJTextField.getText())) != null) {
                                JOptionPane.showMessageDialog(null, "El id ya existe (carnet)");
                            } else {
                                Usuario nuevoUser = new Usuario(Integer.valueOf(IDJTextField.getText()), NombreJTextField1.getText(), PasswordJTextField.getText(), "Estudiante");
                                claseMain.listaUsuarios.add(nuevoUser);
                                JOptionPane.showMessageDialog(null, "Se creo el usuario correctamente");
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Ocurrio un error");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "No ingreso su password");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No ingreso su nombre");
                }

            } else {
                JOptionPane.showMessageDialog(null, "No ingreso su carne estudiantil");
            }
        } else {
            if (NombreJTextField1.getText() != null && !"".equals(NombreJTextField1.getText())) {
                if (PasswordJTextField.getText() != null && !"".equals(PasswordJTextField.getText())) {
                    claseMain.cantidadColaboradores++;
                    Usuario nuevoUser = new Usuario(claseMain.cantidadColaboradores, NombreJTextField1.getText(), PasswordJTextField.getText(), "Colaborador");
                    claseMain.listaUsuarios.add(nuevoUser);
                    JOptionPane.showMessageDialog(null, "Se creo el usuario correctamente, su id es "+ claseMain.cantidadColaboradores);
                } else {
                    JOptionPane.showMessageDialog(null, "No ingreso su password");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No ingreso su nombre");
            }
        }
    }//GEN-LAST:event_IngresarjButtonActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        mainFrame main = new mainFrame();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuario().setVisible(true);
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
    private javax.swing.JTextField usuarioJTextField1;
    // End of variables declaration//GEN-END:variables
}