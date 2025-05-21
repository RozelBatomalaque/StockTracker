/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMINFORM;

import ADMINFORM.ITEMS1;
import ADMINFORM.USER;
import config.Session;
import config.connectDB;
import config.passwordHasher;
import java.awt.Color;
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
public class addItem extends javax.swing.JFrame {

    /**
     * Creates new form USER
     */
    public addItem() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        supp = new javax.swing.JTextField();
        category = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        iid = new javax.swing.JTextField();
        quan = new javax.swing.JTextField();
        size = new javax.swing.JComboBox<>();
        status = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        userid = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        refresh = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        back = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

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

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("Price:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 20));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setText("Add Item");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 102));
        jLabel11.setText("Category:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 102));
        jLabel12.setText("Item ID:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 102));
        jLabel13.setText("Status:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));
        jPanel5.add(supp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 230, 30));
        jPanel5.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 230, 30));
        jPanel5.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 230, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 102));
        jLabel14.setText("Quantity:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 102));
        jLabel24.setText("Size:");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));
        jPanel5.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 230, 30));

        iid.setEnabled(false);
        jPanel5.add(iid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 230, 30));
        jPanel5.add(quan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 230, 30));

        size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Meduim", "Large", "Extra Large", "Extra Extra Large" }));
        jPanel5.add(size, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 230, 30));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Out of Stock" }));
        jPanel5.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 230, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 102));
        jLabel16.setText("Supplier:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 0, 102));
        jLabel29.setText("Item Name:");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 560, 380));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 690, 450));

        jPanel3.setBackground(new java.awt.Color(153, 0, 153));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("__________________");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 350, 180, 22);

        userid.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        userid.setForeground(new java.awt.Color(51, 0, 51));
        userid.setText("ID");
        jPanel3.add(userid);
        userid.setBounds(90, 410, 20, 22);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("Current ID:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(50, 380, 110, 22);

        refresh.setBackground(new java.awt.Color(153, 0, 153));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshMouseExited(evt);
            }
        });
        refresh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("REFRESH");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        refresh.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 70, 30));

        jPanel3.add(refresh);
        refresh.setBounds(0, 250, 200, 30);

        add.setBackground(new java.awt.Color(153, 0, 153));
        add.setEnabled(false);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 0, 51));
        jLabel15.setText("ADD");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        add.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 30, 30));

        jPanel3.add(add);
        add.setBounds(0, 90, 200, 30);

        update.setBackground(new java.awt.Color(153, 0, 153));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 0, 51));
        jLabel17.setText("UPDATE");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });
        update.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 60, 30));

        jPanel3.add(update);
        update.setBounds(0, 130, 200, 30);

        delete.setBackground(new java.awt.Color(153, 0, 153));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 0, 51));
        jLabel18.setText("DELETE");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });
        delete.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 60, 30));

        jPanel3.add(delete);
        delete.setBounds(0, 170, 200, 30);

        back.setBackground(new java.awt.Color(153, 0, 153));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 0, 51));
        jLabel19.setText("BACK");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });
        back.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 50, 30));

        jPanel3.add(back);
        back.setBounds(0, 210, 200, 30);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 450));

        jPanel10.setBackground(new java.awt.Color(51, 0, 51));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Admin for Assocation");
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, -1, 30));

        username.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Admin");
        jPanel10.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 60, 30));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin.png"))); // NOI18N
        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, 40));

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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseExited

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshMouseClicked

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
        refresh.setBackground(Color.white);
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        refresh.setBackground(new Color(153, 0 , 153));
    }//GEN-LAST:event_refreshMouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
String item_name = name.getText().trim();
String Category = category.getText().trim();
String Quantity = quan.getText().trim().toLowerCase();
String Size = size.getSelectedItem().toString().trim();
String Price = price.getText().trim();
String Supplier = supp.getText().trim();
String Status = status.getSelectedItem().toString().trim();  // ✅ Added status

connectDB connect = new connectDB();

// Validation
if (item_name.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter your Item Name!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Category.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Category!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Quantity.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Quantity!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Size.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Size!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Price.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Price!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Supplier.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Supplier!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Status.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please select a Status!", "Error", JOptionPane.WARNING_MESSAGE);
} else {
    try {
        // Check if item already exists
        if (connect.fieldExists("items", "name", item_name)) {
            JOptionPane.showMessageDialog(null, "Item name already exists!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            // ✅ Updated SQL query to include the status field
            String sql = "INSERT INTO items (name, category, size, quantity, price, supplier, status) VALUES (?, ?, ?, ?, ?, ?, ?)";

            // ✅ Pass all 7 parameters to the insertData method
            int rowsInserted = connect.insertData(sql, item_name, Category, Size, Quantity, Price, Supplier, Status);

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Item Added Successfully!");

                // Open items window
                new ITEMS1().setVisible(true);

                // Close current window
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(category);
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


    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseExited

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
    String item_name = name.getText().trim();
String Category = category.getText().trim();
String Quantity = quan.getText().trim().toLowerCase();
String Size = size.getSelectedItem().toString().trim();
String Price = price.getText().trim();
String Supplier = supp.getText().trim();
String Status = status.getSelectedItem().toString().trim();  // ✅ Added status

connectDB connect = new connectDB();

// Validation
if (item_name.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter your Item Name!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Category.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Category!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Quantity.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Quantity!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Size.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Size!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Price.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Price!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Supplier.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Supplier!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Status.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please select a Status!", "Error", JOptionPane.WARNING_MESSAGE);
} else {
    try {
        // Check if item already exists
        if (connect.fieldExists("items", "name", item_name)) {
            JOptionPane.showMessageDialog(null, "Item name already exists!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            // ✅ Updated SQL query to include the status field
            String sql = "INSERT INTO items (name, category, size, quantity, price, supplier, status) VALUES (?, ?, ?, ?, ?, ?, ?)";

            // ✅ Pass all 7 parameters to the insertData method
            int rowsInserted = connect.insertData(sql, item_name, Category, Size, Quantity, Price, Supplier, Status);

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Item Added Successfully!");

                // Open items window
                new ITEMS1().setVisible(true);

                // Close current window
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(category);
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


    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
       add.setBackground(Color.white);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
       add.setBackground(new Color (153, 0 , 153));
    }//GEN-LAST:event_addMouseExited

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
 if (name.getText().isEmpty() || category.getText().isEmpty() || supp.getText().isEmpty() ||
    price.getText().isEmpty() || quan.getText().isEmpty() || iid.getText().isEmpty() || 
    size.getSelectedItem() == null || status.getSelectedItem() == null) {   // ✅ Added status validation

    JOptionPane.showMessageDialog(null, "All Fields Are Required!");

} else {
    connectDB cdb = new connectDB();
    
    try {
        int userId;

        // ✅ Validate and parse User ID
        try {
            userId = Integer.parseInt(iid.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid User ID!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // ✅ Perform the update with status included
        int rowsUpdated = cdb.updateData(
            "UPDATE items SET name = ?, category = ?, supplier = ?, quantity = ?, price = ?, size = ?, status = ? WHERE i_id = ?",
            name.getText().trim(),                           // Item name
            category.getText().trim(),                       // Category
            supp.getText().trim(),                           // Supplier
            quan.getText().trim(),                           // Quantity (VARCHAR value)
            price.getText().trim(),                          // Price
            size.getSelectedItem().toString().trim(),        // Size
            status.getSelectedItem().toString().trim(),      // ✅ Added status
            String.valueOf(userId)                           // User ID
        );

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Item updated successfully!");
            this.dispose();
            new ITEMS1().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Update failed! Item ID not found.", "Update Error", JOptionPane.ERROR_MESSAGE);
        }
        
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        cdb.closeConnection();
    }
}


    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseExited

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
   if (name.getText().isEmpty() || category.getText().isEmpty() || supp.getText().isEmpty() ||
    price.getText().isEmpty() || quan.getText().isEmpty() || iid.getText().isEmpty() || 
    size.getSelectedItem() == null || status.getSelectedItem() == null) {   // ✅ Added status validation

    JOptionPane.showMessageDialog(null, "All Fields Are Required!");

} else {
    connectDB cdb = new connectDB();
    
    try {
        int userId;

        // ✅ Validate and parse User ID
        try {
            userId = Integer.parseInt(iid.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid User ID!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // ✅ Perform the update with status included
        int rowsUpdated = cdb.updateData(
            "UPDATE items SET name = ?, category = ?, supplier = ?, quantity = ?, price = ?, size = ?, status = ? WHERE i_id = ?",
            name.getText().trim(),                           // Item name
            category.getText().trim(),                       // Category
            supp.getText().trim(),                           // Supplier
            quan.getText().trim(),                           // Quantity (VARCHAR value)
            price.getText().trim(),                          // Price
            size.getSelectedItem().toString().trim(),        // Size
            status.getSelectedItem().toString().trim(),      // ✅ Added status
            String.valueOf(userId)                           // User ID
        );

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Item updated successfully!");
            this.dispose();
            new ITEMS1().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Update failed! Item ID not found.", "Update Error", JOptionPane.ERROR_MESSAGE);
        }
        
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        cdb.closeConnection();
    }
}


    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
       update.setBackground(Color .white);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
       update.setBackground(new Color (153, 0 , 153));
    }//GEN-LAST:event_updateMouseExited

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
       delete.setBackground(Color.white);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(new Color (153, 0 , 153));
    }//GEN-LAST:event_deleteMouseExited

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
         ITEMS1 m = new ITEMS1();
      m.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
      ITEMS1 m = new ITEMS1();
      m.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setBackground(Color.white);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setBackground(new Color(153, 0 ,153));
    }//GEN-LAST:event_backMouseExited

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
            java.util.logging.Logger.getLogger(addItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel add;
    private javax.swing.JPanel back;
    public javax.swing.JTextField category;
    private javax.swing.JPanel delete;
    public javax.swing.JTextField iid;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JTextField name;
    public javax.swing.JTextField price;
    public javax.swing.JTextField quan;
    private javax.swing.JPanel refresh;
    public javax.swing.JComboBox<String> size;
    public javax.swing.JComboBox<String> status;
    public javax.swing.JTextField supp;
    public javax.swing.JPanel update;
    private javax.swing.JLabel userid;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
