package com.senla.dao;

import java.util.ArrayList;
import com.senla.api.dao.IGarageDao;
import com.senla.model.Garage;


public class GarageDao implements IGarageDao {
	
	public static ArrayList<Garage> garage = new ArrayList<>();
	
        static {
		Garage place1 = new Garage(1,"new place");
		Garage place2 = new Garage(2,"new place");
		Garage place3 = new Garage(3,"new place");
		Garage place4 = new Garage(4,"new place");
		garage.add(place1);
		garage.add(place2);
		garage.add(place3);
		garage.add(place4);
	}

		@Override
		public ArrayList<Garage> displayAll() {
			System.out.println("Places: ");
			return garage;
		}

}
