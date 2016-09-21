package fr.aop.tp2;

import java.util.ArrayList;
import java.util.List;

public class Clients {

	public List<Client> clients;
	
	public Clients() {
		clients = new ArrayList<Client>();
	}

	public void addClient(Client c) {
		clients.add(c);
	}
	public void delClient(Client c) {
		if(!c.hasOrder()) {
			System.out.println("Client supprimé !");
			clients.remove(c);
		} else
			System.out.println("Suppression impossible, ce client a encore des commandes de cours !");
			
	}
	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
}
