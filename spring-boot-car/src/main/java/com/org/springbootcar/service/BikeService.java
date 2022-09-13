package com.org.springbootcar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.springbootcar.dao.BikeDao;
import com.org.springbootcar.dto.Bike;

@Service
public class BikeService {
	@Autowired
	BikeDao bikeDao;
	
	public Bike saveBike(Bike bike) {
		return bikeDao.saveBike(bike);
	}
	public Bike updateBike(Bike bike) {
		return bikeDao.updateBike(bike);
	}
	public List<Bike> getAllBikes(){
		return bikeDao.getAllBikes();
	}
	public Bike getBikeById(int id) {
		return bikeDao.getBikeById(id);
	}
	public String deleteBikeById(int id) {
		return bikeDao.deleteBikeById(id);
	}
}
