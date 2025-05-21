/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AUTHENTICATION;

import ADMINFORM.ManagerDashboard;
import ADMINFORM.forgotpass;
import USERFORM.CLERKDASHBOARD;
import config.Session;
import config.connectDB;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    public LOGIN() {
        initComponents();
        
    }
    
    
   static String status;
   static String usertype;

public static boolean loginAcc(String username, String password) throws NoSuchAlgorithmException {
    connectDB connector = new connectDB();
    try {
        String query = "SELECT * FROM users WHERE username = ?";
        PreparedStatement pst = connector.getConnection().prepareStatement(query);
        pst.setString(1, username);
        ResultSet resultSet = pst.executeQuery();
        
        if (resultSet.next()) {
            String storedHashedPass = resultSet.getString("password"); // Get stored hash
            if (passwordHasher.checkPassword(password, storedHashedPass)) { // Compare hashed passwords
                
                status = resultSet.getString("status");
                usertype = resultSet.getString("usertype");

                // Save session data
                Session sess = Session.getInstance();
                sess.setId(resultSet.getInt("id"));
                sess.setFirstname(resultSet.getString("firstname"));
                sess.setLastname(resultSet.getString("lastname"));             
                sess.setEmail(resultSet.getString("email"));              
                sess.setUsertype(resultSet.getString("usertype"));
                sess.setUsername(resultSet.getString("username"));
                sess.setStatus(resultSet.getString("status"));

                return true; // Login successful
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return false; // Login failed
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        register_path = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        o = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        showpassword = new javax.swing.JLabel();
        hide = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 400));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        register_path.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        register_path.setText("Don't have an account?  Register here.");
        register_path.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_pathMouseClicked(evt);
            }
        });
        jPanel2.add(register_path, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 270, 30));
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 270, 30));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Username:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Password:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LOG IN ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new_login_design-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 100, 100));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("Forgot Password");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, 20));

        jCheckBox1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(153, 0, 153));
        jCheckBox1.setText("Remember me");
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, 20));

        o.setBackground(new java.awt.Color(51, 0, 51));
        o.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                oMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                oMouseExited(evt);
            }
        });
        o.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("LOG IN");
        o.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 60, -1));

        jPanel2.add(o, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 150, 40));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit that update.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, 30));

        showpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/show pss.jpg"))); // NOI18N
        showpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpasswordMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showpasswordMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                showpasswordMouseReleased(evt);
            }
        });
        jPanel2.add(showpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 40, 30));

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hide-password (3)_1.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hideMouseReleased(evt);
            }
        });
        jPanel2.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 450, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void register_pathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_pathMouseClicked

        REGISTRATION r = new REGISTRATION();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_register_pathMouseClicked

    private void oMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oMouseEntered
      o.setBackground(new Color (153, 0 , 153));
    }//GEN-LAST:event_oMouseEntered

    private void oMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oMouseExited
       o.setBackground(new Color (51,0,51));
    }//GEN-LAST:event_oMouseExited

    private void oMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oMouseClicked
          try {
    if (loginAcc(username.getText(), new String(password.getPassword()))) {
        if (status == null || !status.equalsIgnoreCase("Active")) {
            JOptionPane.showMessageDialog(null, "Inactive Account, Please Contact the Admin");
        } else {
            JOptionPane.showMessageDialog(null, "Log In Successfully!");

            if (usertype != null) {
                switch (usertype) {
                    case "Manager":
                        ManagerDashboard managerPanel = new ManagerDashboard();
                        managerPanel.setVisible(true);
                        this.dispose();
                        break;
                    case "Sales Clerk":
                        new CLERKDASHBOARD().setVisible(true);
                        this.dispose();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No Account Type Found");
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usertype is null. Please check database retrieval.");
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Invalid Username or Password");
    }
} catch (NoSuchAlgorithmException ex) {
    Logger.getLogger(LOGIN.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_oMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       
        int choice = JOptionPane.showConfirmDialog(
        null,
        "Do you want to exit the application?",
        "Exit Confirmation",
        JOptionPane.YES_NO_OPTION
    );

    if (choice == JOptionPane.YES_OPTION) {
        System.exit(0); 
    }
    }//GEN-LAST:event_closeMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new forgotpass().setVisible(true);this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void showpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpasswordMouseClicked

    }//GEN-LAST:event_showpasswordMouseClicked

    private void showpasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpasswordMousePressed
        showpassword.setVisible(true);
        hide.setVisible(false);

        password.setEchoChar((char)0);
    }//GEN-LAST:event_showpasswordMousePressed

    private void showpasswordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpasswordMouseReleased
        showpassword.setVisible(false);
        hide.setVisible(true);

        password.setEchoChar('*');
    }//GEN-LAST:event_showpasswordMouseReleased

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        showpassword.setVisible(true);
        hide.setVisible(false);

        password.setEchoChar((char)0);
    }//GEN-LAST:event_hideMousePressed

    private void hideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseReleased
        showpassword.setVisible(false);
        hide.setVisible(true);

        password.setEchoChar('*');
    }//GEN-LAST:event_hideMouseReleased

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel hide;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel o;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel register_path;
    private javax.swing.JLabel showpassword;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
