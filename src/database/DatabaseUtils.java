/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DatabaseUtils {
    
    public static Connection getDBConnect(){
        try{
            Connection con = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ltnc? zeroDateTimeBehavior = round", "root", "123456");
            return con;
            
        }catch(ClassNotFoundException ex){
            System.out.println("Where is Driver?");
            System.out.println("Error:" + ex.toString());
        }catch(SQLException ex){
            //lỗi kết nối
            System.out.println("Error:" + ex.toString());
        }
        return null;
    }
}
