package Services;

import Tables.AvailableCars;
import Tables.Car;
import Tables.Displacements;
import Tables.Employee;
import Tables.Passenger;
import Tables.Payments;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ServiceInterfaces extends Remote{
  public String AddOrUpdateCar(Car c) throws RemoteException;
public List<Car> DisplayCar() throws RemoteException;
 public String DeleteCar(Car c) throws RemoteException;
     public String AddOrUpdateEmployee(Employee emp)throws RemoteException;
         public String RemoveEmployee(Employee emp)throws RemoteException;
           public String AddDisplacement(Displacements d)throws RemoteException;
            public List<Employee> DisplayEmployee()throws RemoteException;
            public List<Displacements> DisplayDisplacements()throws RemoteException;
              public String RemoveDisplacement(Displacements d) throws RemoteException;
               public List<Employee> EmployeeLogIn(String username, String Password)throws RemoteException;
                   public String SignUpEmployee(String username, String password, String id)throws RemoteException;
                       public List<Displacements> DisplaySearchingDisplacements(String text) throws RemoteException;
                           public String InsertNewPassenger(Passenger p)throws RemoteException;
                               public List<Passenger> SignUpPassenger(String username, String passwd) throws RemoteException;
  public String AddCarToListOfAvailable(AvailableCars a) throws RemoteException;
      public List<AvailableCars> CheckAvailableCars()throws RemoteException;
          public String AddPayment(Payments p)throws RemoteException;
           public List<Payments> VeiwAllPayments()throws RemoteException;
            public List<Payments> PurchasedTickets(String CarCode)throws RemoteException;
}
