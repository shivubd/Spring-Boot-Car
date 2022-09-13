package com.org.springbootcar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.springbootcar.dto.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer>{
}
