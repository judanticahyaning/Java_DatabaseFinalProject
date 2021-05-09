package hotel;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ModelLoginClient {
    public void login(String username, String password, ViewLoginClient loginC) {
       java.sql.Connection con;
                    con = new KoneksiDatabase().connect();
                    try
                    {
                        //java.sql.Connection koneksi; //METHOD MEMBUAT KONEKSI
                        //koneksi = new KoneksiDatabase().connect();
                        String sql = "SELECT * FROM `akunclient` WHERE username="+"'"+username+"'"+"and password='"+password+"'";
                        Statement s = con.createStatement();
                        ResultSet rs = s.executeQuery(sql);
                        if (rs.next())
                        {
                            JOptionPane.showMessageDialog(null,"Login Berhasil","INFORMASI",JOptionPane.INFORMATION_MESSAGE);
                            loginC.dispose();
                            new ViewAkunClient(username).setVisible (true);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Maaf, username dan password anda salah!","WARNING",JOptionPane.ERROR_MESSAGE);

                        }
                        s.close();
                        con.close();
                    }
                    catch (Exception ex)
                    {
                        JOptionPane.showMessageDialog(null,"Login Gagal","Informasi",JOptionPane.INFORMATION_MESSAGE);
                    }                    
    
} }
