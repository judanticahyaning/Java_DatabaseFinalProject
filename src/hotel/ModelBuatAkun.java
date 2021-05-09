/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
class ModelBuatAkun {
    public void akun (String nama,String username,String email,String password,String konfirmasi_password)
    {
        java.sql.Connection con;
                    con = new KoneksiDatabase().connect();
                    String sql = "INSERT INTO `akunclient`(`nama`, `username`, `email`, `password`, `konfirmasi_pass`) VALUES (?,?,?,?,?)";
                    PreparedStatement pstmt;
                    try {
                            pstmt = con.prepareStatement(sql);
                            pstmt.setString(1, nama);
                            pstmt.setString(2, username);
                            pstmt.setString(3, email);
                            pstmt.setString(4, password);
                            pstmt.setString(5, konfirmasi_password);
                            pstmt.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Berhasil Buat Akun", "sukses", JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException e) {
                            // TODO Auto-generated catch block
                            JOptionPane.showMessageDialog(null, "Gagal Buat Akun", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    }
    }
        
    }

