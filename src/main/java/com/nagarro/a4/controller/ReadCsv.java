package com.nagarro.a4.controller;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.a4.entities.Tshirt;
import com.opencsv.CSVReader;

public class ReadCsv {

	@Autowired
	static SessionFactory sessionFactory;
	
	public static void main(String[] args) throws Exception {

		List<Tshirt> list1 = readCsvFiles("D:\\Study\\Naggaro Spring\\CSV\\Adidas.csv");
		List<Tshirt> list2 = readCsvFiles("D:\\Study\\Naggaro Spring\\CSV\\Nike.csv");
		List<Tshirt> list3 = readCsvFiles("D:\\Study\\Naggaro Spring\\CSV\\Puma.csv");

		
		
		
		Session session = sessionFactory.getCurrentSession();

		Transaction tx = session.beginTransaction();

		session.save(list1.get(0));

		for (Tshirt model : list1) {
			session.save(model);
			System.out.println(model);

		}
		
		for (Tshirt model : list2) {
			session.save(model);
			System.out.println(model);

		}
		
		for (Tshirt model : list3) {
			session.save(model);
			System.out.println(model);

		}
		

		tx.commit();

	}
	
	
	public static List<Tshirt> readCsvFiles(String file) throws Exception {

		// Instantiating the CSVReader class

		CSVReader reader = new CSVReader(new FileReader(file), '|');

		
		Tshirt model = new Tshirt();
		List<Tshirt> list = new ArrayList<Tshirt>();

		String line[];

		reader.readNext();

		while ((line = reader.readNext()) != null) {

			model = new Tshirt();

			model.setId(line[0]);
			model.setName(line[1]);
			model.setColour(line[2]);
			model.setGender(line[3]);
			model.setSize(line[4]);
			model.setPrice(Double.parseDouble(line[5]));
			model.setRating(Double.parseDouble(line[6]));
			model.setAvailability(line[7]);

			list.add(model);

		}

		return list;

	}
	
}
