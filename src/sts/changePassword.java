/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sts;

import config.Session;
import config.connectDB;
import config.passwordHasher;
import java.awt.Window;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Administrator
 */
public class changePassword extends javax.swing.JFrame {

    /**
     * Creates new form USER
     */
    public changePassword() {
        initComponents();
       
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userid = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 520, 420));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download__8_-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 350, 570));

        jPanel4.setBackground(new java.awt.Color(153, 0, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Engravers MT", 3, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("change password");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 570, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/b1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 590, 630));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 0, 255));
        jPanel3.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profile-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel3);
        jLabel3.setBounds(60, 60, 80, 110);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Current ID:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 0, 150, 22);

        userid.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        userid.setText("ID");
        jPanel3.add(userid);
        userid.setBounds(160, 0, 70, 22);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("User");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(80, 170, 70, 22);

        back.setBackground(new java.awt.Color(51, 0, 51));
        back.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Change Password");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel3.add(back);
        back.setBounds(10, 230, 180, 25);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
          Session sess = Session.getInstance();
          userid.setText(""+sess.getId());
    }//GEN-LAST:event_formWindowActivated

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    
   try {
    connectDB cdb = new connectDB();
    Session sess = Session.getInstance();

    if (sess.getId() <= 0) { 
        JOptionPane.showMessageDialog(null, "Invalid session. Please log in again.");
        return;
    }

    String query = "SELECT password FROM users WHERE id = ?";
    PreparedStatement stmt = cdb.getConnection().prepareStatement(query);
    stmt.setInt(1, sess.getId()); 

    ResultSet rs = stmt.executeQuery();

    if (rs.next()) {
        String storedHashedPassword = rs.getString("password");

        String oldPassword = JOptionPane.showInputDialog("Enter current password:");
        String newPassword = JOptionPane.showInputDialog("Enter new password:");
        String confirmPassword = JOptionPane.showInputDialog("Confirm new password:");

        if (oldPassword == null || newPassword == null || confirmPassword == null || 
            oldPassword.isEmpty() || newPassword.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password fields cannot be empty!");
            return;
        }

        if (!newPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match! Please try again.");
            return;
        }

        if (!passwordHasher.checkPassword(oldPassword, storedHashedPassword)) {
            JOptionPane.showMessageDialog(null, "Incorrect old password!");
            return;
        }

        String hashedNewPassword = passwordHasher.hashPassword(newPassword);

        String updateQuery = "UPDATE users SET password = ? WHERE id = ?";
        PreparedStatement updateStmt = cdb.getConnection().prepareStatement(updateQuery);
        updateStmt.setString(1, hashedNewPassword);
        updateStmt.setInt(2, sess.getId());

        int rowsUpdated = updateStmt.executeUpdate();
        updateStmt.close();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Password changed successfully!");

            LOGIN loginForm = new LOGIN();
            loginForm.setVisible(true);

            Window currentWindow = SwingUtilities.getWindowAncestor(JOptionPane.getRootFrame());
            if (currentWindow != null) {
                currentWindow.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update password!");
        }
    } else {
        JOptionPane.showMessageDialog(null, "No account found for the given ID.");
    }

    rs.close();
    stmt.close();
    cdb.closeConnection();
} catch (SQLException ex) {
    System.out.println("SQL Error: " + ex.getMessage());
} catch (Exception ex) { 
    Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
}


   
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel userid;
    // End of variables declaration//GEN-END:variables
}
