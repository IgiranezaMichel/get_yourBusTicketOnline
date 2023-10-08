package Tables;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
@Entity
public class Car implements Serializable{
   @Id
   private String TaxNumber;
   private String CarName;
   private int NumberOfSeats;
   @OneToMany(mappedBy = "CarNumber")
   private List<Employee>ListOfEmployee;
   @OneToMany(mappedBy = "availableCars")
   private List<AvailableCars>available;
   @OneToMany(mappedBy ="CarCode")
   private List<Payments>payments;

    public List<AvailableCars> getAvailable() {
        return available;
    }

    public void setAvailable(List<AvailableCars> available) {
        this.available = available;
    }
    public String getTaxNumber() {
        return TaxNumber;
    }

    public void setTaxNumber(String TaxNumber) {
        this.TaxNumber = TaxNumber;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String CarName) {
        this.CarName = CarName;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(int NumberOfSeats) {
        this.NumberOfSeats = NumberOfSeats;
    }

    public List<Employee> getListOfEmployee() {
        return ListOfEmployee;
    }

    public void setListOfEmployee(List<Employee> ListOfEmployee) {
        this.ListOfEmployee = ListOfEmployee;
    }
}
