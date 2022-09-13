package com.org.springbootcar.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.springbootcar.dto.Bike;
import com.org.springbootcar.repository.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository bikeRepository;
	public Bike saveBike(Bike bike) {
		return bikeRepository.save(bike);
	}
	public Bike updateBike(Bike bike) {
		return bikeRepository.save(bike);
	}
	public List<Bike> getAllBikes(){
		return bikeRepository.findAll();
	}
	public Bike getBikeById(int id) {
		Optional<Bike> bike = bikeRepository.findById(id);
		if(bike.isPresent()) {
			return bike.get();
		}
		else {
			return null;
		}
	}
	public String deleteBikeById(int id) {
		Bike bike = getBikeById(id);
		if(bike!=null) {
			bikeRepository.delete(bike);
			return bike.getId()+" "+bike.getBrand()+" is deleted sucessfully";
		}
		else {
			return "No Bike Found";
		}
	}
}
