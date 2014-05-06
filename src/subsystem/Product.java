package br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem;

public class Product {	

	public String name;
	public double price;
	public double weight;
	public boolean perecivel;
        private double quantidade;

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Product() {
    }
	
        
	public Product(String name, double price, double weight) {
		this.name = name;
		this.price = price;
		this.weight = weight;
		
	}
	
	
	public Product(String name, double price, double weight, boolean perecivel) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.perecivel = perecivel;
	}


	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double calculatePrice(int quantity) {
		return this.price * quantity;
	}
	
	public double getWeight() {
		return this.weight;
	}
		
	public double calculateWeight(int quantity) {
		return this.weight * quantity;
	}
	
	public boolean getPerecivel() {
		return this.perecivel;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}

	
}