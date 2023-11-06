package com.example.FoodDelivery.service;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FoodDelivery.entity.Customer;
import com.example.FoodDelivery.entity.Items;
import com.example.FoodDelivery.entity.Orders;
import com.example.FoodDelivery.entity.PlaceOrder;
import com.example.FoodDelivery.entity.Track;
import com.example.FoodDelivery.repository.CustomerRepository;
import com.example.FoodDelivery.repository.ItemsRepository;
import com.example.FoodDelivery.repository.OrderRepository;
import com.example.FoodDelivery.repository.TrackRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ItemsRepository itemsRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private TrackRepository trackRepository;
	
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	
	private String itemName;
	private int itemPrice;
	private String resturant;
	boolean itemdetail(Long id) {
		Items item = itemsRepository.findById(id).get();
		if(item == null) {
			return false;
		}
		itemName=item.getName();
		itemPrice=item.getPrice();
		resturant=item.getResturant();
		return true;
	}
	
	private String name;
	private String num;
	boolean findName(Long id) {
		Customer customer = customerRepository.findById(id).get();
		if(customer == null) {
			return false;
		}
		name=customer.getFirstName()+" "+customer.getLastName();
		num=customer.getMobileNumber();
		return true;
	}
	
	
	
	public Orders saveOrder(Long customer_id,PlaceOrder placed) {
		findName(customer_id);
		itemdetail(placed.getItemId());
		LocalDateTime time = LocalDateTime.now();
		Orders orders = new Orders();
		orders.setItemName(itemName);
		orders.setTotalPrice(itemPrice);
		orders.setResturantName(resturant);
		orders.setMobileNumber(num);
		orders.setCustomerName(name);
		orders.setOrderTime(time);
		orders.setPaymentStatus(placed.getPayment());
		
		name=null;
		num=null;
		itemName=null;
		itemPrice=0;
		resturant=null;
		
		return orderRepository.save(orders);
	}
	
	public Track trackOrder(Long id) {
		Track track = new Track();
		track.setOrderId(id);
		track.setOrderplaced(true);
		track.setDelivered(false);
		track.setResturantAccepted(false);
		track.setOutfordelivery(false);
		
		return trackRepository.save(track);
	}
	
	public List<Items> findItems(String item_name){
		return itemsRepository.findByName(item_name);
	}
}
