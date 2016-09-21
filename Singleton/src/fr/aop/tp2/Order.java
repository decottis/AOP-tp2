package fr.aop.tp2;

public class Order {
	
	protected int id;
	protected double amount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}	
	public void printOrder() {
		System.out.println("Order Id : " + id + ", Order amount : " + amount);
	}
	
}
