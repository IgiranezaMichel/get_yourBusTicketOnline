/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Employee implements Serializable{
    @Id
    private  String EmployeeId;
    private String EmployeeNames;
    private String TelephoneNumber;
    private String Gender;
    private String username;
    private String password;
 @ManyToOne
    private Car CarNumber;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public String getEmployeeNames() {
        return EmployeeNames;
    }

    public void setEmployeeNames(String EmployeeNames) {
        this.EmployeeNames = EmployeeNames;
    }

    public String getTelephoneNumber() {
        return TelephoneNumber;
    }

    public void setTelephoneNumber(String TelephoneNumber) {
        this.TelephoneNumber = TelephoneNumber;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Car getCarNumber() {
        return CarNumber;
    }

    public void setCarNumber(Car CarNumber) {
        this.CarNumber = CarNumber;
    }

}
