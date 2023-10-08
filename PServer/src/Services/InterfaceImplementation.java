package Services;
import TableDao.TAbleDaos;
import Tables.AvailableCars;
import Tables.Car;
import Tables.Displacements;
import Tables.Employee;
import Tables.Passenger;
import Tables.Payments;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
public class InterfaceImplementation extends UnicastRemoteObject implements ServiceInterfaces{
    TAbleDaos dao=new TAbleDaos();
    public  InterfaceImplementation() throws java.rmi.RemoteException{
        
    }

    @Override
    public String AddOrUpdateCar(Car c) throws RemoteException {
      return dao.AddOrUpdateCars(c);
    }

    @Override
    public List<Car> DisplayCar() throws RemoteException {
    return dao.DisplayCars(); 
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String DeleteCar(Car c) throws RemoteException {
       return dao.DeleteCar(c);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String AddOrUpdateEmployee(Employee emp) throws RemoteException {
     return dao.AddNewEmployee(emp);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String RemoveEmployee(Employee emp) throws RemoteException {
       return dao.RemoveEmployee(emp);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String AddDisplacement(Displacements d) throws RemoteException {
     return dao.AddDisplacement(d);        
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> DisplayEmployee() throws RemoteException {
return dao.DisplayEmployee();
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Displacements> DisplayDisplacements() throws RemoteException {
return dao.DisplayDisplacements();
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String RemoveDisplacement(Displacements d) throws RemoteException {
return dao.removeDisplacement(d);
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> EmployeeLogIn(String username, String Password) throws RemoteException {
return dao.EmployeeLogIn(username,Password);
    }

    @Override
    public String SignUpEmployee(String username, String password, String id) throws RemoteException {
       return dao.signUpEmployee(username,password,id);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Displacements> DisplaySearchingDisplacements(String text) throws RemoteException {
     return dao.DisplaySearchingDisplacements(text);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String InsertNewPassenger(Passenger p) throws RemoteException {
return dao.InsertNewPassenger(p);
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Passenger> SignUpPassenger(String username, String passwd) throws RemoteException {
      return dao.SignUpPassenger(username,passwd);

//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String AddCarToListOfAvailable(AvailableCars a) throws RemoteException {
      return dao.AddCarToListOfAvailable(a);
    }

    @Override
    public List<AvailableCars> CheckAvailableCars() throws RemoteException {
      return dao.CheckAvailableCars();
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String AddPayment(Payments p) throws RemoteException {
      return dao.AddPayment(p);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Payments> VeiwAllPayments() throws RemoteException {
       
return dao.VeiwAllPayments();
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Payments> PurchasedTickets(String CarCode) throws RemoteException {
     return dao.PurchasedTickets(CarCode);
        //To change body of generated methods, choose Tools | Templates.
    }
}