/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.OrderItem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jcrbsa
 */
public class RepositorioOrderItemsList implements RepositorioOrderItems {
    private static int id=0;
	private static List<OrderItem> items = new ArrayList<OrderItem>();
	
	@Override
	public boolean insertOrderItem(OrderItem order) {
	
		try{
		items.add(order);
		RepositorioOrderItemsList.id++;
		return true;
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return false;
	
	}

	@Override
	public boolean updateOrderItem(int id, OrderItem order) {
		
		try{
		items.set(id, order);
		return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteOrderItem(int id) {
		try{
			items.remove(id);
			RepositorioOrderItemsList.id--;
			return true;
		}catch (Exception e){
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public OrderItem selectOrderItem(int id) {
		try{
			
			return items.get(id);
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return null;
	}

	@Override
	public List<OrderItem> selectOrderItems() {
		
		return items;
	}

}
