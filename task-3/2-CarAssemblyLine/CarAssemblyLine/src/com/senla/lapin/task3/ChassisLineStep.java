package com.senla.lapin.task3;

public class ChassisLineStep implements ILineStep{

	@Override
	public IProductPart buildProductPart() {
		IProductPart chassis = new Chassis("chassis1");
		System.out.println("chassis builded");
		return chassis;
	}
	
	

}
