/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author Asus
 */
public class administrasi extends javax.swing.JFrame {

    private double total;
    private String ktp;
    private String nm;
    private String hp;
    private String jk;
    private String alm;
    private String masuk;
    private String keluar;
    private String user;

    /**
     * Creates new form administrasi
     */
    
    public administrasi(double totalHarga,String username) {
        initComponents();
        setTitle("Total");
        setSize(500,300);
        setLocationRelativeTo(null);
        this.user=username;
//        reser = reservasi;
//        ktp = no_ktp;
//         nm = nama;
//         alm = alamat;
//         hp = no_hp;
//         jk = jenis_kamar;
//         masuk = tgl_masuk;
//         keluar = tgl_keluar;
//        total = totalHarga;
        keluaran.setText(String.valueOf(totalHarga));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        keluaran = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        selesai = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("HARGA TOTAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 140, 14));

        keluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluaranActionPerformed(evt);
            }
        });
        getContentPane().add(keluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 190, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("ADMINISTRASI");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 220, -1));

        selesai.setText("SELESAI");
        selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selesaiActionPerformed(evt);
            }
        });
        getContentPane().add(selesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 110, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/Image/payment2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -120, 830, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keluaranActionPerformed

    private void selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selesaiActionPerformed
        // TODO add your handling code here:
//        reser.book (ktp,nm,alm,hp,jk,masuk,keluar,total);
        //this.dispose();
        dispose();
        new ViewAkunClient(user).setVisible(true);
    }//GEN-LAST:event_selesaiActionPerformed

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
            java.util.logging.Logger.getLogger(administrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField keluaran;
    private javax.swing.JButton selesai;
    // End of variables declaration//GEN-END:variables
}