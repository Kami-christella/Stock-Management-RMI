

package controller;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import service.implementation.AdminServiceImpl;
import service.implementation.EmployeeServiceImpl;
import service.implementation.OpinionsServiceImpl;
import service.implementation.ProductServiceImpl;
import service.implementation.UpdatesServiceImpl;

/**
 *
 * @author GANZA
 */
public class Server {
    public static void main(String[] args) {
        try{
            System.setProperty("java.rmi.server.hostname","127.0.0.1");
            Registry theRegistry=LocateRegistry.createRegistry(5000);
            theRegistry.rebind("admin", new AdminServiceImpl());
            theRegistry.rebind("employee", new EmployeeServiceImpl());
            theRegistry.rebind("opinion", new OpinionsServiceImpl());
            theRegistry.rebind("product", new ProductServiceImpl());
             theRegistry.rebind("update", new UpdatesServiceImpl());
             System.out.println("Server is running on port 5000");
            Thread.currentThread().join();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
