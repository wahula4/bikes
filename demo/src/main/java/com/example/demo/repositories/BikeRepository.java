package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
