/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sts;

import config.Session;
import config.connectDB;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        register_path = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 30));
        jPanel1.setForeground(new java.awt.Color(255, 153, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LOG IN ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ProIcon1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 124, -1));

        login.setBackground(new java.awt.Color(51, 0, 51));
        login.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("LOG IN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 104, 32));

        register_path.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        register_path.setText("Don't have an account?  Register here.");
        register_path.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_pathMouseClicked(evt);
            }
        });
        jPanel1.add(register_path, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 230, 30));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 230, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 550, 440));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/b1.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
     
        try {
    if (loginAcc(username.getText(), new String(password.getPassword()))) {
        if (status == null || !status.equalsIgnoreCase("Active")) {
            JOptionPane.showMessageDialog(null, "Inactive Account, Please Contact the Admin");
        } else {
            JOptionPane.showMessageDialog(null, "Log In Successfully!");

            if (usertype != null) {
                switch (usertype) {
                    case "Manager":
                        new ManagerDashboard().setVisible(true);
                        this.dispose();
                        break;
                    case "Sales Clerk":
                        new SalesClerkDashboard().setVisible(true);
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


    }//GEN-LAST:event_loginActionPerformed

    private void register_pathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_pathMouseClicked

        REGISTRATION r = new REGISTRATION();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_register_pathMouseClicked

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel register_path;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
