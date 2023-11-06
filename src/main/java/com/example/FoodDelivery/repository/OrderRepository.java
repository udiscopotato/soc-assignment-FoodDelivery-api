package com.example.FoodDelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FoodDelivery.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {

}
