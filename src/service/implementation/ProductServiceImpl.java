/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service.implementation;

import DAO.ProductDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Products;
import service.ProductService;

/**
 *
 * @author GANZA
 */
public class ProductServiceImpl extends UnicastRemoteObject implements ProductService{

    public ProductServiceImpl() throws RemoteException{
      
    }
      ProductDao dao=new ProductDao();
    @Override
    public Products registerProduct(Products productObj) throws RemoteException {
       return dao.registerProduct(productObj);     
    }

    @Override
    public List<Products> allProducts() throws RemoteException {
      return dao.allProducts();
    }

    @Override
    public Products updateProducts(Products productObj) throws RemoteException {
     return dao.updateProducts(productObj);
    }

    @Override
    public Products deleteProducts(Products productObj) throws RemoteException {
       return dao.deleteProducts(productObj);
    }

    @Override
    public Products searchProducts(Products productObj) throws RemoteException {
       return dao.searchProducts(productObj);
    }
    
}
