package com.org.springbootcar.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.springbootcar.dto.Bike;
import com.org.springbootcar.service.BikeService;

@RestController
public class BikeController{
	@Autowired
	BikeService bikeService;
	@PostMapping("/bikes")
	public Bike saveCar(@RequestBody Bike bike) {
		return bikeService.saveBike(bike);
	}
	@PutMapping("/bikes")
	public Bike updateCar(@RequestBody Bike bike) {
		return bikeService.updateBike(bike);
	}
	@GetMapping("/bikes")
	public List<Bike> getCars(){
		return bikeService.getAllBikes();
	}
	@GetMapping("/bikes/{id}")
	public Bike getCarById(@PathVariable int id) {
		return bikeService.getBikeById(id);
	}
	@DeleteMapping("/bikes/{id}")
	public String deleteCarById(@PathVariable int id) {
		return bikeService.deleteBikeById(id);
	}
}
