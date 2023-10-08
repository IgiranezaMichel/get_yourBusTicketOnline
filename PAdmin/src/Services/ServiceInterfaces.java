package Services;

import Tables.Car;
import Tables.Displacements;
import Tables.Employee;
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

    public List<Payments> VeiwAllPayments()throws RemoteException;
    
}
