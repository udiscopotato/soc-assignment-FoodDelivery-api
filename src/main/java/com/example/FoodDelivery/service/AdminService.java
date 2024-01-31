package com.example.FoodDelivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FoodDelivery.entity.Customer;
import com.example.FoodDelivery.entity.Track;
import com.example.FoodDelivery.repository.CustomerRepository;
import com.example.FoodDelivery.repository.TrackRepository;

@Service
public class AdminService {
	
	@Autowired
	private TrackRepository trackRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Track updateTrack(Long track_id,int track_req) {
		Track track = trackRepository.findById(track_id).get();
		
		if(track_req == 3) {
			track.setOutfordelivery(true);
		}else {
			track.setOutfordelivery(true);
			track.setDelivered(true);
		}
		
		return trackRepository.save(track);
	}
	
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
}
