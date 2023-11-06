package com.example.FoodDelivery.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Items {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String resturant;
	private String name;
	private int price;
	
	public Items() {
		super();
	}

	public Items(Long id, String resturant, String name, int price) {
		super();
		this.id = id;
		this.resturant = resturant;
		this.name = name;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResturant() {
		return resturant;
	}

	public void setResturant(String resturant) {
		this.resturant = resturant;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
