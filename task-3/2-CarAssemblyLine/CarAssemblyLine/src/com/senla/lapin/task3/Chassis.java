package com.senla.lapin.task3;

public class Chassis implements IProductPart {
	
	private String chassisPart;

	public Chassis(String chassisPart) {
		super();
		this.chassisPart = chassisPart;
	}

	public String getChassisPart() {
		return chassisPart;
	}

	public void setChassisPart(String chassisPart) {
		this.chassisPart = chassisPart;
	}
	
	

}
