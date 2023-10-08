/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Services.InterfaceImplementation;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server{
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        Registry rmi=LocateRegistry.createRegistry(2000);
         InterfaceImplementation e=new InterfaceImplementation();
        rmi.bind("addOrUpdateCarDatas", e);
        rmi.bind("DisplayCar", e);
        rmi.bind("DeleteAcar", e);
        rmi.bind("addEmployeeDatas", e);
        rmi.bind("RemoveEmployeeDatas", e);
        rmi.bind("AddDisplacement", e);
        rmi.bind("DisplayEmployees", e);
        rmi.bind("DisplayDisplacement", e);
        rmi.bind("EmployeeLogIn", e);
        rmi.bind("SignupEmployee", e);
        rmi.bind("SearchingDisplacements", e);
        rmi.bind("InsertNewPAssenger", e);
        rmi.bind("PAssengerLogIn", e);
        rmi.bind("AddPayment", e);
        rmi.bind("AddToListOfAvailableCars", e);
        rmi.bind("CheckOnAvailableList", e);
        rmi.bind("DisplayCrientWithTicket", e);
        rmi.bind("AllPayments", e);
        System.out.println("Server is running on port 2000");
        
    }
}
