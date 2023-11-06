package com.example.FoodDelivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodDelivery.entity.Track;
import com.example.FoodDelivery.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/admin/test")
	public String test() {
		return "From Admin";
	}
	
	@PutMapping("/admin/track/{order_id}/{track_request}")
	public Track updateTrack(@PathVariable("track_request") int track_request, @PathVariable("order_id") Long order_id) {
		return adminService.updateTrack(order_id, track_request);
	}
}
