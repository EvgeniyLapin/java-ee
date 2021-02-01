package com.senla.service;


import com.senla.api.service.IOrderService;

import com.senla.dao.MasterDao;
import com.senla.dao.OrderDao;
import com.senla.model.Order;

public class OrderService implements IOrderService {
	OrderDao orderDao = new OrderDao();
	MasterDao masterDao = new MasterDao();
	
	
	
    
	@Override
	public void orderAd() {
		OrderDao.orders.add(new Order(6,"change exhaust",1));
		
		
	}

	@Override
	public void removeOrder() {
		OrderDao.orders.remove(1);
		
	}

	@Override
	public void closeOrder() {
		
		 OrderDao.closedOrders.add(OrderDao.orders.remove(1));
	
	}

	@Override
	public void cancelOrder() {
		
		OrderDao.canceledOrders.add(OrderDao.orders.remove(2));
	}
    //add time
	@Override
	public void addTime() {
		OrderDao.orders.get(0).setTime(OrderDao.orders.get(0).getTime()+9);
		
		
	}

	

	
	

} 
