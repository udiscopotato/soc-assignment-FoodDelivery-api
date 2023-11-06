package com.example.FoodDelivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodDelivery.entity.Items;
import com.example.FoodDelivery.entity.Resturant;
import com.example.FoodDelivery.entity.Track;
import com.example.FoodDelivery.service.ResturantService;

@RestController
public class ResturantController {
	
	@Autowired
	private ResturantService resturantService;
	
	@GetMapping("/resturant/test")
	public String test() {
		return "From Resturant";
	}
	
	@PostMapping("/resturant/")
	public Resturant newResturant(@RequestBody Resturant resturant) {
		return resturantService.saveResturant(resturant);
	}
	
	@PostMapping("/resturant/{name}")
	public Items newItem(@PathVariable String name,@RequestBody Items item) {
		item.setResturant(name);
		return resturantService.saveItems(item);
	}
	
	@PutMapping("/resturant/{rid}/{orderid}")
	public Track updateTracking(@PathVariable("orderid") Long orderid) {
		return resturantService.updateTracking(orderid);
	}
}
