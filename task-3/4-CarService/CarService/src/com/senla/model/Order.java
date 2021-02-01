package com.senla.model;

public class Order {
	
	private int id;
	private String orderType;
	private int time;
	
	public Order(int id, String orderType, int time) {
		super();
		this.id = id;
		this.orderType = orderType;
		this.time = time;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderType=" + orderType + ", time=" + time + "]";
	}
	
	
	
	
	

}
