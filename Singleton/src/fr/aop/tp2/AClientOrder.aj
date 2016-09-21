package fr.aop.tp2;

import java.util.ArrayList;
import java.util.List;


public aspect AClientOrder {
	
	// Client 
	static boolean listClients = true, listOrders = true;
	private List<Order> Client.orders;
	public List<Order> Client.getOrders() { return orders; }

	public void Client.setOrders(List<Order> orders) { this.orders = orders; }
	
	public void Client.addOrder(Order o) { orders.add(o); }
	
	public void Client.delOrder(Order o) { orders.remove(o);}
	
	public boolean Client.hasOrder() { 
		return !orders.isEmpty();
	}

	pointcut clientConstructor():
		execution(fr.aop.tp2.Client.new(String,String));

	after(): clientConstructor() {
			List<Order> tmp = new ArrayList<Order>();
			((Client)thisJoinPoint.getTarget()).setOrders(tmp);
			listClients = false;
	}

	pointcut printOrders():
		execution(void fr.aop.tp2.Client.printClient());

	after(): printOrders() {
		List<Order> tmp = ((Client)thisJoinPoint.getThis()).getOrders();
		if(tmp.size()>0){
			for(Order o : tmp) {
				o.printOrder();
			}
		} else {
			System.out.println("0 commandes.");
		}
		

	}
	// Order 
	public Client Order.client;
	private Client Order.getClient() { return client; }
	private void Order.setClient(Client client) { 
		this.client = client;
		client.delOrder(this);
		this.client.addOrder(this);
	}

	public Order.new(Client client, int id, double amount) {
		super();
			this.client = client;
			this.id = id;
			this.amount = amount;
			client.addOrder(this);
			AClientOrder.listClients = false;

	}
	pointcut addClientToPrintOrder():
		execution(void fr.aop.tp2.printOrder());

	after(): addClientToPrintOrder() {
		System.out.println("\n" + ((Order)thisJoinPoint.getTarget()).getClient() );

	}
}
