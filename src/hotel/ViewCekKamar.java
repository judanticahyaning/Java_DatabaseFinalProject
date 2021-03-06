/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class ViewCekKamar extends javax.swing.JFrame {

    /**
     * Creates new form ViewCekKamar
     */
    
    public ViewCekKamar() {
        initComponents();
        setTitle ("Cek Kamar");
        setSize(530,400);
        
        setLocationRelativeTo(null);
        load_cek_kamar();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCekKamar = new javax.swing.JTable();
        jBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cek Kamar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 20, 220, 30);

        jTableCekKamar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Jenis Kamar", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jTableCekKamar);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 490, 220);

        jBack.setText("Kembali");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });
        getContentPane().add(jBack);
        jBack.setBounds(420, 290, 80, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/Image/hotel9.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-360, -20, 900, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        // TODO add your handling code here:
        dispose();
        new ViewAkunClient().setVisible (true);
        
       // dispose();
        //ViewAkunClient viewakun = new ViewAkunClient();
        ///viewakun.setVisible(true);
    }//GEN-LAST:event_jBackActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCekKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCekKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCekKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCekKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCekKamar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCekKamar;
    // End of variables declaration//GEN-END:variables

    private void load_cek_kamar() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Jenis Kamar");
        dtm.addColumn("Stock");
        
        try {
            java.sql.Connection con; //METHOD MEMBUAT KONEKSI
            con = new KoneksiDatabase().connect();
            String sql = "SELECT * FROM `check_kamar`";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                dtm.addRow(new Object[]{
                    rs.getString("jenis_kamar"),
                    rs.getString("stok"),
                    
                });
            }
            s.close();
            con.close();
           
            jTableCekKamar.setModel(dtm);
        } catch (SQLException ex ) {
            Logger.getLogger(ViewDataPemesan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "You got an Error!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    
    }
}
