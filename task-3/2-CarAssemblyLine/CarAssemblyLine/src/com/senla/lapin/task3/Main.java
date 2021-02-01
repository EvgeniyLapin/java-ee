package com.senla.lapin.task3;


public class Main {
	public static void main(String[] args) {
		
		AssemblyLine carLine = new AssemblyLine();
		BodyLineStep body = new BodyLineStep();
		ChassisLineStep chassis = new ChassisLineStep();
		EngineLineStep engine = new EngineLineStep(); 
		
		carLine.assembleProduct(body.buildProductPart(), chassis.buildProductPart(),engine.buildProductPart());
		System.out.println("done");
	}

}
