
package Tables;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Displacements implements Serializable{
    @Id
    private String DiplacementName;
   private int AmountOfPayments;
   @OneToMany(mappedBy = "displacementId")
   private List<Payments>payment;
@OneToMany(mappedBy = "Displacement")
private List<AvailableCars>displacement;

    public List<AvailableCars> getDisplacement() {
        return displacement;
    }

    public void setDisplacement(List<AvailableCars> displacement) {
        this.displacement = displacement;
    }
    public String getDiplacementName() {
        return DiplacementName;
    }

    public void setDiplacementName(String DiplacementName) {
        this.DiplacementName = DiplacementName;
    }

    public List<Payments> getPayment() {
        return payment;
    }

    public void setPayment(List<Payments> payment) {
        this.payment = payment;
    }
    public int getAmountOfPayments() {
        return AmountOfPayments;
    }

    public void setAmountOfPayments(int AmountOfPayments) {
        this.AmountOfPayments = AmountOfPayments;
    }
}
