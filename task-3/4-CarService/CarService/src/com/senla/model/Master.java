package com.senla.model;

public class Master {
	
	private String name;

	public Master(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Master [name=" + name + "]";
	}
	
	

}
