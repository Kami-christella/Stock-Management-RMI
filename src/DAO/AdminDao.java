
package DAO;

import java.util.*;
import model.Admin;
import org.hibernate.Session;

/**
 *
 * @author GANZA
 */
public class AdminDao {
    public Admin registerAdmin(Admin theAdmin){
        try{
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.save(theAdmin);
            ss.beginTransaction().commit();
            ss.close();
            return theAdmin;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
     public List<Admin> allAdmin(){
         try{
             Session ss=HibernateUtil.getSessionFactory().openSession();
             List<Admin> theAdmin=ss.createQuery("select theAdmin from Admin theAdmin").list();
        ss.close();
        return theAdmin;
         }catch(Exception ex){
             ex.printStackTrace();
         }
         return null;
     }
        public Admin updateAdmin(Admin personObj){
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
    public Admin deleteAdmin(Admin personObj){
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
      public Admin searchAdmin(Admin employeeObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Admin theAdmin = (Admin)ss.get(Admin.class, employeeObj.getADID());
            ss.close();
            return theAdmin;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
