
package com.softspark.hospital.database.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Dao {
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://LOCALHOST:3306/hospital_system?autoReconnect=true&useSSL=false","root","16161");
   if(con!=null){
       JOptionPane.showMessageDialog(null,"connect");
        return con;}
   return null;
    }
 public void closeConnection(Connection con)throws Exception {
     if(con!=null)
         con.close();
 }
public static void main(String[]args)throws Exception{
    getConnection();
}
}
