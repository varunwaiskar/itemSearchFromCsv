package com.nagarro.a4.dao;

import java.util.List;
import org.hibernate.query.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nagarro.a4.entities.Tshirt;


@Repository
public class TshirtDAOImpl implements TshirtDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	public List<Tshirt> getTshirt() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query<Tshirt> theQuery = 
				currentSession.createQuery("from Tshirt order by lastName",
						Tshirt.class);
		
		// execute query and get result list
		List<Tshirt> tshirt = theQuery.getResultList();
				
		// return the results		
		return tshirt;
	}

	public void saveTshirt(Tshirt theTshirt) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(theTshirt);
		
	}

	public Tshirt getTshirt(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Tshirt theTshirt =(Tshirt) currentSession.get(Tshirt.class, theId);
		return theTshirt;
	}

	public void deleteTshirt(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Customer where id=:customerId");
		theQuery.setParameter("customerId", theId);
		
		theQuery.executeUpdate();		
	}
	
	public List<Tshirt> searchTshirt(String colour, String size , String gender){
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		Query query = currentSession.createQuery("from TshirtModel t where t.COLOUR = '" 
				+ colour + "' AND t.SIZE = '" + size + "' AND t.GENDER_RECOMMENDATION = '"
				+ gender + "'"
		);

		List<Tshirt> fetchedData = query.list();
		
		return fetchedData;
		
	}

}











