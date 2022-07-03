/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import database.DatabaseUtils;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

/**
 *
 * @author ADMIN
 */
public class StaffList {
    SimpleDateFormat format_date = new SimpleDateFormat("yyyy/MM/dd");
    public static List<Staff> ls = new ArrayList<>();
    /*public int add(Staff stf){
        ls.add(stf);
        return 1;
    }*/
    
    public int add(Staff stf){
        Connection conn = null;
        PreparedStatement sttm = null;
        try{
            String sSQL = "insert into sql6468084.staff(ID, FullName, Birthday, Gender, PhoneNumber, Position, Ca) values(?, ?, ?, ?, ?, ?, ?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, stf.getId());
            sttm.setString(2, stf.getFullname());
            sttm.setString(3, format_date.format(stf.getBirthday()));
            sttm.setBoolean(4, stf.isSex());
            sttm.setString(5, stf.getPhoneNumber());
            sttm.setString(6, stf.getPosition());
            sttm.setString(7, stf.getCa());
            
            if(sttm.executeUpdate()>0){
                System.out.println("Thêm thành công");
                return 1;
            }
        } catch(Exception e){
            System.out.println("Error:" + e.toString());
        } finally{
            try{
                conn.close();
                sttm.close();
            }catch(Exception e){
                
            }
        }
        return -1; //nếu thêm không thành công
    }
    
    public int updateStaffbyId(Staff stf){
        Connection conn = null;
        PreparedStatement sttm = null;
        try{
            String sSQL = "update sql6468084.staff set FullName = ?, Birthday = ?,  Sex = ?, PhoneNumber = ?, position = ?, ca = ? where ID = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(7, stf.getId());
            sttm.setString(1, stf.getFullname());
            sttm.setString(2, format_date.format(stf.getBirthday()));
            sttm.setBoolean(3, stf.isSex());
            sttm.setString(4, stf.getPhoneNumber());
            sttm.setString(5, stf.getPosition());
            sttm.setString(6, stf.getCa());
            
            if(sttm.executeUpdate()>0){
                System.out.println("Thêm thành công");
                return 1;
            }
        } catch(Exception e){
            System.out.println("Error:" + e.toString());
        } finally{
            try{
                conn.close();
                sttm.close();
            }catch(Exception e){
                
            }
        }
        return -1; //nếu thêm không thành công
    }
    
    public int delStaffByID(String id){
        Connection conn = null;
        PreparedStatement sttm = null;
        try{
            String sSQL = "delete from sql6468084.staff where ID = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            
            if(sttm.executeUpdate()>0){
                System.out.println("Xóa thành công");
                return 1;
            }
        } catch(Exception e){
            System.out.println("Error:" + e.toString());
        } finally{
            try{
                conn.close();
                sttm.close();
            }catch(Exception e){
                
            }
        }
        return -1; //nếu xóa không thành công
    }
    
    public List<Staff> getAllStaff(){
        List<Staff> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try{
            String sSQL = "select * from sql6468084.staff";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while(rs.next()){
                Staff stf = new Staff();
                stf.setId(rs.getString(1));
                stf.setFullname(rs.getString(2));
                stf.setBirthday(rs.getDate(3));
                stf.setSex(rs.getBoolean(4));
                stf.setPhoneNumber(rs.getString(5));
                stf.setPosition(rs.getString(6));
                stf.setCa(rs.getString(7));
                /*Staff stf = new Staff(rs.getString("ID"), 
                        rs.getString("FullName"), rs.getDate("Birthday"), 
                        rs.getBoolean("Sex"), rs.getString("PhoneNumber"), 
                        rs.getString("position"), rs.getString("Ca"));*/
                ls.add(stf);
            }
        }catch(Exception e){
            System.out.println("Error:" + e.toString());
        }finally{
            try{
                rs.close();
                sttm.close();
                conn.close();
            }catch(Exception e){
                
            }
        }
        return ls;
    }
    
    public Staff getStaffById(String id){
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        Staff stf = new Staff();
        try{
            String sSQL = "select * from sql6468084.staff where ID = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            rs = sttm.executeQuery();
            while(rs.next()){
                stf.setId(rs.getString(1));
                stf.setFullname(rs.getString(2));
                stf.setBirthday(rs.getDate(3));
                stf.setSex(rs.getBoolean(4));
                stf.setPhoneNumber(rs.getString(5));
                stf.setPosition(rs.getString(6));
                stf.setCa(rs.getString(7));
                return stf;
            }         
        } catch(Exception e){
                 System.out.println("Error:"+e.toString());   
        } finally{
            try{
                conn.close();
                rs.close();
                sttm.close();
            }catch(Exception e){
                
            }
        }
        return null;
    }
    
    /*public List<Staff> getAllStaff(){
        return ls;
    }
    public int delStaffByID(String ma){
        for(Staff stf:ls){
            if(stf.getId().equalsIgnoreCase(ma)){ //equalsIgnoreCase():so sanh string này với string khác
                ls.remove(stf);
                return 1;
            }
        }
        return -1;
    }
    public Staff getStaffById(String id){
        for(Staff stf:ls){
            if(stf.getId().equalsIgnoreCase(id)){
                return stf;
            }
        }
        return null;
    }
    
    public int updateStaffbyId(Staff stfNew){
        for(Staff stf:ls){
            if(stf.getId().equalsIgnoreCase(stfNew.getId())){
                stf.setId(stfNew.getId());
                stf.setFullname(stfNew.getFullname());
                stf.setBirthday(stfNew.getBirthday());
                stf.setSex(stfNew.isSex());
                stf.setPhoneNumber(stfNew.getPhoneNumber());
                stf.setPosition(stfNew.getPosition());
                stf.setCa(stfNew.getCa());
                return 1;
            }
        }
        return -1;
    }*/
    
}
