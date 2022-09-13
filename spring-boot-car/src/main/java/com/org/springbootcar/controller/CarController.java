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

import com.org.springbootcar.dto.Car;
import com.org.springbootcar.service.CarService;

@RestController
public class CarController {
	@Autowired
	CarService carService;
	
	@PostMapping("/cars")
	public Car saveCar(@RequestBody Car car) {
		return carService.saveCar(car);
	}
	@PutMapping("/cars")
	public Car updateCar(@RequestBody Car car) {
		return carService.updateCar(car);
	}
	@GetMapping("/cars")
	public List<Car> getCars(){
		return carService.getAllCars();
	}
	@GetMapping("/cars/{id}")
	public Car getCarById(@PathVariable int id) {
		return carService.getCarById(id);
	}
	@DeleteMapping("/cars/{id}")
	public String deleteCarById(@PathVariable int id) {
		return carService.deleteCarById(id);
	}
	@GetMapping("/carstype/{type}")
	public List<Car> getCarsByType(@PathVariable String type){
		return carService.getCarByType(type);
	}
	@GetMapping("/carscolor/{color}")
	public List<Car> getCarByColor(@PathVariable String color){
		return carService.getCarByColor(color);
	}
	@GetMapping("/carsbrand/{brand}")
	public List<Car> getCarByBrand(@PathVariable String brand){
		return carService.getCarByBrand(brand);
	}
	@GetMapping("/cars/{brand}/{type}")
	public List<Car> getCarByBrandAndType(@PathVariable String brand, @PathVariable String type){
		return carService.getCarByBrandAndType(brand, type);
	}
	@GetMapping("/carstc/{type}/{color}")
	public List<Car> getCarByTypeAndColor(@PathVariable String type, @PathVariable String color){
		return carService.getCarByTypeAndColor(type, color);
	}
}
