
package DAO;

import java.util.*;
import model.Updates;
import org.hibernate.Session;

/**
 *
 * @author GANZA
 */
public class UpdateDao {
    public Updates registerUpdate(Updates theUpdate){
        try{
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.save(theUpdate);
            ss.beginTransaction().commit();
            ss.close();
            return theUpdate;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
     public List<Updates> allUpdates(){
         try{
             Session ss=HibernateUtil.getSessionFactory().openSession();
             List<Updates> theUpdates=ss.createQuery("select theUpdate from Updates theUpdate").list();
        ss.close();
        return theUpdates;
         }catch(Exception ex){
             ex.printStackTrace();
         }
         return null;
     }
        public Updates updateUpdates(Updates personObj){
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
    public Updates deleteUpdates(Updates personObj){
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
      public Updates searchUpdates(Updates employeeObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Updates theUpdates = (Updates)ss.get(Updates.class, employeeObj.getUpdN());
            ss.close();
            return theUpdates;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
