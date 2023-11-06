package com.example.FoodDelivery.entity;

public class PlaceOrder {
	
	private Long itemId;
	private String payment;
	
	public PlaceOrder() {
		super();
	}

	public PlaceOrder(Long itemId, String payment) {
		super();
		this.itemId = itemId;
		this.payment = payment;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	
}
