package com.example.FoodDelivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodDelivery.entity.Customer;
import com.example.FoodDelivery.entity.Items;
import com.example.FoodDelivery.entity.Orders;
import com.example.FoodDelivery.entity.PlaceOrder;
import com.example.FoodDelivery.entity.Track;
import com.example.FoodDelivery.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customer/hello")
	public String hello() {
		return "Hello Customer";
	}
	
	@PostMapping("/customer/")
	public Customer newCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	
	@PostMapping("/customer/{id}")
	public Orders newOrder(@PathVariable("id") Long id,@RequestBody PlaceOrder order) {
		return customerService.saveOrder(id, order);
	}
	
	@PostMapping("/customer/{id}/{trid}")
	public Track trackOrder(@PathVariable("trid") Long id) {
		return customerService.trackOrder(id);
	}
	
	@GetMapping("/customer/search/{name}")
	public List<Items> searchItems(@PathVariable("name") String name){
		return customerService.findItems(name);
	}
}
