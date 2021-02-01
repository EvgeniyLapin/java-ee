package com.senla.lapin.task3;

public class Engine implements IProductPart {
	
	private String enginePart;

	public Engine(String enginePart) {
		super();
		this.enginePart = enginePart;
	}

	public String getEnginePart() {
		return enginePart;
	}

	public void setEnginePart(String enginePart) {
		this.enginePart = enginePart;
	}
	
}
