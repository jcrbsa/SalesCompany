package br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.OrderItem;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Order;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Payment;

public class BankTransfer extends Payment {

	
	/*
	 * @GRASP: Polimorfismo
	 * 
	 */
	
	@Override
	double orderPayment(Order order) {
		double total = 0;
		
		for (OrderItem item : order.getItems()) {
			total += item.calculatePriceItem(order.getShipping());		
		}
		 total *= 0.9;
		 return total;
	
	}


}