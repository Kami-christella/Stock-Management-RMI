
package DAO;

import java.util.*;
import model.Opinions;
import org.hibernate.Session;

/**
 *
 * @author GANZA
 */
public class OpinionDao {
    public Opinions registerOpinion(Opinions theOpinion){
        try{
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.save(theOpinion);
            ss.beginTransaction().commit();
            ss.close();
            return theOpinion;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
     public List<Opinions> allOpinions(){
         try{
             Session ss=HibernateUtil.getSessionFactory().openSession();
             List<Opinions> theOpinions=ss.createQuery("select theOpinion from Opinions theOpinion").list();
        ss.close();
        return theOpinions;
         }catch(Exception ex){
             ex.printStackTrace();
         }
         return null;
     }
        public Opinions updateOpinions(Opinions personObj){
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
    public Opinions deleteOpinions(Opinions personObj){
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
      public Opinions searchOpinions(Opinions employeeObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Opinions theOpinions = (Opinions)ss.get(Opinions.class, employeeObj.getEid());
            ss.close();
            return theOpinions;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
