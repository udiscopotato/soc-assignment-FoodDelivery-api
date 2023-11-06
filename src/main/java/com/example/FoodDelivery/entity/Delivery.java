package com.example.FoodDelivery.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Delivery {
	
	@Id
	private String id;
	private String status;
	private boolean deliveryStatus;
	
	public Delivery() {
		super();
	}

	public Delivery(String id, String status, boolean deliveryStatus) {
		super();
		this.id = id;
		this.status = status;
		this.deliveryStatus = deliveryStatus;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(boolean deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	
	
}
