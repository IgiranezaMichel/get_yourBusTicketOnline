package Services;

import Tables.AvailableCars;
import Tables.Car;
import Tables.Displacements;
import Tables.Employee;
import Tables.Payments;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ServiceInterfaces extends Remote{
    public List<Employee> EmployeeLogIn(String username, String Password)throws RemoteException;
  public List<Employee> DisplayEmployee()throws RemoteException;
    public String SignUpEmployee(String username, String password, String id)throws RemoteException;
        public List<Displacements> DisplayDisplacements()throws RemoteException;

    public List<Displacements> DisplaySearchingDisplacements(String text) throws RemoteException;

    public String AddCarToListOfAvailable(AvailableCars a) throws RemoteException;

    public List<Payments> PurchasedTickets(String CarCode)throws RemoteException;

    
}
