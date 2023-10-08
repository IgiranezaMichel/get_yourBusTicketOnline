package Tables;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class AvailableCars implements Serializable{
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int number;
   @ManyToOne
   private Car availableCars;
   @ManyToOne
   private Displacements Displacement;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Car getAvailableCars() {
        return availableCars;
    }

    public void setAvailableCars(Car availableCars) {
        this.availableCars = availableCars;
    }

    public Displacements getDisplacement() {
        return Displacement;
    }

    public void setDisplacement(Displacements Displacement) {
        this.Displacement = Displacement;
    }
}
