package fr.aop.tp2;

import java.util.ArrayList;
import java.util.List;

public class Orders {

	public List<Order> l_order;
	
	public Orders() {
		l_order = new ArrayList<Order>();
	}
	
	public void addOrder(Order o) {
		l_order.add(o);
	}
	public void delOrder(Order o) {
		l_order.remove(o);
	}
	public List<Order> getOrders() {
		return l_order;
	}

	public void setOrder(List<Order> orders) {
		this.l_order = orders;
	}
	
	
	
}
