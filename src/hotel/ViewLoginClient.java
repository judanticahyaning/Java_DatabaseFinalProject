/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ViewLoginClient extends javax.swing.JFrame {
    ModelLoginClient ModelLogin  = new ModelLoginClient();
    JLabel lbackground = new JLabel();
    ViewLoginClient loginC;
    public ViewLoginClient() {
        initComponents();
        setTitle ("CLIENT");
        setSize(550,400);
        
        setLocationRelativeTo(null);
        this.loginC = this;
//        add(lbackground);
//    
//    lbackground.setIcon(new ImageIcon(getClass().getResource("Image/hotel2.jpg")));
//    lbackground.setBounds(0,0,400,320);
//        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameclient = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        buatakun = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        passwordclient = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UPN HOME STAY");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 320, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        usernameclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameclientActionPerformed(evt);
            }
        });
        getContentPane().add(usernameclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 166, 31));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Belum Punya Akun?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        buatakun.setText("Buat Akun");
        buatakun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buatakunActionPerformed(evt);
            }
        });
        getContentPane().add(buatakun, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 130, 40));

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 80, 40));

        Back.setText("Kembali");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 80, 40));
        getContentPane().add(passwordclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 166, 31));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/Image/hotel2.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, -20, 780, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameclientActionPerformed

    private void buatakunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buatakunActionPerformed
        // TODO add your handling code here:
        dispose();
        new ViewBuatAkun().setVisible(true);
    }//GEN-LAST:event_buatakunActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        int dialogbutton=JOptionPane.showOptionDialog(this, "Yakin ingin kembali?", "Warning",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,null,null);
        if (dialogbutton==JOptionPane.YES_OPTION){
            this.dispose();
            new ViewMenuUtama().setVisible(true);
        }
    }//GEN-LAST:event_BackActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        String username, password;
        username=usernameclient.getText().toString();
        password=this.passwordclient.getText().toString();
        ModelLogin.login (username, password,loginC);
    }//GEN-LAST:event_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(ViewLoginClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLoginClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLoginClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLoginClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLoginClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Login;
    private javax.swing.JButton buatakun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField passwordclient;
    private javax.swing.JTextField usernameclient;
    // End of variables declaration//GEN-END:variables
}
