package com.senla.lapin.task3;

public interface IAssemblyLine {
	
	IProduct assembleProduct(IProductPart body, IProductPart chassis, IProductPart engine);

}
