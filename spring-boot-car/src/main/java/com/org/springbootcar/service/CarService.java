package com.org.springbootcar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.springbootcar.dao.CarDao;
import com.org.springbootcar.dto.Car;

@Service
public class CarService {
	@Autowired
	CarDao carDao;
	
	public Car saveCar(Car car) {
		return carDao.saveCar(car);
	}
	public Car updateCar(Car car) {
		return carDao.updateCar(car);
	}
	public List<Car> getAllCars(){
		return carDao.getAllCars();
	}
	public Car getCarById(int id) {
		return carDao.getCarById(id);
	}
	public String deleteCarById(int id) {
		return carDao.deleteCarById(id);
	}
	public List<Car> getCarByType(String type){
		return carDao.getCarByType(type);
	}
	public List<Car> getCarByColor(String color){
		return carDao.getCarByColor(color);
	}
	public List<Car> getCarByBrand(String brand){
		return carDao.getCarByBrand(brand);
	}
	public List<Car> getCarByBrandAndType(String brand, String type){
		return carDao.getCarByBrandAndType(brand, type);
	}
	public List<Car> getCarByTypeAndColor(String type, String color){
		return carDao.getCarByTypeAndColor(type, color);
	}
}
