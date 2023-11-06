package com.example.FoodDelivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FoodDelivery.entity.Items;
import com.example.FoodDelivery.entity.Resturant;
import com.example.FoodDelivery.entity.Track;
import com.example.FoodDelivery.repository.ItemsRepository;
import com.example.FoodDelivery.repository.ResturantRepository;
import com.example.FoodDelivery.repository.TrackRepository;

@Service
public class ResturantService {
	
	@Autowired
	private ResturantRepository resturantRepository;
	
	@Autowired
	private ItemsRepository itemsRepository;
	
	@Autowired
	private TrackRepository trackRepository;
	
	public Resturant saveResturant(Resturant resturant) {
		return resturantRepository.save(resturant);
	}
	
	public Items saveItems(Items item) {
		return itemsRepository.save(item);
	}
	
	public Track updateTracking(Long trackId) {
		Track track = trackRepository.findById(trackId).get();
		track.setResturantAccepted(true);
		return trackRepository.save(track);
	}
}
