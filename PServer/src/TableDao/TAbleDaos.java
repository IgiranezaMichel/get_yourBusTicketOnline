/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableDao;

import Tables.AvailableCars;
import Tables.Car;
import Tables.Displacements;
import Tables.Employee;
import Tables.Passenger;
import Tables.Payments;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Eng Michael
 */
public class TAbleDaos {

    public String AddOrUpdateCars(Car c) {
       try{ Session ss=HibernateUtil.getSessionFactory().openSession();
        ss.saveOrUpdate(c);
        ss.beginTransaction().commit();
        ss.close();
    }catch(Exception e)
    {
        return e+"";
    }
       return "Done";
    }

public List<Car> DisplayCars() {
Session ss=HibernateUtil.getSessionFactory().openSession();
        Query q=ss.createQuery("from Car");
        List<Car>ls=q.list();
        return ls;
    }

    public String DeleteCar(Car c) {
 try{ Session ss=HibernateUtil.getSessionFactory().openSession();
        ss.delete(c);
        ss.beginTransaction().commit();
        ss.close();
    }catch(Exception e)
    {
        return e+"";
    }
       return "Car has been Deleted Successfully";       
//To change body of generated methods, choose Tools | Templates.
    }

    public String AddNewEmployee(Employee emp) {
      try{ Session ss=HibernateUtil.getSessionFactory().openSession();
        ss.saveOrUpdate(emp);
        ss.beginTransaction().commit();
        ss.close();
    }catch(Exception e)
    {
        return e+"";
    }
       return "Done Sucessfully";  
//To change body of generated methods, choose Tools | Templates.
    }

    public String RemoveEmployee(Employee emp) {
        try{ Session ss=HibernateUtil.getSessionFactory().openSession();
        ss.delete(emp);
        ss.beginTransaction().commit();
        ss.close();
    }catch(Exception e)
    {
        return e+"";
    }
       return "Employee Deleted Successfully";  
        //To change body of generated methods, choose Tools | Templates.
    }

    public String AddDisplacement(Displacements d) {
       try{ Session ss=HibernateUtil.getSessionFactory().openSession();
        ss.saveOrUpdate(d);
        ss.beginTransaction().commit();
        ss.close();
    }catch(Exception e)
    {
        return e+"";
    }
       return "Desplacement Added/Updated Successfully";  
//To change body of generated methods, choose Tools | Templates.
    }

    public List<Employee> DisplayEmployee() {
Session ss=HibernateUtil.getSessionFactory().openSession();
        Query q=ss.createQuery("from Employee");
        List<Employee>ls=q.list();
        return ls;       
//To change body of generated methods, choose Tools | Templates.
    }

    public List<Displacements> DisplayDisplacements() {
     
Session ss=HibernateUtil.getSessionFactory().openSession();
Query q=ss.createQuery("from Displacements");
List<Displacements>ls=q.list();
return ls;
//To change body of generated methods, choose Tools | Templates.
    }

    public String removeDisplacement(Displacements d) {
    try{ Session ss=HibernateUtil.getSessionFactory().openSession();
        ss.delete(d);
        ss.beginTransaction().commit();
        ss.close();
    }catch(HibernateException e)
    {
        return e+"";
    }
       return "Desplacement has been Deleted Successfully";       
        //To change body of generated methods, choose Tools | Templates.
    }

    public List<Employee> EmployeeLogIn(String username, String Password) {
       Session ss=HibernateUtil.getSessionFactory().openSession();
       Query q=ss.createQuery("from Employee where username=:u and password=:p");
       q.setParameter("u", username);
         q.setParameter("p", Password);
         List<Employee>emp=q.list();
         return emp;    
    }

    public String signUpEmployee(String username, String password, String id) {
     try{      Session ss=HibernateUtil.getSessionFactory().openSession();
       Query q=ss.createQuery("update Employee set username=:u , password=:p where EmployeeId=:i");
       q.setParameter("u", username);
         q.setParameter("p", password);
         q.setParameter("i",id);
         q.executeUpdate();
         ss.beginTransaction().commit();
     }
     catch(Exception e)
     {
         return e+"";
     }
     return "Account Has been Created Successfully";
      
    }

    public List<Displacements> DisplaySearchingDisplacements(String text) {      
Session ss=HibernateUtil.getSessionFactory().openSession();
Query q=ss.createQuery("from Displacements where DiplacementName=:dn");
q.setParameter("dn",text);
List<Displacements>ls=q.list();
return ls;
    }

    public String InsertNewPassenger(Passenger p) {
       
 try{ Session ss=HibernateUtil.getSessionFactory().openSession();
        ss.saveOrUpdate(p);
        ss.beginTransaction().commit();
        ss.close();
    }catch(Exception e)
    {
        return e+"";
    }
       return " Signnup  Successfully";  
//To change body of generated methods, choose Tools | Templates.
    }

    public List<Passenger> SignUpPassenger(String username, String passwd) {
          Session ss=HibernateUtil.getSessionFactory().openSession();
       Query q=ss.createQuery("from Passenger where  username=:u and Password=:p");
       q.setParameter("u", username);
         q.setParameter("p", passwd);
     List<Passenger>p=q.list();
     return p;
    }

    public String AddCarToListOfAvailable(AvailableCars a) {
        try{ Session ss=HibernateUtil.getSessionFactory().openSession();
        ss.saveOrUpdate(a);
        ss.beginTransaction().commit();
        ss.close();
    }catch(Exception e)
    {
        return e+"";
    }
       return "Your Car is Added To List Of Available Cars"; 
    }

    public List<AvailableCars> CheckAvailableCars() {
      Session ss=HibernateUtil.getSessionFactory().openSession();
       Query q=ss.createQuery("from AvailableCars");
     List<AvailableCars>p=q.list();
     return p;
//To change body of generated methods, choose Tools | Templates.
    }

    public String AddPayment(Payments p) {
        try{ Session ss=HibernateUtil.getSessionFactory().openSession();
        ss.saveOrUpdate(p);
        ss.beginTransaction().commit();
        ss.close();
    }catch(Exception e)
    {
        return e+"";
    }
       return "Paid Sucessfully";
        //To change body of generated methods, choose Tools | Templates.
    }

    public List<Payments> VeiwAllPayments() {
       Session ss=HibernateUtil.getSessionFactory().openSession();
       Query q=ss.createQuery("from Payments");
     List<Payments>p=q.list();
     return p;
        //To change body of generated methods, choose Tools | Templates.
    }

    public List<Payments> PurchasedTickets(String CarCode) {
     Session ss=HibernateUtil.getSessionFactory().openSession();
       Query q=ss.createQuery("from Payments where CarCode_TaxNumber=:i");
       q.setParameter("i",CarCode);
     List<Payments>p=q.list();
     return p;
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
