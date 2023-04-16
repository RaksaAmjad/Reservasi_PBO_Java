/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemesananhotel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class koneksi {
    private static Connection mysqlkonek;
    public static Connection koneksiDB() throws SQLException {
if(mysqlkonek==null){
try {
String DB = "jdbc:mysql://localhost:3306/hotel";
String user = "root"; // user database
String pass = "Sudehsuakit1"; // password database
DriverManager.registerDriver(new com.mysql.jdbc.Driver());
mysqlkonek = (Connection) DriverManager.getConnection(DB,user,pass);
} catch (Exception e) { 
    JOptionPane.showMessageDialog(null,"Gagal Koneksi !!");
}
}
return mysqlkonek;
}
}
