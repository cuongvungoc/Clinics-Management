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
public class VaccineDAO {
    public static List<Vaccine> findAll() {
        List<Vaccine> vaccineList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DatabaseUtils.getDBConnect();; //try-catch
            
            //query
            String sql = "select * from sql6468084.vaccine";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                Vaccine vac = new Vaccine(
                        resultSet.getString("id"), 
                        resultSet.getString("type"), 
                        resultSet.getString("quanlity"), 
                        resultSet.getString("lo"), 
                        resultSet.getString("date"));
                vaccineList.add(vac);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VaccineDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VaccineDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close(); //try-catch
                } catch (SQLException ex) {
                    Logger.getLogger(VaccineDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return vaccineList;
    }
    
    public static void insert(Vaccine vac) {
        Connection connection = null;
        PreparedStatement statement = null; //không cần lấy dữ liệu đầu ra
        
        try {
            //lay tat ca danh sach sinh vien
            //connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql6468084? zeroDateTimeBehavior = round", "root", "haihai20");
            connection = DatabaseUtils.getDBConnect();
            //query
            String sql = "insert into sql6468084.vaccine(type, quanlity, lo, date) values(?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, vac.getVaccineName());
            statement.setString(2, vac.getVaccineQuanlity());
            statement.setString(3, vac.getVaccineLo());
            statement.setString(4, vac.getVaccineDate());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(VaccineDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VaccineDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close(); //try-catch
                } catch (SQLException ex) {
                    Logger.getLogger(VaccineDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    
    public static void update(Vaccine vac) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach nhân viên
            connection = DatabaseUtils.getDBConnect();
            
            //query
            String sql = "update sql6468084.vaccine set type=?,quanlity=?,lo=?,date=? where id = ?";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, vac.getVaccineName());
            statement.setString(2, vac.getVaccineQuanlity());
            statement.setString(3, vac.getVaccineLo());
            statement.setString(4, vac.getVaccineDate());
            statement.setString(5, vac.getId());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(VaccineDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VaccineDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close(); //try-catch
                } catch (SQLException ex) {
                    Logger.getLogger(VaccineDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    
    public static void delete(String id) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = DatabaseUtils.getDBConnect();
            String sql = "delete from sql6468084.vaccine where id=?";
            statement = connection.prepareCall(sql);
            statement.setString(1, id);
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(VaccineDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VaccineDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close(); //try-catch
                } catch (SQLException ex) {
                    Logger.getLogger(VaccineDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public static List<Vaccine> search(String vaccineLo ) {
        List<Vaccine> vaccineList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach vaccine
            connection = DatabaseUtils.getDBConnect();
            
            //query
            String sql = "select * from sql6468084.vaccine where lo like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + vaccineLo  + "%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                Vaccine vac = new Vaccine(
                        resultSet.getString("id"), 
                        resultSet.getString("type"), 
                        resultSet.getString("quanlity"), 
                        resultSet.getString("lo"), 
                        resultSet.getString("date"));
                vaccineList.add(vac);
            }
        }  catch (SQLException ex) {
            Logger.getLogger(VaccineDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VaccineDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close(); //try-catch
                } catch (SQLException ex) {
                    Logger.getLogger(VaccineDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return vaccineList;
    }
}
