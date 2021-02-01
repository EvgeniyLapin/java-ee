package com.senla.service;

import com.senla.api.service.IMasterService;
import com.senla.dao.MasterDao;
import com.senla.model.Master;

public class MasterService implements IMasterService{

	@Override
	public void addMaster() {
		MasterDao.masters.add(new Master("new master"));
		
	}

	@Override
	public void removeMaster() {
		MasterDao.masters.remove(2);
		
	}

	

}
