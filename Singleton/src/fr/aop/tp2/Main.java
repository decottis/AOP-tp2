package fr.aop.tp2;

import sun.security.jca.GetInstance;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<-- Création des clients -->");
		Clients l_clients = Clients.getInstance();
		System.out.println("<-- Création des commandes -->");
		Orders l_orders = Orders.getInstance();
		
		System.out.println("<-- Création des clients -->");
		Clients l_clients1 = Clients.getInstance();
		System.out.println("<-- Création des commandes -->");
		Orders l_orders1 = Orders.getInstance();
		System.out.println("\n");
		
		Client c1 = new Client("Tyler Joseph", "68 rue Blurryface");
		Client c2 = new Client("Josh Dun", "1123 rue Vessel");
		
		l_clients.addClient(c1);
		l_clients.addClient(c2);
		
		Order o1 = new Order(c1, 1, 100.0);
		Order o2 = new Order(c2, 2, 20.0);
		
		l_orders.addOrder(o1);
		l_orders.addOrder(o2);
		
		c1.printClient();
		l_clients.delClient(c1);
		c1.delOrder(o1);
		l_clients.delClient(c1);
		
		
	}

}
