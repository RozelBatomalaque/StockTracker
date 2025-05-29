/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMINFORM;

import config.Session;
import config.connectDB;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Administrator
 */
public class USER extends javax.swing.JFrame {

    /**
     * Creates new form USER
     */
    public USER() {
        initComponents();
        displayData();
    }
    
    public void displayData(){
        try{
            connectDB dbc = new connectDB();
            ResultSet rs = dbc.getData("SELECT * FROM users");
            usersTable.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
        }
        
    
    }
    
    // Method to refresh data in JTable
private void refreshTable() {
    try {
        // Database connection (Replace with your actual DB connection details)
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tracker", "root", "");
        String query = "SELECT * FROM users";  // Replace with your actual table name
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        // Get the table model
        DefaultTableModel model = (DefaultTableModel) usersTable.getModel();
        model.setRowCount(0);  // Clear existing rows

        // Loop through result set and add data to the table
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("id"),
                rs.getString("firstname"),
                rs.getString("lastname"),
                rs.getString("email"),
                rs.getString("usertype"),
                rs.getString("username"),
                rs.getString("password"),
                rs.getString("status")
                
            });
        }

        rs.close();
        stmt.close();
        conn.close();
        
        System.out.println("Table refreshed successfully.");
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error refreshing data: " + e.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        userid = new javax.swing.JLabel();
        a = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        e = new javax.swing.JPanel();
        add1 = new javax.swing.JLabel();
        r = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        b = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        d = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 0, 153));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("________________");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 340, 170, 22);

        userid.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        userid.setForeground(new java.awt.Color(51, 0, 51));
        userid.setText("ID");
        jPanel3.add(userid);
        userid.setBounds(90, 410, 20, 22);

        a.setBackground(new java.awt.Color(153, 0, 153));
        a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aMouseExited(evt);
            }
        });
        a.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(51, 0, 51));
        add.setText("Add User");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        a.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 40));

        jPanel3.add(a);
        a.setBounds(0, 70, 200, 40);

        e.setBackground(new java.awt.Color(153, 0, 153));
        e.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eMouseExited(evt);
            }
        });
        e.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        add1.setForeground(new java.awt.Color(51, 0, 51));
        add1.setText("Edit User");
        add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add1MouseExited(evt);
            }
        });
        e.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 40));

        jPanel3.add(e);
        e.setBounds(0, 120, 200, 40);

        r.setBackground(new java.awt.Color(153, 0, 153));
        r.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rMouseExited(evt);
            }
        });
        r.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Refresh");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        r.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 60, 20));

        jPanel3.add(r);
        r.setBounds(0, 270, 200, 40);

        b.setBackground(new java.awt.Color(153, 0, 153));
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bMouseExited(evt);
            }
        });
        b.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        b.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 50, 20));

        jPanel3.add(b);
        b.setBounds(0, 170, 200, 40);

        d.setBackground(new java.awt.Color(153, 0, 153));
        d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dMouseExited(evt);
            }
        });
        d.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("Delete");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        d.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 50, 20));

        jPanel3.add(d);
        d.setBounds(0, 220, 200, 40);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("Current ID:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(50, 370, 130, 22);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 460));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "username", "password", "status"
            }
        ));
        jScrollPane1.setViewportView(usersTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 460));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 690, 460));

        jPanel10.setBackground(new java.awt.Color(51, 0, 51));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Admin for Assocation");
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, -1, 30));

        username.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Admin");
        jPanel10.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 60, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin.png"))); // NOI18N
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, 40));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loggggoo-removebg-preview.png"))); // NOI18N
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 40));

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
          Session sess = Session.getInstance();
          userid.setText(""+sess.getId());
          username.setText(""+sess.getUsername());
    }//GEN-LAST:event_formWindowActivated

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
      addUser a = new addUser();
      a.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_addMouseClicked

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addMouseExited

    private void aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseClicked
      addUser a = new addUser();
      a.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_aMouseClicked

    private void aMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseEntered
       a.setBackground(Color.white);
    }//GEN-LAST:event_aMouseEntered

    private void aMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseExited
       a.setBackground(new Color (153,0,153));
    }//GEN-LAST:event_aMouseExited

    private void add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseClicked
        int rowIndex = usersTable.getSelectedRow();

if (rowIndex < 0) {
    JOptionPane.showMessageDialog(null, "Please Select An Item!");
} else {
    addUser a = new addUser();
    try {
        connectDB cdb = new connectDB();
        TableModel tbl = usersTable.getModel();
        
        String userId = tbl.getValueAt(rowIndex, 0).toString();
        
        ResultSet rs = cdb.getData("SELECT * FROM users WHERE id = '" + userId + "'");
        
        if (rs.next()) {
            a.uid.setText(rs.getString("id")); 
            a.firstname1.setText(rs.getString("firstname"));
            a.lastname.setText(rs.getString("lastname"));
            a.un.setText(rs.getString("username"));
            a.Email.setText(rs.getString("email"));
            a.password.setText(rs.getString("password"));
            
            String userStatus = rs.getString("status");
            String userType = rs.getString("usertype");
            
            a.status.setSelectedItem(userStatus != null ? userStatus : ""); 
            a.usertype1.setSelectedItem(userType != null ? userType : "");

            a.add.setEnabled(true);
            a.update.setEnabled(false);
            
            a.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "User data not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    }//GEN-LAST:event_add1MouseClicked

    private void add1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_add1MouseExited

    private void eMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eMouseClicked
        int rowIndex = usersTable.getSelectedRow();

if (rowIndex < 0) {
    JOptionPane.showMessageDialog(null, "Please Select An Item!");
} else {
    addUser a = new addUser();
    try {
        connectDB cdb = new connectDB();
        TableModel tbl = usersTable.getModel();
        
        String userId = tbl.getValueAt(rowIndex, 0).toString();
        
        ResultSet rs = cdb.getData("SELECT * FROM users WHERE id = '" + userId + "'");
        
        if (rs.next()) {
            a.uid.setText(rs.getString("id")); 
            a.firstname1.setText(rs.getString("firstname"));
            a.lastname.setText(rs.getString("lastname"));
            a.un.setText(rs.getString("username"));
            a.Email.setText(rs.getString("email"));
            a.password.setText(rs.getString("password"));
          
            
            String userStatus = rs.getString("status");
            String userType = rs.getString("usertype");
            
            a.status.setSelectedItem(userStatus != null ? userStatus : ""); 
            a.usertype1.setSelectedItem(userType != null ? userType : "");

            a.add.setEnabled(true);
            a.update.setEnabled(false);
            a.images.setIcon(a.ResizeImage(rs.getString("images"), null, a.images));
                    a.oldpath = rs.getString("images");
                    a.path = rs.getString("images");
                    a.destination = rs.getString("images");
                    a.add.setEnabled(false);
                    a.update.setEnabled(true);
                    a.password.setEnabled(false);

                    if(rs.getString("images").isEmpty()){
                        a.select.setEnabled(true);
                        a.remove.setEnabled(false);
                    }else{
                        a.select.setEnabled(false);
                        a.remove.setEnabled(true);
                    }
            
            a.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "User data not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    }//GEN-LAST:event_eMouseClicked

    private void eMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eMouseEntered
        e.setBackground(Color .white);
    }//GEN-LAST:event_eMouseEntered

    private void eMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eMouseExited
        e.setBackground(new Color (153, 0 , 153));
    }//GEN-LAST:event_eMouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseExited

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
        ManagerDashboard m = new ManagerDashboard();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bMouseClicked

    private void bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseEntered
        b.setBackground(Color.white);
    }//GEN-LAST:event_bMouseEntered

    private void bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseExited
        b.setBackground(new Color(153, 0 , 153));
    }//GEN-LAST:event_bMouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        refreshTable();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void rMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rMouseClicked
       refreshTable();
    }//GEN-LAST:event_rMouseClicked

    private void rMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rMouseEntered
        r.setBackground(Color.white);
    }//GEN-LAST:event_rMouseEntered

    private void rMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rMouseExited
        r.setBackground(new Color(153,0, 153));
    }//GEN-LAST:event_rMouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
      int rowIndex = usersTable.getSelectedRow();

if (rowIndex < 0) {
    JOptionPane.showMessageDialog(null, "Please Select An Item!");
} else {
    int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        connectDB cdb = new connectDB();
        try {
            TableModel tbl = usersTable.getModel();
            String userId = tbl.getValueAt(rowIndex, 0).toString();

            // ✅ Delete the item from the database
            int rowsDeleted = cdb.updateData("DELETE FROM users WHERE id = ?", userId);

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Item deleted successfully!");
                
                // Refresh the table to show the updated data
                ((DefaultTableModel) usersTable.getModel()).removeRow(rowIndex);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete item! Item ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            cdb.closeConnection();
        }
    }
}

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

    private void dMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dMouseClicked
       int rowIndex = usersTable.getSelectedRow();

if (rowIndex < 0) {
    JOptionPane.showMessageDialog(null, "Please Select An Item!");
} else {
    int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        connectDB cdb = new connectDB();
        try {
            TableModel tbl = usersTable.getModel();
            String userId = tbl.getValueAt(rowIndex, 0).toString();

            // ✅ Delete the item from the database
            int rowsDeleted = cdb.updateData("DELETE FROM users WHERE id = ?", userId);

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Item deleted successfully!");
                
                // Refresh the table to show the updated data
                ((DefaultTableModel) usersTable.getModel()).removeRow(rowIndex);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete item! Item ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            cdb.closeConnection();
        }
    }
}

    }//GEN-LAST:event_dMouseClicked

    private void dMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dMouseEntered
        d.setBackground(Color.white);
    }//GEN-LAST:event_dMouseEntered

    private void dMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dMouseExited
        d.setBackground(new Color (153, 0 , 153));
    }//GEN-LAST:event_dMouseExited

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
            java.util.logging.Logger.getLogger(USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new USER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel a;
    private javax.swing.JLabel add;
    private javax.swing.JLabel add1;
    private javax.swing.JPanel b;
    private javax.swing.JPanel d;
    private javax.swing.JPanel e;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel r;
    private javax.swing.JLabel userid;
    private javax.swing.JLabel username;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
