/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ADMIN
 */
public class Vaccine {
    private String id;
    private String vaccineName;
    private String vaccineQuanlity;
    private String vaccineLo;
    private String vaccineDate;
    
    public Vaccine(){
        
    }

    public Vaccine(String id, String vaccineName, String vaccineQuanlity, String vaccineLo, String vaccineDate) {
        this.id = id;
        this.vaccineName = vaccineName;
        this.vaccineQuanlity = vaccineQuanlity;
        this.vaccineLo = vaccineLo;
        this.vaccineDate = vaccineDate;
    }

    public Vaccine(String vaccineName, String vaccineQuanlity, String vaccineLo, String vaccineDate) {
        this.vaccineName = vaccineName;
        this.vaccineQuanlity = vaccineQuanlity;
        this.vaccineLo = vaccineLo;
        this.vaccineDate = vaccineDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineQuanlity() {
        return vaccineQuanlity;
    }

    public void setVaccineQuanlity(String vaccineQuanlity) {
        this.vaccineQuanlity = vaccineQuanlity;
    }

    public String getVaccineLo() {
        return vaccineLo;
    }

    public void setVaccineLo(String vaccineLo) {
        this.vaccineLo = vaccineLo;
    }

    public String getVaccineDate() {
        return vaccineDate;
    }

    public void setVaccineDate(String vaccineDate) {
        this.vaccineDate = vaccineDate;
    }
    
    
}
