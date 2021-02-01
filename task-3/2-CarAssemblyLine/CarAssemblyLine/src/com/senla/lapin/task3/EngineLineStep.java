package com.senla.lapin.task3;

public class EngineLineStep implements ILineStep {

	@Override
	public IProductPart buildProductPart() {
		IProductPart engine = new Engine("engine1");
		System.out.println("engine builded");
		return engine;
	}
	
	

}
