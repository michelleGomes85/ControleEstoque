package baseclasses;

import util.Constants;

/**
 * A classe Produto representa um item disponível para venda em um sistema de
 * estoque ou comércio eletrônico. Cada produto possui um nome, quantidade
 * disponível em estoque e preço.
 */
public class Product {
	
	private String name;
	private int amount;
	private double price;
	
	public Product() {}
	
	public Product(String name, int amount, double price) {		
		this.name = name;
		this.amount = amount;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format(Constants.STR_PRODUCT, name, amount, price);
	}
	
}//class Product
