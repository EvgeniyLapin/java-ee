package com.senla.lapin.task3;

public class BodyLineStep implements ILineStep{

	@Override
	public IProductPart buildProductPart() {
		IProductPart body = new Body("body1");
		System.out.println("body builded");
		return body;
	}
	
	

}
