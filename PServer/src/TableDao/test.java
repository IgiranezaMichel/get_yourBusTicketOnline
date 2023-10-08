/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableDao;

import Tables.Car;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author Eng Michael
 */
public class test {
    public static void main(String[] args) {
       Session ss= HibernateUtil.getSessionFactory().openSession();
//       TAbleDaos d=new TAbleDaos();
//       Car c=new Car();
//       c.setCarName("Ritco");
//       c.setNumberOfSeats(23);
//       c.setTaxNumber("TR256");
//       String result=d.AddOrUpdateCars(c);
//        JOptionPane.showMessageDialog(null, result);
       
    }
}
