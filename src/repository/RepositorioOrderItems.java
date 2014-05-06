/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.OrderItem;
import java.util.List;

/**
 *
 * @author jcrbsa
 */
public interface RepositorioOrderItems{
    boolean insertOrderItem(OrderItem order);

    boolean updateOrderItem(int id, OrderItem order);

    boolean deleteOrderItem(int id);
    OrderItem selectOrderItem(int id);
    List<OrderItem> selectOrderItems();
}
