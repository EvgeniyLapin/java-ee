package com.senla.lapin.task3;

public class AssemblyLine implements IAssemblyLine {

	@Override
	public IProduct assembleProduct(IProductPart body, IProductPart chassis, IProductPart engine) {
		IProduct car = new Car();
		car.installFirstPart(body);
		System.out.println("body installed");
		car.installSecondPart(chassis);
		System.out.println("chassis installed");
		car.installThirdPart(engine);
		System.out.println("engine installed");
		return car;
	}

}
