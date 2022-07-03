/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import database.DatabaseUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PeopleList {
    public int insert(People peo){
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            String sSQL = "insert into sql6468084.kbyt(name, age, gender, nationality, cccd, phone_number, address, note, vaccine) values(?,?,?,?,?,?,?,?,?)";
            conn = DatabaseUtils.getDBConnect();
            pstmt = conn.prepareStatement(sSQL);
            pstmt.setString(1, peo.getName());
            pstmt.setString(2, peo.getAge());
            pstmt.setString(3, peo.getGender());
            pstmt.setString(4, peo.getNationality());
            pstmt.setString(5, peo.getCccd());
            pstmt.setString(6, peo.getPhoneNumber());
            pstmt.setString(7, peo.getAddress());
            pstmt.setString(8, peo.getNote());
            pstmt.setString(9, peo.getVaccine());
            
            if(pstmt.executeUpdate()>0){
                System.out.println("Thêm thành công");
                return 1;
            }
        } catch(Exception e){
            System.out.println("Error:" + e.toString());
        } finally{
            try{
                conn.close();
                pstmt.close();
            }catch(Exception e){
                
            }
        }
        return -1; //nếu thêm không thành công
    }
    

    public int updatePeopleByCccd(People peo) throws Exception{
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
        String sSQL = "update sql6468084.kbyt set name = ?, age = ?,  nationality = ?, cccd = ?, phone_number = ?, address = ?, note = ?, vaccine = ?, where cccd = ?";
        conn = DatabaseUtils.getDBConnect();
            pstmt = conn.prepareStatement(sSQL);
            pstmt.setString(1, peo.getName());
            pstmt.setString(2, peo.getAge());
            pstmt.setString(3, peo.getGender());
            pstmt.setString(4, peo.getNationality());
            pstmt.setString(5, peo.getCccd());
            pstmt.setString(6, peo.getPhoneNumber());
            pstmt.setString(7, peo.getAddress());
            pstmt.setString(8, peo.getNote());
            pstmt.setString(9, peo.getVaccine());
            
            if(pstmt.executeUpdate()>0){
                System.out.println("Thêm thành công");
                return 1;
            }
        } catch(Exception e){
            System.out.println("Error:" + e.toString());
        } finally{
            try{
                conn.close();
                pstmt.close();
            }catch(Exception e){
                
            }
        }
        return -1; //nếu thêm không thành công
    }
    
    public List<People> getAllPeople(){
        List<People> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try{
            String sSQL = "select * from sql6468084.kbyt";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while(rs.next()){
                People peo = new People();
                peo.setName(rs.getString(1));
                peo.setAge(rs.getString(2));
                peo.setGender(rs.getString(3));
                peo.setNationality(rs.getString(4));
                peo.setCccd(rs.getString(5));
                peo.setPhoneNumber(rs.getString(6));
                peo.setAddress(rs.getString(7));
                peo.setNote(rs.getString(8));
                peo.setVaccine(rs.getString(9));
                
                ls.add(peo);
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
    
    
    public int delPeopleByID(String cccd){
        Connection conn = null;
        PreparedStatement sttm = null;
        try{
            String sSQL = "delete from sql6468084.kbyt where cccd = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, cccd);
            
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
    
    public People getPeopleByCccd(String cccd){
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        People peo = new People();
        try{
            String sSQL = "select * from sql6468084.kbyt where cccd = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, cccd);
            rs = sttm.executeQuery();
            while(rs.next()){
                peo.setName(rs.getString(1));
                peo.setAge(rs.getString(2));
                peo.setGender(rs.getString(3));
                peo.setNationality(rs.getString(4));
                peo.setCccd(rs.getString(5));
                peo.setPhoneNumber(rs.getString(6));
                peo.setAddress(rs.getString(7));
                peo.setNote(rs.getString(8));
                peo.setVaccine(rs.getString(9));
                return peo;
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
}           