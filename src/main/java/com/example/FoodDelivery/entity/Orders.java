package com.example.FoodDelivery.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue()
	private Long id;
	
	private LocalDateTime orderTime;
	
	private String itemName;
	private String resturantName;
	private String customerName;
	private String mobileNumber;
	private int totalPrice;
	private String paymentStatus;
	
	public Orders() {
		super();
	}

	public Orders(Long id, LocalDateTime orderTime, String itemName, String resturantName, String orderBy,
			String mobileNumber, int totalPrice, String paymentStatus) {
		super();
		this.id = id;
		this.orderTime = orderTime;
		this.itemName = itemName;
		this.resturantName = resturantName;
		this.customerName = orderBy;
		this.mobileNumber = mobileNumber;
		this.totalPrice = totalPrice;
		this.paymentStatus = paymentStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public LocalDateTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getResturantName() {
		return resturantName;
	}

	public void setResturantName(String resturantName) {
		this.resturantName = resturantName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String orderBy) {
		this.customerName = orderBy;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	
}
