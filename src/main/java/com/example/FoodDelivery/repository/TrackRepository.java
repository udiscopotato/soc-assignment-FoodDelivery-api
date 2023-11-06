package com.example.FoodDelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FoodDelivery.entity.Track;

public interface TrackRepository extends JpaRepository<Track, Long> {

}
