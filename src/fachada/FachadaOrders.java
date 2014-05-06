/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fachada;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.repository.RepositorioOrders;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.repository.RepositorioOrdersList;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Customer;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Order;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Payment;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Product;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Shipping;
import java.util.List;

/**
 *
 * @author bruno.andrade
 */
public class FachadaOrders {
    
    private static FachadaOrders fachadaOrders;
    
    private RepositorioOrders repositorioOrders;
//    private RepositorioOrderItems repositorioOrderItems;
    
    
    static{
        fachadaOrders =  new FachadaOrders();
    }
    
    private FachadaOrders(){
        repositorioOrders = new RepositorioOrdersList();
        //repositorioOrders = new RepositorioOrdersBD();
        
    }

    public static FachadaOrders getInstance(){
        return fachadaOrders;
    }
    
    
    
     public void realizeOrder(Order order) {
    repositorioOrders.insertOrder(order);
    
}
   public void  editOrder(int id, Order order){
    
    repositorioOrders.updateOrder(id, order);
}
    
    public void  deleteOrder(int id ){
    repositorioOrders.deleteOrder(id);
    }

                    
    public List<Order>  visualizeOrders(){
       return repositorioOrders.selectOrders();
    }
    
}
