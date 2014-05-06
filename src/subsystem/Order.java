package br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.controller.OrderController;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.repository.RepositorioOrders;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.repository.RepositorioOrdersList;
import java.util.ArrayList;
import java.util.List;

public class Order {

    public static int number;
    private double totalOrderPayment;
    private Customer customer;
    private Payment payment;
    private Shipping shipping;
    public static int id = 0;
    private Product product;
    private int quantity;

    public double getTotalOrderPayment() {
        return totalOrderPayment;
    }

    public void setTotalOrderPayment(double totalOrderPayment) {
        this.totalOrderPayment = totalOrderPayment;
    }
    private List<OrderItem> items = new ArrayList<OrderItem>();
    private RepositorioOrders persistentStorage;

    public Order(int number) {
        this.number = number;

        persistentStorage = new RepositorioOrdersList();
    }

    public Order() {

        number++;
    }

    public int getNumber() {
        return this.number;
    }

    public void setCustomer(Customer customer1) {
        this.customer = customer1;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public void setPayment(Payment payment1) {
        this.payment = payment1;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addOrderItem(OrderItem orderItem) {
        this.items.add(orderItem);
    }

    public List<OrderItem> getItems() {
        return this.items;
    }
    
    public Customer getCustomer() {
        return this.customer;
    }

        public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Shipping getShipping() {
        return this.shipping;
    }

    public Payment getPayment() {
        return this.payment;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double calculateOrderPayment() {

        return payment.orderPayment(this);

    }

    public double checkout(Order order, Payment payment, Shipping shipping)
            throws Exception {

        if (shipping.deliveryTime > Shipping.TEMPO_MAXIMO_ENTREGA) {
            throw new Exception(
                    "o produto no pode ser entregue no prazo m�ximo do tipo de frete escolhido ao fechar a compra!");
        }
        order.setPayment(payment);
        order.setShipping(shipping);

        double total = order.calculateOrderPayment();
        order.setTotalOrderPayment(total);
        return total;
    }

    public double calculatePriceItem(Shipping shipping) {
        return product.calculatePrice(this.quantity) + product.calculateWeight(this.quantity) * shipping.getPricePerKg();
    }
}