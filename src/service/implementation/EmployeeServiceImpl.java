

package service.implementation;

import DAO.EmployeeDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Employees;
import service.EmployeeService;

/**
 *
 * @author GANZA
 */
public class EmployeeServiceImpl extends UnicastRemoteObject implements EmployeeService{

    public EmployeeServiceImpl() throws RemoteException{
        
    }
    EmployeeDao dao=new EmployeeDao();
    @Override
    public Employees registerEmployee(Employees employeeObj) throws RemoteException {
       return dao.registerEmployee(employeeObj);
    }

    @Override
    public List<Employees> allEmployees() throws RemoteException {
        return dao.allEmployees();
    }

    @Override
    public Employees updateEmployees(Employees employeeObj) throws RemoteException {
      return dao.updateEmployees(employeeObj);
    }

    @Override
    public Employees deleteEmployees(Employees employeeObj) throws RemoteException {
       return dao.deleteEmployees(employeeObj);
    }

    @Override
    public Employees searchEmployees(Employees employeeObj) throws RemoteException {
       return dao.searchEmployees(employeeObj);
    }
    
}
