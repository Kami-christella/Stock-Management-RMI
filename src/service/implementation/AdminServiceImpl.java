/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service.implementation;

import DAO.AdminDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Admin;
import service.AdminService;

/**
 *
 * @author GANZA
 */
public class AdminServiceImpl extends UnicastRemoteObject implements AdminService {

     public AdminServiceImpl() throws RemoteException{
        
    }
       AdminDao dao=new AdminDao();
    @Override
    public Admin registerAdmin(Admin adminObj) throws RemoteException {
      return dao.registerAdmin(adminObj);
    }

    @Override
    public List<Admin> allAdmin() throws RemoteException {
      return dao.allAdmin();
    }

    @Override
    public Admin updateAdmin(Admin adminObj) throws RemoteException {
       return dao.updateAdmin(adminObj);
    }

    @Override
    public Admin deleteAdmin(Admin adminObj) throws RemoteException {
       return dao.deleteAdmin(adminObj);
    }

    @Override
    public Admin searchAdmin(Admin adminObj) throws RemoteException {
       return dao.searchAdmin(adminObj);
    }
    
}
