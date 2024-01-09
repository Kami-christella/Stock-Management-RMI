/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service.implementation;

import DAO.OpinionDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Opinions;
import service.OpinionService;

/**
 *
 * @author GANZA
 */
public class OpinionsServiceImpl extends UnicastRemoteObject implements OpinionService  {

      public OpinionsServiceImpl() throws RemoteException{
        
    }
     OpinionDao dao=new OpinionDao();
    @Override
    public Opinions registerOpinion(Opinions opinionObj) throws RemoteException {
       return dao.registerOpinion(opinionObj);
    }

    @Override
    public List<Opinions> allOpinions() throws RemoteException {
      return dao.allOpinions();
    }

    @Override
    public Opinions updateOpinions(Opinions opinionObj) throws RemoteException {
      return dao.updateOpinions(opinionObj);
    }

    @Override
    public Opinions deleteOpinions(Opinions opinionObj) throws RemoteException {
      return dao.deleteOpinions(opinionObj);
    }

    @Override
    public Opinions searchOpinions(Opinions opinionObj) throws RemoteException {
       return dao.searchOpinions(opinionObj);
    }
    
}
