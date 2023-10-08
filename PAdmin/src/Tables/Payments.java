package Tables;

import java.io.Serializable;
import javax.persistence.*;
@Entity
public class Payments implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Number;
    @ManyToOne(fetch = FetchType.EAGER)
    private Car CarCode;
     @ManyToOne(fetch = FetchType.EAGER)
    private Displacements displacementId;
        @ManyToOne(fetch = FetchType.EAGER)
    private Passenger PassengerId;

    public Car getCarCode() {
        return CarCode;
    }

    public void setCarCode(Car CarCode) {
        this.CarCode = CarCode;
    }

    public Displacements getDisplacementId() {
        return displacementId;
    }

    public void setDisplacementId(Displacements displacementId) {
        this.displacementId = displacementId;
    }
    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public Passenger getPassengerId() {
        return PassengerId;
    }

    public void setPassengerId(Passenger PassengerId) {
        this.PassengerId = PassengerId;
    }
}
