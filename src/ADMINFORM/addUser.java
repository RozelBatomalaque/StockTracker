/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMINFORM;

import ADMINFORM.USER;
import AUTHENTICATION.LOGIN;
import config.Session;
import config.connectDB;
import config.passwordHasher;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
     public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;
    //public String answer = "No stored security answers";
   // public String question = "No stored security questions";

    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();

        Path filePath = Paths.get("src/userImages", fileName);
        boolean fileExists = Files.exists(filePath);

        if (fileExists) {
            return 1;
        } else {
            return 0;
        }

    }
    
    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
    try {
        // Read the image file
        File imageFile = new File(imagePath);
        BufferedImage image = ImageIO.read(imageFile);

        // Get the original width and height of the image
        int originalWidth = image.getWidth();
        int originalHeight = image.getHeight();

        // Calculate the new height based on the desired width and the aspect ratio
        int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);

        return newHeight;
    } catch (IOException ex) {
        System.out.println("No image found!");
    }

    return -1;
    }
    
    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
    
    public void imageUpdater(String existingFilePath, String newFilePath){
    File existingFile = new File(existingFilePath);
    if (existingFile.exists()) {
        String parentDirectory = existingFile.getParent();
        File newFile = new File(newFilePath);
        String newFileName = newFile.getName();
        File updatedFile = new File(parentDirectory, newFileName);
        existingFile.delete();
        try {
            Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Image updated successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while updating the image: "+e);
        }
    } else {
        try{
            Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch(IOException e){
            System.out.println("Error on update!");
        }
    }
   }
    
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    public static String usern;
    
    public boolean duplicateCheck(){
        config.connectDB db = new config.connectDB();
        
        try{
            String query = "SELECT * FROM users WHERE username = '" + username.getText() + "'";
            ResultSet resultSet = db.getData(query);
            if(resultSet.next()){
                usern = resultSet.getString("username");
                if(usern.equals(username.getText())){
                    JOptionPane.showMessageDialog(null, "Username is Already in used");
                    username.setText("");
                }
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
    }
    
    public boolean updateCheck(){
        connectDB db = new connectDB();
        
        try{
            String query = "SELECT * FROM users WHERE (username = '"+username.getText()+"') AND id != '"+uid.getText()+"'";
            ResultSet resultSet = db.getData(query);
            if(resultSet.next()){
                usern= resultSet.getString("username");
                if(usern.equals(username.getText())){
                    JOptionPane.showMessageDialog(null, "Username is Already in used");
                    username.setText("");
                }
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        usertype1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        firstname1 = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        sq = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        sa = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        images = new javax.swing.JLabel();
        remove = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        select = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        back = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
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

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("Firstname:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("User Type:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, 20));

        usertype1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Sales Clerk" }));
        usertype1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertype1ActionPerformed(evt);
            }
        });
        jPanel5.add(usertype1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 230, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setText("Lastname:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 102));
        jLabel11.setText("Username:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 102));
        jLabel12.setText("Email:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel5.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 230, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 102));
        jLabel13.setText("User ID:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        firstname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname1ActionPerformed(evt);
            }
        });
        jPanel5.add(firstname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 230, 30));
        jPanel5.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 230, 30));
        jPanel5.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, 30));
        jPanel5.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 230, 30));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        jPanel5.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 230, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 102));
        jLabel14.setText("Password:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        uid.setEnabled(false);
        jPanel5.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 230, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 102));
        jLabel16.setText("Security Answer:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        sq.setText("What is your favorite color?");
        sq.setEnabled(false);
        jPanel5.add(sq, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 230, 30));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 102));
        jLabel20.setText("Status:");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));
        jPanel5.add(sa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 230, 30));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 102));
        jLabel21.setText("Security Question:");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        images.setText("jLabel1");
        jPanel1.add(images, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 190, 150));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 210, 160));

        remove.setBackground(new java.awt.Color(51, 0, 51));
        remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeMouseExited(evt);
            }
        });
        remove.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Remove");
        remove.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 30));

        jPanel5.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 100, 30));

        select.setBackground(new java.awt.Color(51, 0, 51));
        select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectMouseExited(evt);
            }
        });
        select.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select");
        select.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 50, 30));

        jPanel5.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 100, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 450));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 870, 450));

        jPanel3.setBackground(new java.awt.Color(153, 0, 153));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("__________________");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 340, 180, 22);

        userid.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        userid.setForeground(new java.awt.Color(51, 0, 51));
        userid.setText("ID");
        jPanel3.add(userid);
        userid.setBounds(90, 400, 20, 22);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("Current ID:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(50, 370, 110, 22);

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
        refresh.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 30));

        jPanel3.add(refresh);
        refresh.setBounds(0, 230, 200, 30);

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
        add.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 40, 30));

        jPanel3.add(add);
        add.setBounds(0, 80, 200, 30);

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
        update.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 30));

        jPanel3.add(update);
        update.setBounds(0, 130, 200, 30);

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
        back.setBounds(0, 180, 200, 30);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 450));

        jPanel10.setBackground(new java.awt.Color(51, 0, 51));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Admin for Assocation");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, -1, 30));

        username.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Admin");
        jPanel10.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 60, 30));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin.png"))); // NOI18N
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, 40));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loggggoo-removebg-preview.png"))); // NOI18N
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 40));

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
          Session sess = Session.getInstance();
          userid.setText(""+sess.getId());
    }//GEN-LAST:event_formWindowActivated

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usertype1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertype1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertype1ActionPerformed

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

                        new USER().setVisible(true);

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
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseExited

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        
        String First_name = firstname1.getText().trim();
        String Last_name = lastname.getText().trim();
        String email = Email.getText().trim().toLowerCase();
        String User_type = usertype1.getSelectedItem().toString().trim();
        String user_name = un.getText().trim();
        String Password = password.getText().trim();
        String Sec = sq.getText();
        String Sa = sa.getText();
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
        } else if(Sec.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter a Security Question!", "Error", JOptionPane.WARNING_MESSAGE);
        }else if(Sa.isEmpty()){
             JOptionPane.showMessageDialog(null, "Please enter a Security Answer!", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
           
            try {
                // ✅ Corrected fieldExists method calls by adding "users" table name
                if (connect.fieldExists("users", "username", user_name)) {
                    JOptionPane.showMessageDialog(null, "Username already taken!", "Error", JOptionPane.WARNING_MESSAGE);
                } else if (connect.fieldExists("users", "email", email)) {
                    JOptionPane.showMessageDialog(null, "Email already used!", "Error", JOptionPane.WARNING_MESSAGE);
                } else {
                    // ✅ Hash the password before storing
                    String hashedPassword = passwordHasher.hashPassword(Password);

                    String sql = "INSERT INTO users (firstname, lastname, username, email, usertype, password, status, security_question,security_answer, images) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    int rowsInserted = connect.insertData(sql, First_name, Last_name, user_name, email, User_type, hashedPassword, "Pending","What is your favorite Color?",Sa, destination);

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
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(Color .white);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
       add.setBackground(new Color(153, 0 , 153));
    }//GEN-LAST:event_addMouseExited

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
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
                        new USER().setVisible(true);
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
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseExited

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
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
                        "UPDATE users SET firstname = ?, lastname = ?, username = ?, email = ?, usertype = ?, password = ?, status = ?, images = ? WHERE id = ?",
                        firstname1.getText(),
                        lastname.getText(),
                        un.getText(),
                        Email.getText(),
                        usertype1.getSelectedItem().toString(),
                        password.getText(),
                        status.getSelectedItem().toString(),
                        destination,
                        userId
                    );

                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(null, "Account updated successfully!");
                        this.dispose();
                        new USER().setVisible(true);
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
    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(Color.white);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
       update.setBackground(new Color (153, 0 , 153));
    }//GEN-LAST:event_updateMouseExited

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
         USER U = new USER();
       U.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       USER U = new USER();
       U.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
       back.setBackground(Color .white);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
      back.setBackground(new Color (153, 0 , 153));
    }//GEN-LAST:event_backMouseExited

    private void firstname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname1ActionPerformed

    private void selectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseEntered
       select.setBackground(new Color (153, 0 , 153));
    }//GEN-LAST:event_selectMouseEntered

    private void selectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseExited
      select.setBackground(new Color (51, 0, 51));
    }//GEN-LAST:event_selectMouseExited

    private void removeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseEntered
       remove.setBackground(new Color (153, 0, 153));
    }//GEN-LAST:event_removeMouseEntered

    private void removeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseExited
        remove.setBackground(new Color (51, 0, 51));
    }//GEN-LAST:event_removeMouseExited

    private void selectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseClicked
       JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                selectedFile = fileChooser.getSelectedFile();
                destination = "src/userImages/" + selectedFile.getName();
                path  = selectedFile.getAbsolutePath();

                if(FileExistenceChecker(path) == 1){
                    JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                    destination = "";
                    path="";
                }else{
                    images.setIcon(ResizeImage(path, null, images));
                    select.setEnabled(true);
                    remove.setEnabled(false);
                }
            } catch (Exception ex) {
                System.out.println("File Error!");
            }
        }
    }//GEN-LAST:event_selectMouseClicked

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
        images.setIcon(null);
        destination = "";
        path = "";
        select.setEnabled(true);
        remove.setEnabled(false);  
    }//GEN-LAST:event_removeMouseClicked

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
    public javax.swing.JPanel add;
    private javax.swing.JPanel back;
    public javax.swing.JTextField firstname1;
    public javax.swing.JLabel images;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JTextField lastname;
    public javax.swing.JPasswordField password;
    private javax.swing.JPanel refresh;
    public javax.swing.JPanel remove;
    private javax.swing.JTextField sa;
    public javax.swing.JPanel select;
    private javax.swing.JTextField sq;
    public javax.swing.JComboBox<String> status;
    public javax.swing.JTextField uid;
    public javax.swing.JTextField un;
    public javax.swing.JPanel update;
    private javax.swing.JLabel userid;
    private javax.swing.JLabel username;
    public javax.swing.JComboBox<String> usertype1;
    // End of variables declaration//GEN-END:variables
}
