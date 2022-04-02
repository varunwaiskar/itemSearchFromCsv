package com.nagarro.a4.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "stock")
public class Tshirt {

	@Id 
	@Column
    private String id;

	@Column  
    private String name;

	@Column 
    private String colour;

	@Column
    private String gender;

	@Column 
    private String size;

	@Column 
    private double price;

	@Column 
    private double rating;

	@Column 
    private String availability;

	public Tshirt() {}

	public Tshirt(String name, String colour, String gender, String size, double price, double rating,
			String availability) {
		super();
		this.name = name;
		this.colour = colour;
		this.gender = gender;
		this.size = size;
		this.price = price;
		this.rating = rating;
		this.availability = availability;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
}
