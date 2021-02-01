package com.senla.lapin.task3;

public class Car implements IProduct {
	
	private IProductPart body;
	private IProductPart chassis;
	private IProductPart engine;
	
	public IProductPart getBody() {
		return body;
	}
	public void setBody(IProductPart body) {
		this.body = body;
	}
	public IProductPart getChassis() {
		return chassis;
	}
	public void setChassis(IProductPart chassis) {
		this.chassis = chassis;
	}
	public IProductPart getEngine() {
		return engine;
	}
	public void setEngine(IProductPart engine) {
		this.engine = engine;
	}
	@Override
	public void installFirstPart(IProductPart first) {
		setBody(body);
		
	}
	@Override
	public void installSecondPart(IProductPart second) {
		setChassis(chassis);
		
	}
	@Override
	public void installThirdPart(IProductPart third) {
		setEngine(engine);
		
	}
	
	
	
	
	
}