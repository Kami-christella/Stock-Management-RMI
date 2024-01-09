/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service.implementation;

import DAO.UpdateDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Updates;
import service.UpdatesService;

/**
 *
 * @author GANZA
 */
public class UpdatesServiceImpl  extends UnicastRemoteObject implements UpdatesService  {

     public UpdatesServiceImpl() throws RemoteException{
        
    }
     UpdateDao dao=new UpdateDao();
    @Override
    public Updates registerUpdate(Updates updateObj) throws RemoteException {
    return dao.registerUpdate(updateObj);
    }

    @Override
    public List<Updates> allUpdates() throws RemoteException {
       return dao.allUpdates();
    }

    @Override
    public Updates updateUpdates(Updates updateObj) throws RemoteException {
      return dao.updateUpdates(updateObj);
    }

    @Override
    public Updates deleteUpdates(Updates updateObj) throws RemoteException {
      return dao.deleteUpdates(updateObj);
    }

    @Override
    public Updates searchUpdates(Updates updateObj) throws RemoteException {
       return dao.searchUpdates(updateObj);
    }
    
}
