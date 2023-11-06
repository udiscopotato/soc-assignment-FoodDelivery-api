package com.example.FoodDelivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FoodDelivery.entity.Items;

public interface ItemsRepository extends JpaRepository<Items, Long>{
	public List<Items> findByName(String name);
}
