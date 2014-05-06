/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.repository.RepositorioOrders;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.repository.RepositorioOrdersList;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Order;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.OrderItem;
import java.util.List;
import repository.RepositorioOrderItems;
import repository.RepositorioOrderItemsList;

/**
 *
 * @author jcrbsa
 */
public class FachadaOrderItems {

    private static FachadaOrderItems fachadaOrders;
    private RepositorioOrderItems repositorioOrders;
//    private RepositorioOrderItems repositorioOrderItems;

    static {
        fachadaOrders = new FachadaOrderItems();
    }

    private FachadaOrderItems() {
        repositorioOrders = new RepositorioOrderItemsList();
        //repositorioOrders = new RepositorioOrdersBD();

    }

    public static FachadaOrderItems getInstance() {
        return fachadaOrders;
    }

    public void realizeOrderItems(OrderItem orderItem) {
        repositorioOrders.insertOrderItem(orderItem);

    }

    public void editOrder(int id, OrderItem orderItem) {

        repositorioOrders.updateOrderItem(id, orderItem);
    }

    public void deleteOrder(int id) {
        repositorioOrders.deleteOrderItem(id);
    }

    public List<OrderItem> visualizeOrders() {
        return repositorioOrders.selectOrderItems();
    }
}
