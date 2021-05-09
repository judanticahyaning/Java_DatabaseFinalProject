/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.ResultSet;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Batalpesan {

    static void hapuskamar(JTextField noktp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    String no_ktp, nama, alamat, no_hp,jenis_kamar,tgl_masuk,tgl_keluar;
    double totalHarga;

    public String getno_ktp() {
        return no_ktp;
    }

    public void setno_ktp(String no_ktp) {
        this.no_ktp = no_ktp;
    }

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getalamat() {
        return alamat;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public String getno_hp() {
        return no_hp;
    }

    public void setno_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getjenis_kamar() {
        return jenis_kamar;
    }

    public void setjenis_kamar(String jenis_kamar) {
        this.jenis_kamar = jenis_kamar;
    }

    public String gettgl_masuk() {
        return tgl_masuk;
    }

    public void settgl_masuk(String tgl_masuk) {
        this.tgl_masuk = tgl_masuk;
    }
        public String gettgl_keluar() {
        return tgl_keluar;
    }

    public void settgl_keluar(String tgl_keluar) {
        this.tgl_keluar = tgl_keluar;
    }
        public double gettotalHarga() {
        return totalHarga;
    }

    public void settotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }
    public void hapuskamar() {
        java.sql.Connection con;
        con = new KoneksiDatabase().connect();
        String sql = "DELETE FROM `booking` WHERE `no_ktp`='" + no_ktp + "' ";
        Statement s;
        try {
            s = con.createStatement();
            s.executeUpdate(sql);
            s.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Data Terhapus", "sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
