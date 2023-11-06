package com.example.FoodDelivery.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Track {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long orderId;
	private boolean orderplaced;
	private boolean resturantAccepted;
	private boolean outfordelivery;
	private boolean delivered;
	
	public Track() {
		super();
	}

	public Track(Long id, Long orderId, boolean orderplaced, boolean resturantAccepted, boolean outfordelivery,
			boolean delivered) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.orderplaced = orderplaced;
		this.resturantAccepted = resturantAccepted;
		this.outfordelivery = outfordelivery;
		this.delivered = delivered;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public boolean isOrderplaced() {
		return orderplaced;
	}

	public void setOrderplaced(boolean orderplaced) {
		this.orderplaced = orderplaced;
	}

	public boolean isResturantAccepted() {
		return resturantAccepted;
	}

	public void setResturantAccepted(boolean resturantAccepted) {
		this.resturantAccepted = resturantAccepted;
	}

	public boolean isOutfordelivery() {
		return outfordelivery;
	}

	public void setOutfordelivery(boolean outfordelivery) {
		this.outfordelivery = outfordelivery;
	}

	public boolean isDelivered() {
		return delivered;
	}

	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	
	
}
