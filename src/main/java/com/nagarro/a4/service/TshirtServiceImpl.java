package com.nagarro.a4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nagarro.a4.entities.Tshirt;

import com.nagarro.a4.dao.TshirtDAO;

@Service
public class TshirtServiceImpl implements TshirtService {

	// need to inject customer dao
	@Autowired
	private TshirtDAO tshirtDAO;
	
	@Transactional
	public List<Tshirt> getTshirt() {
		return tshirtDAO.getTshirt();
	}

	@Transactional
	public void saveTshirt(Tshirt theTshirt) {

		tshirtDAO.saveTshirt(theTshirt);
	}

	@Transactional
	public Tshirt getTshirt(int theId) {
		
		return tshirtDAO.getTshirt(theId);
	}
	
	@Transactional
	public void deleteTshirt(int theId) {
		
		tshirtDAO.deleteTshirt(theId);
	}

	@Transactional
	public List<Tshirt> searchTshirt(String colour, String size , String gender) {
		return tshirtDAO.searchTshirt(colour, size, gender);
	}
}





