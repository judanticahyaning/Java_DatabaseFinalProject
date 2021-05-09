/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.lang.Math;

/**
 *
 * @author Asus
 */
public class ViewBooking extends javax.swing.JFrame {
    ModelReservasi MdlReserved = new ModelReservasi ();
    SimpleDateFormat Format = new SimpleDateFormat("yyyy-MM-dd"); //mm-dd-yyyy
    JLabel lbackground = new JLabel();
    private String user;

    /**
     * Creates new form ViewBooking
     */
    public ViewBooking(String username) {
        initComponents();
        setTitle ("Booking Room");
        setSize(550,400);
        setLocationRelativeTo(null);
        
        this.user=username;
        usernamebooking.setText(user);
        usernamebooking.setEditable(false);
 
    Username.setForeground(Color.black);
    jLabel1.setForeground(Color.black);
    jLabel2.setForeground(Color.black);
    jLabel3.setForeground(Color.black);
    jLabel4.setForeground(Color.black);
    jLabel5.setForeground(Color.black);
    jLabel6.setForeground(Color.black);
    jLabel7.setForeground(Color.black);
    jLabel8.setForeground(Color.black);
    
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jNo_Ktp = new javax.swing.JTextField();
        jNama = new javax.swing.JTextField();
        jAlamat = new javax.swing.JTextField();
        jNo_Hp = new javax.swing.JTextField();
        jSubmit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboKamar = new javax.swing.JComboBox<>();
        Back = new javax.swing.JButton();
        jDateMasuk = new com.toedter.calendar.JDateChooser();
        jDateKeluar = new com.toedter.calendar.JDateChooser();
        Username = new javax.swing.JLabel();
        usernamebooking = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pesan Kamar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 10, 190, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("No KTP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 90, 43, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 120, 33, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 150, 43, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("No HP");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(58, 182, 37, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tanggal Masuk");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 240, 91, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Tanggal Keluar");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 270, 90, 15);
        getContentPane().add(jNo_Ktp);
        jNo_Ktp.setBounds(160, 90, 320, 20);
        getContentPane().add(jNama);
        jNama.setBounds(160, 120, 320, 20);
        getContentPane().add(jAlamat);
        jAlamat.setBounds(160, 150, 320, 20);

        jNo_Hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNo_HpActionPerformed(evt);
            }
        });
        getContentPane().add(jNo_Hp);
        jNo_Hp.setBounds(160, 180, 320, 20);

        jSubmit.setText("Pesan");
        jSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(jSubmit);
        jSubmit.setBounds(400, 310, 80, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Jenis Kamar");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 210, 72, 15);

        jComboKamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Room", "Double Room", "Family Room" }));
        getContentPane().add(jComboKamar);
        jComboKamar.setBounds(160, 210, 320, 20);

        Back.setText("Kembali");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(300, 310, 80, 40);
        getContentPane().add(jDateMasuk);
        jDateMasuk.setBounds(160, 240, 320, 20);
        getContentPane().add(jDateKeluar);
        jDateKeluar.setBounds(160, 270, 320, 20);

        Username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Username.setText("Username");
        getContentPane().add(Username);
        Username.setBounds(60, 60, 59, 15);
        getContentPane().add(usernamebooking);
        usernamebooking.setBounds(160, 60, 320, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/Image/hotel6.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-340, -240, 1500, 917);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitActionPerformed
        // TODO add your handling code here:
        String username = usernamebooking.getText();
        String no_ktp = jNo_Ktp.getText();
        String nama = jNama.getText();
        String alamat = jAlamat.getText();
        String no_hp = jNo_Hp.getText();
        String jenis_kamar = (String) jComboKamar.getSelectedItem();
        
        KoneksiDatabase Database = new KoneksiDatabase();
        Connection konek = Database.connect();
 //tanggal=Format.format(txtTgl.getDate());
        
        
        int check = 0,tanggalM = 0, tanggalK = 0;          //kebutuhan konversi

        double hargaKamar = 0,totalHarga = 0;
        
        String tgl_masuk  = Format.format(jDateMasuk.getDate());
        String tgl_keluar = Format.format(jDateKeluar.getDate());

        System.out.println(tgl_masuk);
        System.out.println(tgl_keluar);
        
        
        if(jenis_kamar == "Single Room"){
            hargaKamar = 250000;
        }else if(jenis_kamar == "Double Room"){
            hargaKamar = 400000;
        }else if(jenis_kamar == "Family Room"){
            hargaKamar = 500000;
        }
    
//        KONVERSI tgl_masuk
        String [] words = tgl_masuk.split("-");
        
        for(String word : words){
            if(check == 2){
                System.out.println(word);
                tanggalM = Integer.parseInt(word);                
                check = 0;
            }else
                check++;
        }
        
        //KONVERSI tgl_keluar
        String [] kalimat = tgl_keluar.split("-");
        
        for(String kata : kalimat){
            if(check == 2){
                System.out.println(kata);
                tanggalK = Integer.parseInt(kata);
                check = 0;
            }else
                check++;
        }
        
        
        int totalHari = tanggalK - tanggalM;
        System.out.println(totalHari);
        totalHarga = hargaKamar * totalHari;
        Math.abs(totalHarga); 
        
        System.out.println(totalHarga);

        
        Database.book(konek, username, no_ktp, nama, alamat, no_hp, jenis_kamar, tgl_masuk, tgl_keluar, totalHarga);
        
        
        String[] jenis = new String[3];
        int[] stok = new int[3];

        
        //Kamar kosong berkurang ketika dipesan   
        try {
            java.sql.Connection con; //METHOD MEMBUAT KONEKSI
            con = new KoneksiDatabase().connect();
            String sql = "SELECT * FROM `check_kamar`";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            int i =0;
            
            while (rs.next()){
                
                jenis[i] =    rs.getString("jenis_kamar");
                stok[i]=    rs.getInt("stok");
//                i++;
                System.out.println(jenis[i]);
                System.out.println(stok[i]);
                i++;
            }
            s.close();
            con.close();
        } catch (SQLException ex ) {
            Logger.getLogger(ViewDataPemesan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "You got an Error!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        int j,index=0;
        for(j=0;j<3;j++){
            if(jenis_kamar.equals(jenis[j])){
                index = j;
                if(stok[j] == 0){
                    JOptionPane.showMessageDialog(null, "Kamar Habis", "Habis", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    stok[j] = stok[j] - 1;
                    System.out.println("Berhasil kurang");
                    break;
                }
            }
        }
        System.out.println(stok[index]);
        System.out.println(jenis[index]);
      
        try {
            java.sql.Connection con; //METHOD MEMBUAT KONEKSI
            con = new KoneksiDatabase().connect();
            String sql = "UPDATE check_kamar set stok = '" + stok[index]+ "' WHERE jenis_kamar = '" + jenis[index]+"'";
            Statement s = con.createStatement();

            s.executeUpdate(sql);
            
            s.close();
            con.close();
        } catch (SQLException ex ) {
            Logger.getLogger(ViewDataPemesan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "You got an Error!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        administrasi adm = new administrasi(totalHarga,username);
        dispose();
        adm.setVisible(true);
        
    }//GEN-LAST:event_jSubmitActionPerformed

    private void jNo_HpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNo_HpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNo_HpActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        int dialogbutton=JOptionPane.showOptionDialog(this, "Yakin ingin kembali", "Warning",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,null,null);
        if (dialogbutton==JOptionPane.YES_OPTION){
            this.dispose();
            new ViewAkunClient(user).setVisible(true);
        }
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(ViewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ViewBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField jAlamat;
    private javax.swing.JComboBox<String> jComboKamar;
    private com.toedter.calendar.JDateChooser jDateKeluar;
    private com.toedter.calendar.JDateChooser jDateMasuk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNama;
    private javax.swing.JTextField jNo_Hp;
    private javax.swing.JTextField jNo_Ktp;
    private javax.swing.JButton jSubmit;
    private javax.swing.JTextField usernamebooking;
    // End of variables declaration//GEN-END:variables
}
