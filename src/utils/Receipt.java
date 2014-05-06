package br.edu.ifpe.tads.lpoo2.grasp.parte3.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Order;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.OrderItem;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Product;

public class Receipt {

	Order order;

	
	
	public Receipt( Order order) {
		
		this.order = order;
	}
	

	public void printOrder() {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(" --------------- Pedido item --------- ");
		buffer.append("\n");
		buffer.append(" --------------- Info Produto --------- ");
		buffer.append("\n");
		
			double total =0;
		for (OrderItem item : this.order.getItems()) {
			total = total + item.calculatePriceItem(this.order.getShipping());
                  buffer.append(" Nome da Produto : ");
		buffer.append(item.getProduct().name);
		buffer.append(" \n ");
		buffer.append("Price: ");
		buffer.append(item.getProduct().price);
		buffer.append(" \n ");
		buffer.append("Peso: ");
		buffer.append(item.getProduct().weight);
		buffer.append(" \n ");
		buffer.append("Perecivel: ");
		buffer.append(item.getProduct().perecivel);
		buffer.append("\n");
                        
		}
		buffer.append("Preco por Peso Entrega:");
		buffer.append(this.order.getShipping().getPricePerKg());
	
		buffer.append("\nTotal de todos Items do Pedido:"); 
		buffer.append(total);
		buffer.append("\n--------------- Info Cliente --------- ");
		buffer.append("\n");
		buffer.append(this.order.getCustomer().getName());
		buffer.append("\n");
		buffer.append(" --------------- Info Entrega --------- ");
		buffer.append("\n");
		Calendar test = Calendar.getInstance();
		test.add(Calendar.DAY_OF_WEEK, this.order.getShipping().getDeliveryTime() );
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String format = simpleDateFormat.format(new Date(test.getTimeInMillis()));
		buffer.append("Previsão de Entrega:");
		buffer.append(format);
		buffer.append(" \n ");

		System.out.println(buffer.toString());
	}
	
	
/*	public void printerProduct(Product product){
		String str = "Name#: " + product.getName() + "\n";
		
		str += "Price: " + product.getPrice() + "\n";
		str += "Weight: " + product.getWeight() + "\n";
		str += "Perecivel: " + product.getPerecivel() + "\n";
		//str += "Calculate Price: " + this.calculatePrice(this.) + "\n";
		//str += "Calculate Weight: " + this.calculateWeight(quantity) + "\n";

		System.out.println(str);
		
	}
*/

}
