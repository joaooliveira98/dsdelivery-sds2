package com.devsuperior.dsdelivery.reposiotires;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdelivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
