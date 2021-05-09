/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ModelReservasi {
    

    public void book(String username,String no_ktp, String nama, String alamat, String no_hp,String jenis_kamar,String tgl_masuk,String tgl_keluar,double totalHarga) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        java.sql.Connection con;
                    con = new KoneksiDatabase().connect();
//                    String sql = "INSERT INTO `booking` (`username`,`no_ktp`, `nama`, `alamat`, `no_hp`, `jenis_kamar`, `tgl_masuk`, `tgl_keluar`, `total`) VALUES (?,?,?,?,?,?,?,?,?)";
                    String sql = "INSERT INTO `booking`  VALUES ('" + username +"','"+ no_ktp +"','"+ nama +"','"+ alamat +"','"+ no_hp +"','"+ jenis_kamar +"','"+ tgl_masuk +"','"+ tgl_keluar +"','"+ totalHarga +"')";
//                    PreparedStatement pstm;

//        System.out.println(username);
//System.out.println(no_ktp);
//System.out.println(nama);
//System.out.println(nama);
//System.out.println(alamat);
//System.out.println(no_hp);
//System.out.println(jenis_kamar);
//System.out.println(tgl_masuk);
//System.out.println(tgl_keluar);
//System.out.println(totalHarga);
                   Statement statement;
                    try {
                        statement = con.createStatement();
                        statement.executeUpdate(sql);
//                            pstm = con.prepareStatement(sql);
//                            pstm.setString(1, username);
//                            pstm.setString(2, no_ktp);
//                            pstm.setString(3, nama);
//                            pstm.setString(4, alamat);
//                            pstm.setString(5, no_hp);
//                            pstm.setString(6, jenis_kamar);
//                            pstm.setString(7, tgl_masuk);
//                            pstm.setString(8, tgl_keluar);
//                            pstm.setDouble(9, totalHarga);
//                            pstm.executeUpdate();
                            //JOptionPane.showMessageDialog(null, "Berhasil Pesan", "sukses", JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException e) {
                            // TODO Auto-generated catch block
                        Logger.getLogger(ModelReservasi.class.getName()).log(Level.SEVERE, null, e);
                            JOptionPane.showMessageDialog(null, "Gagal Pesan", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    }
        }
    
    public void GetStok(){
        java.sql.Connection con;
                    con = new KoneksiDatabase().connect();
                    
                    
                    
    }
    
    }
    

