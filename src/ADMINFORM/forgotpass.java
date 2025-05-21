/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMINFORM;

import AUTHENTICATION.LOGIN;
import config.connectDB;
import config.passwordHasher;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class forgotpass extends javax.swing.JFrame {

    /**
     * Creates new form forgotpass
     */
    public forgotpass() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        accountname2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        userid = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        password = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        save = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        sa = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        sq = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(51, 0, 51));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountname2.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        accountname2.setForeground(new java.awt.Color(255, 255, 255));
        accountname2.setText("User for Assocation");
        jPanel10.add(accountname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, -1, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fashop.png"))); // NOI18N
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Fashion");
        jPanel10.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 40));

        username.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("User");
        jPanel10.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 60, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin.png"))); // NOI18N
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, 40));

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 60));

        jPanel3.setBackground(new java.awt.Color(153, 0, 153));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Current ID:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(60, 300, 100, 20);

        userid.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        userid.setForeground(new java.awt.Color(51, 0, 51));
        userid.setText("ID");
        jPanel3.add(userid);
        userid.setBounds(90, 340, 40, 20);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 51));
        jLabel11.setText("_______________________");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 260, 190, 20);

        password.setBackground(new java.awt.Color(153, 0, 153));
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordMouseExited(evt);
            }
        });
        password.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Back");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        password.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 40, 30));

        jPanel3.add(password);
        password.setBounds(0, 200, 200, 30);

        save.setBackground(new java.awt.Color(153, 0, 153));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveMouseExited(evt);
            }
        });
        save.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Save");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        save.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 50, 30));

        jPanel3.add(save);
        save.setBounds(0, 150, 200, 30);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 400));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(sa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 230, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 102));
        jLabel15.setText("User Name:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        sq.setText("What is your favorite Color?");
        sq.setEnabled(false);
        jPanel2.add(sq, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 230, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 102));
        jLabel12.setText("Security Question:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 102));
        jLabel16.setText("New Password:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));
        jPanel2.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 230, 30));
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 230, 30));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 102));
        jLabel17.setText("Security Answer:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 690, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseExited

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked

    }//GEN-LAST:event_passwordMouseClicked

    private void passwordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseEntered
        password.setBackground(Color.white);
    }//GEN-LAST:event_passwordMouseEntered

    private void passwordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseExited
        password.setBackground(new Color(153, 0 ,153));
    }//GEN-LAST:event_passwordMouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
String usernameInput = user.getText().trim();
String securityAnswerInput = sa.getText().trim();
String newPassword = String.valueOf(pass.getPassword()).trim();

if (usernameInput.isEmpty() || securityAnswerInput.isEmpty() || newPassword.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please fill in all fields!", "Warning", JOptionPane.WARNING_MESSAGE);
    return;
}

Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;

try {
    config.connectDB db = new config.connectDB();
    con = db.getConnection();

    String sql = "SELECT password FROM users WHERE username = ? AND security_answer = ?";
    pst = con.prepareStatement(sql);
    pst.setString(1, usernameInput);
    pst.setString(2, securityAnswerInput);
    rs = pst.executeQuery();

    if (rs.next()) {
        String oldHashedPassword = rs.getString("password");

        // Hash the new password
        String hashedNewPassword = passwordHasher.hashPassword(newPassword);

        // Optional: Check if the new password (in plain text) matches old hashed password
        if (passwordHasher.checkPassword(newPassword, oldHashedPassword)) {
            JOptionPane.showMessageDialog(this, "New password cannot be the same as the old password. Please choose a different password.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String updateSql = "UPDATE users SET password = ? WHERE username = ?";
        try (PreparedStatement updatePst = con.prepareStatement(updateSql)) {
            updatePst.setString(1, hashedNewPassword); // save hashed password
            updatePst.setString(2, usernameInput);

            int updated = updatePst.executeUpdate();
            if (updated > 0) {
                JOptionPane.showMessageDialog(this, "Password updated successfully!");

                this.dispose(); // Close forgot password form

                // Redirect to login
                new LOGIN().setVisible(true); // Replace LoginForm with your actual login window class
            } else {
                JOptionPane.showMessageDialog(this, "Password update failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    } else {
        JOptionPane.showMessageDialog(this, "Username or security answer is incorrect!", "Error", JOptionPane.ERROR_MESSAGE);
    }

} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    e.printStackTrace();
} finally {
    try { if (rs != null) rs.close(); } catch (Exception e) {}
    try { if (pst != null) pst.close(); } catch (Exception e) {}
    try { if (con != null) con.close(); } catch (Exception e) {}
}


     
    }//GEN-LAST:event_saveMouseClicked

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        save.setBackground(Color.white);
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
        save.setBackground(new Color (153, 0 , 153));
    }//GEN-LAST:event_saveMouseExited

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
            java.util.logging.Logger.getLogger(forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotpass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountname2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPanel password;
    private javax.swing.JTextField sa;
    private javax.swing.JPanel save;
    private javax.swing.JTextField sq;
    private javax.swing.JTextField user;
    private javax.swing.JLabel userid;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
