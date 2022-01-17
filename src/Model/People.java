
package Model;

/**
 *
 * @author Admin
 */
public class People {
    private String name, nationality, gender,cccd, phoneNumber, address, note, age, vaccine;
//    private int  vaccine;

    public People() {
    }

    public People(String name, String nationality, String cccd, String phoneNumber, String address, String note, String age, String gender, String vaccine) {
        this.name = name;
        this.nationality = nationality;
        this.cccd = cccd;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.note = note;
        this.age = age;
        this.gender = gender;
        this.vaccine = vaccine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
//    public boolean isGender() {
//        return gender;
//    }

}
