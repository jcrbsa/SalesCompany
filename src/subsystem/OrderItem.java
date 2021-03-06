package br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem;

public class OrderItem {

    private Product product;
    private int quantity;
    

    public OrderItem(Product product, int i) {

        this.product = product;
        this.quantity = 1;
    }

    public OrderItem() {
        this.quantity = 1;
    }

    public double calculatePriceItem(Shipping shipping) {
        return product.calculatePrice(this.getQuantity()) + product.calculateWeight(this.getQuantity()) * shipping.getPricePerKg();
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return this.product;
    }

    public int getQuantity() {
        return this.quantity;
    }
}