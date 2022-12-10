
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public abstract class koneksi {
    private static Connection mysqlconfig;
    public static Connection koneksi()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/perkebunan"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Tidak Connect ke Database"); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    }    
}