/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import database.DatabaseUtils;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author ADMIN
 */
public class UserList {
    
    public User getUserById(String username){
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        User usr = new User();
        try{
            String sSQL = "SELECT * FROM sql6468084.user where username = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, username);
            rs = sttm.executeQuery();
            while (rs.next()){
                usr.setUsername(rs.getString(1));
                usr.setPassword(rs.getString(2));
//                usr.setRole(rs.getBoolean(3));
                
                return usr;
            }
        } catch(Exception e){
            System.out.println("Error:"+e.toString());
        }finally{
            try{
                conn.close();
                rs.close();
                sttm.close();
            }catch(Exception e){
                
            }
        }
        return null;
    }
    
    public boolean checkLogin(String username, String password){
        User user = getUserById(username);
        if(user != null){
            //user tồn tại
            if(user.getPassword().equals(password)){
                return true;
            }
        }
        
        return false;
    }

}
