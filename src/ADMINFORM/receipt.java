/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMINFORM;

import config.PanelPrinter;
import config.Session;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class receipt extends javax.swing.JFrame {

   
   
    public receipt() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        s_id = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        i_id = new javax.swing.JLabel();
        quan = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        stat = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        userN = new javax.swing.JLabel();
        UserN = new javax.swing.JLabel();
        USERN = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        iname = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        p = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        b = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(51, 0, 51));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loggggoo-removebg-preview.png"))); // NOI18N
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 40));

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 60));

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel3.setText("Clothing");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 70, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Poblacion Ward ll, Minglanilla Cebu");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 200, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fashop.png"))); // NOI18N
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel6.setText("Fashion");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 70, -1));
        panel.add(s_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 110, 20));
        panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 254, -1));

        jLabel9.setText("User ID:");
        panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));
        panel.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 110, 20));
        panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 176, -1, -1));

        jLabel12.setText("Sales ID:");
        panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));
        panel.add(i_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 110, 20));
        panel.add(quan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 110, 20));

        jLabel16.setText("Quantity:");
        panel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabel17.setText("Item ID:");
        panel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 48, -1));
        panel.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 110, 20));

        jLabel19.setText("Date:");
        panel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 40, -1));
        panel.add(stat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 110, 20));

        jLabel23.setText("Status:");
        panel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 40, -1));

        jLabel7.setText("Cashier Name:");
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, 20));
        panel.add(userN, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 371, 25, -1));
        panel.add(UserN, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 377, 183, -1));

        USERN.setText("jLabel10");
        panel.add(USERN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, 40));

        jLabel10.setText("Item Name:");
        panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel13.setText("Price:");
        panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));
        panel.add(iname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 80, 20));
        panel.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 90, 20));

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 500, 430));

        p.setBackground(new java.awt.Color(153, 0, 153));
        p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pMouseExited(evt);
            }
        });
        p.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel1.setText("Print");
        p.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 40, -1));

        jPanel1.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 120, 40));

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

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel2.setText("Back");
        b.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 40, -1));

        jPanel1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 520, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMouseEntered
      p.setBackground(Color.white);
    }//GEN-LAST:event_pMouseEntered

    private void pMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMouseExited
       p.setBackground(new Color (153, 0, 153));
    }//GEN-LAST:event_pMouseExited

    private void bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseEntered
       b.setBackground(Color.white);
    }//GEN-LAST:event_bMouseEntered

    private void bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseExited
       b.setBackground(new Color (153,0,153));
    }//GEN-LAST:event_bMouseExited

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
       SALES s = new SALES();
       s.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_bMouseClicked

    private void pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMouseClicked
       
        
        JPanel myPanel = new JPanel();
        Session sess = Session.getInstance();
        userN.setText(""+sess.getUsername());
        PanelPrinter pPrint = new PanelPrinter(panel);
        pPrint.printPanel();
        
    }//GEN-LAST:event_pMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Session sess = Session.getInstance();
       userN.setText(""+sess.getUsername());
    }//GEN-LAST:event_formWindowActivated

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
        Session sess = Session.getInstance();
       userN.setText(""+sess.getUsername());
    }//GEN-LAST:event_panelMouseClicked

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
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel USERN;
    private javax.swing.JLabel UserN;
    private javax.swing.JPanel b;
    public javax.swing.JLabel date;
    public javax.swing.JLabel i_id;
    public javax.swing.JLabel id;
    public javax.swing.JLabel iname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel p;
    public javax.swing.JPanel panel;
    public javax.swing.JLabel price;
    public javax.swing.JLabel quan;
    public javax.swing.JLabel s_id;
    public javax.swing.JLabel stat;
    public javax.swing.JLabel userN;
    // End of variables declaration//GEN-END:variables
}
