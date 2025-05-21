/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USERFORM;

import AUTHENTICATION.LOGIN;
import ADMINFORM.accountDetails;
import config.Session;
import config.connectDB;
import config.passwordHasher;
import java.awt.Color;
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

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        userid = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        password = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        password1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        accountname2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel2.setText("Change Password");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        password.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 130, 30));

        jPanel3.add(password);
        password.setBounds(0, 200, 200, 30);

        password1.setBackground(new java.awt.Color(153, 0, 153));
        password1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                password1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                password1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                password1MouseExited(evt);
            }
        });
        password1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Back");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        password1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 50, 30));

        jPanel3.add(password1);
        password1.setBounds(0, 150, 200, 30);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 400));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 690, 400));

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
          Session sess = Session.getInstance();
          userid.setText(""+sess.getId());
          username.setText(""+sess.getUsername());
    }//GEN-LAST:event_formWindowActivated

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         
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

        if (passwordHasher.checkPassword(newPassword, storedHashedPassword)) {
            JOptionPane.showMessageDialog(null, "You cannot use your old password as the new password. Please choose a different one.");
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

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseExited

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
         
try {
    connectDB cdb = new connectDB();
    Session sess = Session.getInstance();

    if (sess.getId() <= 0) { 
        JOptionPane.showMessageDialog(null, "Invalid session. Please log in again.");
        
        LOGIN l = new LOGIN();
        l.setVisible(true);
        this.dispose();
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

        if (passwordHasher.checkPassword(newPassword, storedHashedPassword)) {
            JOptionPane.showMessageDialog(null, "You cannot use your old password as the new password. Please choose a different one.");
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

    private void password1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password1MouseClicked
        accountDetails ad = new accountDetails();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_password1MouseClicked

    private void password1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password1MouseEntered
      password1.setBackground(Color.white);
    }//GEN-LAST:event_password1MouseEntered

    private void password1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password1MouseExited
        password1.setBackground(new Color (153, 0 , 153));
    }//GEN-LAST:event_password1MouseExited

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
    private javax.swing.JLabel accountname2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel password;
    private javax.swing.JPanel password1;
    private javax.swing.JLabel userid;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
