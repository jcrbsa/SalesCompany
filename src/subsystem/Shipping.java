package br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem;

public class Shipping {
	double pricePerWeight;
	int deliveryTime;
	 static final int CrediCard = 0;
	 static final int BankTransfer = 1;
	 static final int TEMPO_MAXIMO_ENTREGA = 5;
	public Shipping(double d, int i) {
		this.pricePerWeight = d;
		this.deliveryTime = i;
	}
	
	public void avaliaPagamentoFrete(int formPayment, int price){
		
		if(formPayment == Shipping.CrediCard){
			if(price > 100){
				System.out.println("Frete Gr�tis" );
				pricePerWeight = 0;
			}
			
		}
		
		
	}
	public void percentagemSobreFrete(Product produto, int quantidade){
		
		
		if(produto.perecivel){
		pricePerWeight = produto.calculatePrice(quantidade)-( produto.calculatePrice(quantidade) * 0.1);
		deliveryTime = 2;
		}
		
	}
	
public void checarProduto(Product produto){
		
		if(produto.perecivel == true){
		
		
				System.out.println("tempo m�ximo de entrega de dois dias e 10% no pre�o do frete." );
				
				
				
				pricePerWeight = 20;
			
			
		}
		
		
	}
	
	

	public double getPricePerKg() {
		return this.pricePerWeight;
	}
	
	public int getDeliveryTime() {
		return this.deliveryTime;
	}
}