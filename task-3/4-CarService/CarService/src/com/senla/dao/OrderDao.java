package com.senla.dao;

import java.util.ArrayList;

import com.senla.api.dao.IOrderDao;
import com.senla.model.Order;

public class OrderDao implements IOrderDao {
	
	public static ArrayList <Order> orders = new ArrayList<>();
	public static ArrayList <Order> closedOrders = new ArrayList<>();
	public static ArrayList <Order> canceledOrders = new ArrayList<>();
	
	static {
		
		Order order1 = new Order(1,"change engine",2);
		Order order2 = new Order(2,"paint body",3);
		Order order3 = new Order(3,"repair wheels",1);
		Order order4 = new Order(4,"set stage 1",1);
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		orders.add(order4);
		
	}
	

	


	@Override
	public ArrayList<Order> displayClosed() {
		System.out.println("List of closed orders");
		return closedOrders;
	}


	@Override
	public ArrayList<Order> displayCanceled() {
		System.out.println("List of canceled orders");
		return canceledOrders;
	}


	@Override
	public ArrayList<Order> newDisplay() {
		for(Order c : orders) {
			System.out.print("id: " + c.getId() + "; ");
			System.out.print("Type: " + c.getOrderType() + "; ");
			System.out.println(c.getTime() + "  days ");
			
		}
		return orders;
		
	}
	
	

}
