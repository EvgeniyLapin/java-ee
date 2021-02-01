package com.senla.dao;

import java.util.ArrayList;

import com.senla.api.dao.IMasterDao;
import com.senla.model.Master;


public class MasterDao implements IMasterDao {
	
	public static ArrayList<Master> masters = new ArrayList<>();
	
	static {
		
		Master master1 = new Master("master1");
		Master master2 = new Master("master2");
		Master master3 = new Master("master3");
		Master master4 = new Master("master4");
		masters.add(master1);
		masters.add(master2);
		masters.add(master3);
		masters.add(master4);
		
	}

	@Override
	public ArrayList<Master> displayAll() {
		System.out.println("list of masters: ");
		return masters;
	}
	

}
