package com.org.springbootcar.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.springbootcar.dto.Car;
import com.org.springbootcar.repository.CarRepository;

@Repository
public class CarDao {
	@Autowired
	CarRepository carRepository;
	
	public Car saveCar(Car car) {
		return carRepository.save(car);
	}
	public Car updateCar(Car car) {
		return carRepository.save(car);
	}
	public List<Car> getAllCars(){
		return carRepository.findAll();
	}
	public Car getCarById(int id) {
		Optional<Car> car = carRepository.findById(id);
		if(car.isPresent()) {
			return car.get();
		}
		else {
			return null;
		}
	}
	public String deleteCarById(int id) {
		Car car = getCarById(id);
		if(car!=null) {
			carRepository.delete(car);
			return car.getId()+" "+car.getBrand()+" is deleted sucessfully";
		}
		else {
			return "No car found";
		}
	}
	public List<Car> getCarByType(String type){
		return carRepository.getCarByType(type);
	}
	public List<Car> getCarByColor(String color){
		return carRepository.getCarByColor(color);
	}
	public List<Car> getCarByBrand(String brand){
		return carRepository.getCarByBrand(brand);
	}
	public List<Car> getCarByBrandAndType(String brand, String type){
		return carRepository.getCarByBrandAndType(brand, type);
	}
	public List<Car> getCarByTypeAndColor(String type, String color){
		return carRepository.getCarByTypeAndColor(type, color);
	}
}
