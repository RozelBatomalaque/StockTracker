/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sts;

import config.Session;
import config.connectDB;
import config.passwordHasher;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Administrator
 */
public class addUser extends javax.swing.JFrame {

    /**
     * Creates new form USER
     */
    public addUser() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        usertype1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        firstname1 = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        login2 = new javax.swing.JButton();
        login3 = new javax.swing.JButton();
        login4 = new javax.swing.JButton();
        status = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("Firstname:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("User Type:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, 20));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Add User");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        login.setBackground(new java.awt.Color(51, 0, 51));
        login.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Back");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel5.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 104, 32));

        usertype1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Sales Clerk" }));
        usertype1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertype1ActionPerformed(evt);
            }
        });
        jPanel5.add(usertype1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 230, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/r1.png"))); // NOI18N
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, -1));

        add.setBackground(new java.awt.Color(51, 0, 51));
        add.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel5.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 104, 32));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setText("Lastname:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 102));
        jLabel11.setText("Username:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 102));
        jLabel12.setText("Email:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel5.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 230, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 102));
        jLabel13.setText("User ID:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));
        jPanel5.add(firstname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 230, 30));
        jPanel5.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 230, 30));
        jPanel5.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 230, 30));
        jPanel5.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 230, 30));

        update.setBackground(new java.awt.Color(51, 0, 51));
        update.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel5.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 104, 32));

        login2.setBackground(new java.awt.Color(51, 0, 51));
        login2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        login2.setForeground(new java.awt.Color(255, 255, 255));
        login2.setText("Cancel");
        login2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login2ActionPerformed(evt);
            }
        });
        jPanel5.add(login2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 104, 32));

        login3.setBackground(new java.awt.Color(51, 0, 51));
        login3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        login3.setForeground(new java.awt.Color(255, 255, 255));
        login3.setText("Delete");
        login3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login3ActionPerformed(evt);
            }
        });
        jPanel5.add(login3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 104, 32));

        login4.setBackground(new java.awt.Color(51, 0, 51));
        login4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        login4.setForeground(new java.awt.Color(255, 255, 255));
        login4.setText("Refresh");
        login4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login4ActionPerformed(evt);
            }
        });
        jPanel5.add(login4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 104, 32));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        jPanel5.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 230, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 102));
        jLabel14.setText("Password:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        uid.setEnabled(false);
        jPanel5.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 230, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 102));
        jLabel16.setText("Status:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 500));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 540, 510));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download__8_-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 350, 570));

        jPanel4.setBackground(new java.awt.Color(153, 0, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Engravers MT", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USER");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 210, -1));

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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
          Session sess = Session.getInstance();
          userid.setText(""+sess.getId());
    }//GEN-LAST:event_formWindowActivated

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
      USER u = new USER();
      u.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_loginActionPerformed

    private void usertype1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertype1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertype1ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

       String First_name = firstname1.getText().trim();
String Last_name = lastname.getText().trim();
String email = Email.getText().trim().toLowerCase();
String User_type = usertype1.getSelectedItem().toString().trim();
String user_name = un.getText().trim();
String Password = password.getText().trim();

connectDB connect = new connectDB();

if (First_name.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter your First Name!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Last_name.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter your Last Name!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (email.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter an Email!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
    JOptionPane.showMessageDialog(null, "Please enter a valid Email Address!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (User_type.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please select a User Type!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (user_name.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Username!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Password.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Password!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Password.length() < 8) {
    JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!", "Error", JOptionPane.WARNING_MESSAGE);
} else {
    try {
        // ✅ Corrected fieldExists method calls by adding "users" table name
        if (connect.fieldExists("users", "username", user_name)) {
            JOptionPane.showMessageDialog(null, "Username already taken!", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (connect.fieldExists("users", "email", email)) {
            JOptionPane.showMessageDialog(null, "Email already used!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            // ✅ Hash the password before storing
            String hashedPassword = passwordHasher.hashPassword(Password);

            String sql = "INSERT INTO users (firstname, lastname, username, email, usertype, password, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
            int rowsInserted = connect.insertData(sql, First_name, Last_name, user_name, email, User_type, hashedPassword, "Pending");

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Registered Successfully!");
                
                new LOGIN().setVisible(true);
                
                // Close current registration window
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(un);
                if (frame != null) {
                    frame.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Registration failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    }//GEN-LAST:event_addActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
  if (firstname1.getText().isEmpty() || lastname.getText().isEmpty() || un.getText().isEmpty() || 
    Email.getText().isEmpty() || usertype1.getSelectedItem() == null || password.getText().isEmpty() || 
    status.getSelectedItem() == null || uid.getText().isEmpty()) {

    JOptionPane.showMessageDialog(null, "All Fields Are Required!");

} else if (password.getText().length() < 8) {
    JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!");
    password.setText("");

} else {
    connectDB cdb = new connectDB();
    try {
        int userId;
        try {
            userId = Integer.parseInt(uid.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid User ID!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean usernameExists = cdb.duplicateCheckExcludingCurrent("users", "username", un.getText(), "id", String.valueOf(userId));
        boolean emailExists = cdb.duplicateCheckExcludingCurrent("users", "email", Email.getText(), "id", String.valueOf(userId));

        if (usernameExists || emailExists) {
            JOptionPane.showMessageDialog(null, "Username or Email already exists for another user!", "Validation Error", JOptionPane.WARNING_MESSAGE);
        } else {
            int rowsUpdated = cdb.updateData(
                "UPDATE users SET firstname = ?, lastname = ?, username = ?, email = ?, usertype = ?, password = ?, status = ? WHERE id = ?",
                firstname1.getText(),
                lastname.getText(),
                un.getText(),
                Email.getText(),
                usertype1.getSelectedItem().toString(),
                password.getText(),
                status.getSelectedItem().toString(),
                userId
            );

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Account updated successfully!");
                this.dispose();  
                new LOGIN().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Update failed! User ID not found.", "Update Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        cdb.closeConnection();
    }
}

    }//GEN-LAST:event_updateActionPerformed

    private void login2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login2ActionPerformed

    private void login3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login3ActionPerformed

    private void login4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login4ActionPerformed

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
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Email;
    public javax.swing.JButton add;
    public javax.swing.JTextField firstname1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JTextField lastname;
    private javax.swing.JButton login;
    private javax.swing.JButton login2;
    private javax.swing.JButton login3;
    private javax.swing.JButton login4;
    public javax.swing.JPasswordField password;
    public javax.swing.JComboBox<String> status;
    public javax.swing.JTextField uid;
    public javax.swing.JTextField un;
    public javax.swing.JButton update;
    private javax.swing.JLabel userid;
    public javax.swing.JComboBox<String> usertype1;
    // End of variables declaration//GEN-END:variables
}
