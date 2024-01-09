
package DAO;

import java.util.*;
import model.Employees;
import org.hibernate.Session;

/**
 *
 * @author GANZA
 */
public class EmployeeDao {
    public Employees registerEmployee(Employees theEmployee){
        try{
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.save(theEmployee);
            ss.beginTransaction().commit();
            ss.close();
            return theEmployee;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
     public List<Employees> allEmployees(){
         try{
             Session ss=HibernateUtil.getSessionFactory().openSession();
             List<Employees> theEmployees=ss.createQuery("select theEmployee from Employees theEmployee").list();
        ss.close();
        return theEmployees;
         }catch(Exception ex){
             ex.printStackTrace();
         }
         return null;
     }
        public Employees updateEmployees(Employees personObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(personObj);
            ss.beginTransaction().commit();
            ss.close();
            return personObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Employees deleteEmployees(Employees personObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(personObj);
            ss.beginTransaction().commit();
            ss.close();
            return personObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
      public Employees searchEmployees(Employees employeeObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Employees theEmployees = (Employees)ss.get(Employees.class, employeeObj.getEid());
            ss.close();
            return theEmployees;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
