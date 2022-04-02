package com.nagarro.a4.service;

import java.util.List;

import com.nagarro.a4.entities.Tshirt;


public interface TshirtService {

	public List<Tshirt> getTshirt();

	public void saveTshirt(Tshirt theTshirt);

	public Tshirt getTshirt(int theId);

	public void deleteTshirt(int theId);
	
	public List<Tshirt> searchTshirt(String colour, String size , String gender);

}
