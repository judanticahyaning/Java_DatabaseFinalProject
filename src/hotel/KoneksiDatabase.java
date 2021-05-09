/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class KoneksiDatabase {

  private Connection koneksi = null;
  private Statement st;
            public Connection connect() {
                        // untuk koneksi ke driver
                        try {
                                    // try mencari library
                                    Class.forName("com.mysql.jdbc.Driver"); //LOAD DRIVER
                                    System.out.println("berhasil load driver");
                        } catch (ClassNotFoundException cnfe) {
                                    System.out.println("Tidak ada Driver " + cnfe);
                        }

                        // untuk koneksi ke database
                        try {
                                    String url = "jdbc:mysql://localhost:3306/hotel"; //DRIVER MANA YG AKAN DIGUNAKAN
                                    koneksi = DriverManager.getConnection(url, "root", "");
                                    System.out.println("Berhasil koneksi");
                                    // JOptionPane.showMessageDialog(null,"Berhasil
                                    // koneksi","sukses",JOptionPane.INFORMATION_MESSAGE);
                        } catch (SQLException ex) {
                                    //System.out.print("Gagal koneksi " + ex,"Hasil");
                                    JOptionPane.showMessageDialog(null, "Gagal Koneksi Database"+ex,"hasil", JOptionPane.WARNING_MESSAGE);
                        }
                        return koneksi;
            }
            
            public void updateStatus(String no_ktp, String nama,Connection konek,ViewDataPemesan frame){
                try{
                    st = konek.createStatement();
                    st.executeUpdate("UPDATE booking SET status = 'Check In' WHERE no_ktp ='" + no_ktp +"' AND nama = '" + nama +"'");   
                    JOptionPane.showMessageDialog(null,"CheckI In Berhasil","INFORMASI",JOptionPane.INFORMATION_MESSAGE);
                    frame.dispose(); 
                    new ViewDataPemesan().setVisible(true);
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,"LCheck In Gagal","Informasi",JOptionPane.INFORMATION_MESSAGE);
                        Logger.getLogger(ViewDataPemesan.class.getName()).log(Level.SEVERE, null, ex);   
                }
            }
            
            public void deleteStatus(String no_ktp,Connection konek,ViewDataPemesan frame){
                try{
                    st = konek.createStatement();
                    st.executeUpdate("DELETE FROM booking WHERE no_ktp ='" + no_ktp +"'");   
                    JOptionPane.showMessageDialog(null,"Check Oout Berhasil","INFORMASI",JOptionPane.INFORMATION_MESSAGE);
                    frame.dispose(); 
                    new ViewDataPemesan().setVisible(true);
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,"Check Out Gagal","Informasi",JOptionPane.INFORMATION_MESSAGE);
                        Logger.getLogger(ViewDataPemesan.class.getName()).log(Level.SEVERE, null, ex);   
                }
            }
            
            
            public void book(Connection konek, String username,String no_ktp, String nama, String alamat, String no_hp,String jenis_kamar,String tgl_masuk,String tgl_keluar,double totalHarga) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
                  
                    try {
                        st = konek.createStatement();
//                        String sql = "INSERT INTO booking VALUES ('" + username +"','"+ no_ktp +"','"+ nama +"','"+ alamat +"','"+ no_hp +"','"+ jenis_kamar +"','"+ tgl_masuk +"','"+ tgl_keluar +"','"+ totalHarga +"')";
//                 
                        st.executeUpdate("INSERT INTO booking VALUES ('" + username +"','"+ no_ktp +"','"+ nama +"','"+ alamat +"','"+ no_hp +"','"+ jenis_kamar +"','"+ tgl_masuk +"','"+ tgl_keluar +"','"+ totalHarga + "','-')");
                        JOptionPane.showMessageDialog(null, "Berhasil Pesan", "sukses", JOptionPane.INFORMATION_MESSAGE);
                    
                        st.close();
                        konek.close();
                    } catch (SQLException e) {
                        Logger.getLogger(ModelReservasi.class.getName()).log(Level.SEVERE, null, e);
                            JOptionPane.showMessageDialog(null, "Gagal Pesan", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    }
        }
            
      public void batalinPesan(String no_ktp,String jk){
        String[] jenis = new String[3];
        int[] stok = new int[3];
        String jenis_kamar = jk;
        
        
        try {
            java.sql.Connection con; //METHOD MEMBUAT KONEKSI
            con = connect();
            String sql = "SELECT * FROM booking WHERE no_ktp = '" + no_ktp +"'";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
//            int i =0;
            
//            while (rs.next()){
                if(rs.next()){
                    jenis_kamar = rs.getString("jenis_kamar");
                    System.out.println(jenis_kamar);
                }
//            }
            s.close();
            con.close();
        } catch (SQLException ex ) {
            Logger.getLogger(ViewDataPemesan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "You got an Error!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
        //Kamar kosong berkurang ketika dipesan   
        try {
            java.sql.Connection con; //METHOD MEMBUAT KONEKSI
            con = connect();
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
                    stok[j] = stok[j] + 1;
                    
                    JOptionPane.showMessageDialog(null, "Berhasil Dibatalkan", "Warning", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    stok[j] = stok[j] + 1;
                    System.out.println("Berhasil nambah");
                    break;
                }
            }
        }

        System.out.println(stok[index]);
        System.out.println(jenis[index]);
        
      
        try {
            java.sql.Connection con; //METHOD MEMBUAT KONEKSI
            con = connect();
            String sql = "UPDATE check_kamar set stok = '"+ stok[index]+ "' WHERE jenis_kamar = '" + jenis[index]+"'";
            Statement s = con.createStatement();

            s.executeUpdate(sql);
            
            s.close();
            con.close();
        } catch (SQLException ex ) {
            Logger.getLogger(ViewDataPemesan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "You got an Error!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
     }
      
      public void deleteData(String no_ktp,ViewDataPemesan frame){
                try{
                    Connection konek = connect();
                    st = konek.createStatement();
                    st.executeUpdate("DELETE FROM booking WHERE no_ktp = '" + no_ktp +"'");   
                    JOptionPane.showMessageDialog(null,"Dibatalkan","INFORMASI",JOptionPane.INFORMATION_MESSAGE);
                    frame.dispose(); 
                    new ViewDataPemesan().setVisible(true);
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,"Gagal Dibatalkan","Informasi",JOptionPane.INFORMATION_MESSAGE);
                        Logger.getLogger(ViewDataPemesan.class.getName()).log(Level.SEVERE, null, ex);   
                }
            }

}
