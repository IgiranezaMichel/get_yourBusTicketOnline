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
public class Passenger implements Serializable{
  @Id  
  private String TelephoneNumber;
  private String PassengerNames;
  private String Gender;
  private String UserName;
  private String Password;
  @OneToMany(mappedBy = "PassengerId")
  private List<Payments>payments;

    public String getTelephoneNumber() {
        return TelephoneNumber;
    }

    public void setTelephoneNumber(String TelephoneNumber) {
        this.TelephoneNumber = TelephoneNumber;
    }

    public String getPassengerNames() {
        return PassengerNames;
    }

    public void setPassengerNames(String PassengerNames) {
        this.PassengerNames = PassengerNames;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public List<Payments> getPayments() {
        return payments;
    }

    public void setPayments(List<Payments> payments) {
        this.payments = payments;
    }
}
