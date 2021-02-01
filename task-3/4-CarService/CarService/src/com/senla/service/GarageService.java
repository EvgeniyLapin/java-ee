package com.senla.service;

import com.senla.api.service.IGarageService;
import com.senla.dao.GarageDao;
import com.senla.model.Garage;

public class GarageService implements IGarageService{

	@Override
	public void addPlace() {
		GarageDao.garage.add(new Garage(5,"new place"));
		
	}

	@Override
	public void removePlace() {
		GarageDao.garage.remove(1);
		
	}

}
