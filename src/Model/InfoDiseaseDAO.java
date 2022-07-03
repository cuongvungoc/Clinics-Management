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
 * @author ADMIN
 */
public class InfoDiseaseDAO {
    public static List<InfoDiease> ls = new ArrayList<>();
    
    public int add(InfoDiease info){
        Connection conn = null;
        PreparedStatement sttm = null;
        try{
            String sSQL = "insert into sql6468084.infodisease(ID, fullname, age, gender, nationality, cccd, phone, address, Fn, dose) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            
            sttm.setString(1, info.getID());
            sttm.setString(2, info.getName());
            sttm.setString(3, info.getAge());
            sttm.setBoolean(4, info.isGender());
            sttm.setString(5, info.getNationality());
            sttm.setString(6, info.getCccd());
            sttm.setString(7, info.getPhone());
            sttm.setString(8, info.getAddress());
            sttm.setString(9, info.getFn());
            sttm.setString(10, info.getDose());
           
            
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
    
    public int updateById(InfoDiease info){
        Connection conn = null;
        PreparedStatement sttm = null;
        try{
            String sSQL = "update sql6468084.infodisease set fullname = ?, age = ?,  gender = ?, nationality = ?, cccd = ?, phone = ?, address = ?, Fn = ?, dose = ? where ID = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(10, info.getID());
            sttm.setString(1, info.getName());
            sttm.setString(2, info.getAge());
            sttm.setBoolean(3, info.isGender());
            sttm.setString(4, info.getNationality());
            sttm.setString(5, info.getCccd());
            sttm.setString(6, info.getPhone());
            sttm.setString(7, info.getAddress());
            sttm.setString(8, info.getFn());
            sttm.setString(9, info.getDose());
            
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
    
    public int delByID(String id){
        Connection conn = null;
        PreparedStatement sttm = null;
        try{
            String sSQL = "delete from sql6468084.infodisease where ID = ?";
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
    
    public List<InfoDiease> getAll(){
        List<InfoDiease> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try{
            String sSQL = "SELECT * FROM sql6468084.infodisease";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while(rs.next()){
                InfoDiease info = new InfoDiease();
                info.setID(rs.getString(1));
                info.setName(rs.getString(2));
                info.setAge(rs.getString(3));
                info.setGender(rs.getBoolean(4));
                info.setNationality(rs.getString(5));
                info.setCccd(rs.getString(6));
                info.setPhone(rs.getString(7));
                info.setAddress(rs.getString(8));
                info.setFn(rs.getString(9));
                info.setDose(rs.getString(10));
                
                ls.add(info);
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
    
    public InfoDiease getInfoById(String id){
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        InfoDiease info = new InfoDiease();
        try{
            String sSQL = "select * from sql6468084.infodisease where ID = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            rs = sttm.executeQuery();
            while(rs.next()){ //Duyệt từng phần tử
                //Truy cập các cột bằng hàm get
                info.setID(rs.getString(1));
                info.setName(rs.getString(2));
                info.setAge(rs.getString(3));
                info.setGender(rs.getBoolean(4));
                info.setNationality(rs.getString(5));
                info.setCccd(rs.getString(6));
                info.setPhone(rs.getString(7));
                info.setAddress(rs.getString(8));
                info.setFn(rs.getString(9));
                info.setDose(rs.getString(10));
                
                
                return info;
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
