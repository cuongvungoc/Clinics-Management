/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Staff {
    private String Id;
    private String fullname;
    private Date birthday;
    private boolean sex;
    private String phoneNumber;
    private String position;
    private String ca;

    public Staff() {
    }

    public Staff(String Id, String fullname, Date birthday, boolean sex, String phoneNumber, String position, String ca) {
        this.Id = Id;
        this.fullname = fullname;
        this.birthday = birthday;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.ca = ca;
    }

    public Staff(String fullname, Date birthday, boolean sex, String phoneNumber, String position, String ca) {
        this.fullname = fullname;
        this.birthday = birthday;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.ca = ca;
    }
    

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }
    
}
