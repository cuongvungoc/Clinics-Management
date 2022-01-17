/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ADMIN
 */
public class InfoDiease {
    private String ID;
    private String name;
    private String age;
    private boolean gender;
    private String nationality;
    private String cccd;
    private String phone;
    private String address;
    private String Fn;
    private String dose;
    

    public InfoDiease() {
    }

    public InfoDiease(String ID, String name, String age, boolean gender, String nationality, String cccd, String phone, String address, String Fn, String dose) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
        this.cccd = cccd;
        this.phone = phone;
        this.address = address;
        this.Fn = Fn;
        this.dose = dose;
    }

    public InfoDiease(String name, String age, boolean gender, String nationality, String cccd, String phone, String address, String Fn, String dose) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
        this.cccd = cccd;
        this.phone = phone;
        this.address = address;
        this.Fn = Fn;
        this.dose = dose;
    }
    
    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFn() {
        return Fn;
    }

    public void setFn(String Fn) {
        this.Fn = Fn;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    
    
    
}
