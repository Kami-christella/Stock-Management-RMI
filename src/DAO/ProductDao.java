
package DAO;

import java.util.*;
import model.Products;
import org.hibernate.Session;

/**
 *
 * @author GANZA
 */
public class ProductDao {
    public Products registerProduct(Products theProduct){
        try{
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.save(theProduct);
            ss.beginTransaction().commit();
            ss.close();
            return theProduct;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
     public List<Products> allProducts(){
         try{
             Session ss=HibernateUtil.getSessionFactory().openSession();
             List<Products> theProducts=ss.createQuery("select theProduct from Products theProduct").list();
        ss.close();
        return theProducts;
         }catch(Exception ex){
             ex.printStackTrace();
         }
         return null;
     }
     
        public Products updateProducts(Products personObj){
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
    public Products deleteProducts(Products personObj){
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
       public Products searchProducts(Products productObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Products theProducts = (Products)ss.get(Products.class, productObj.getpId());
            ss.close();
            return theProducts;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
