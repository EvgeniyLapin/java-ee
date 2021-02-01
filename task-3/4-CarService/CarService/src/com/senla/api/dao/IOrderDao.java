package com.senla.api.dao;
import java.util.ArrayList;
import com.senla.model.Order;

public interface IOrderDao {
	
	ArrayList<Order> newDisplay();
	ArrayList<Order> displayClosed();
	ArrayList<Order> displayCanceled();
	
	

}
