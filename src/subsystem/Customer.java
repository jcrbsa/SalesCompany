package br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Shipping;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Order;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Payment;

public class Customer {

    private String name;
    private String address;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer() {
        
    }
    
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    
    public String checkout(Order order, Payment payment, Shipping shipping) throws Exception {


        if (shipping.deliveryTime > Shipping.TEMPO_MAXIMO_ENTREGA) {
            throw new Exception("o produto n�o pode ser entregue no prazo m�ximo do tipo de frete escolhido ao fechar a compra!");
        }
        order.setPayment(payment);
        order.setShipping(shipping);

        double total = order.calculateOrderPayment();

        return "Customer: " + this.name + "\n"
                + "Address:" + this.address + "\n"
                + "Order#: " + order.getNumber() + "\n"
                + "Total: " + total + "\n";
    }
}