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
    public List<Employee> EmployeeLogIn(String username, String Password)throws RemoteException;
  public List<Employee> DisplayEmployee()throws RemoteException;
    public String SignUpEmployee(String username, String password, String id)throws RemoteException;
        public List<Displacements> DisplayDisplacements()throws RemoteException;

    public List<Displacements> DisplaySearchingDisplacements(String text) throws RemoteException;

    public String InsertNewPassenger(Passenger p)throws RemoteException;

    public List<Passenger> SignUpPassenger(String username, String passwd) throws RemoteException;

    public List<AvailableCars> CheckAvailableCars()throws RemoteException;

    public String AddPayment(Payments p)throws RemoteException;
    
}
