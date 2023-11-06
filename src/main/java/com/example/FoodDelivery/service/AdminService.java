package com.example.FoodDelivery.service;

import org.springframework.stereotype.Service;

import com.example.FoodDelivery.entity.Track;
import com.example.FoodDelivery.repository.TrackRepository;

@Service
public class AdminService {
	
	private TrackRepository trackRepository;
	
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
}
