/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Customer;
import java.util.List;
import repository.RepositorioCustomer;
import repository.RepositorioCustomerList;

/**
 *
 * @author jcrbsa
 */
public class FachadaCustomers {
      private static FachadaCustomers fachadaCliente;
    
    private RepositorioCustomer repositorioCliente;
//    private RepositorioCustomerItems repositorioCustomerItems;
    
    
    static{
        fachadaCliente =  new FachadaCustomers();
    }
    
    private FachadaCustomers(){
        repositorioCliente = new RepositorioCustomerList();
        //repositorioCliente = new RepositorioClienteBD();
        
    }

    public static FachadaCustomers getInstance(){
        return fachadaCliente;
    }
    
    
    
     public void realizeCustomer(Customer customer) {
    repositorioCliente.insertCustomer(customer);
    
}
   public void  editCustomer(int id, Customer customer){
    
    repositorioCliente.updateCustomer(id, customer);
}
    
    public void  deleteCustomer(int id ){
    repositorioCliente.deleteCustomer(id);
    }

                    
    public List<Customer>  visualizeCliente(){
       return repositorioCliente.listCustomers();
    }
    
    
    
}
