
package hotel;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Fhrezha
 */
public class ViewMenuUtama extends javax.swing.JFrame {
    JLabel lbackground = new JLabel();
    
    public ViewMenuUtama() {
        initComponents();
        setTitle ("MENU UTAMA");
        setSize(550,400);
        setLocationRelativeTo(null);
        
        
        //add(lbackground);
        //add(jLabel2);
    
        //jLabel2.setBackground(Color.white);
        
        //jLabel2.setForeground(Color.white);
        
//        lbackground.setIcon(new ImageIcon(getClass().getResource("Image/hotel2.jpg")));
//        lbackground.setBounds(0,0,400,400);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NamaHotel = new javax.swing.JLabel();
        MenuAdmin = new javax.swing.JButton();
        MenuClient = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME !!!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        NamaHotel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        NamaHotel.setText("UPN HOME STAY");
        getContentPane().add(NamaHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        MenuAdmin.setText("ADMIN");
        MenuAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdminActionPerformed(evt);
            }
        });
        getContentPane().add(MenuAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 170, 80));

        MenuClient.setText("CLIENT");
        MenuClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClientActionPerformed(evt);
            }
        });
        getContentPane().add(MenuClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 170, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/Image/hotel3.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, -160, 1000, 667));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdminActionPerformed
        dispose();
        new ViewLoginAdmin().setVisible (true);
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuAdminActionPerformed

    private void MenuClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClientActionPerformed
        // TODO add your handling code here: 
        dispose();
        new ViewLoginClient().setVisible(true);
    }//GEN-LAST:event_MenuClientActionPerformed

    public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MenuAdmin;
    private javax.swing.JButton MenuClient;
    private javax.swing.JLabel NamaHotel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
