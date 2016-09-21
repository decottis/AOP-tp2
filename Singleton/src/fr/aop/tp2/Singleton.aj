package fr.aop.tp2;

import java.util.ArrayList;
import java.util.List;

public aspect Singleton {

	// singleton clients
	private static Clients singletonClients;
		
	public static Clients Clients.getInstance(){
		if(singletonClients == null){
			singletonClients = new Clients();
			System.out.println("(liste créée !)");
		} else {
			System.out.println("(Liste de clients déjà existante !)");
		} 
		return singletonClients;
	}
	
	// singleton order
	private static Orders singletonOrders;
	
	public static Orders Orders.getInstance(){
		if(singletonOrders == null){
			singletonOrders = new Orders();
			System.out.println("(liste créée !)");
		} else {
			System.out.println("(Liste de orders déjà existante !)");
		} 
		return singletonOrders;
	}
		
	
}