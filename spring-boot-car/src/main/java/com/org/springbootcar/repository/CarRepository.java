package com.org.springbootcar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.org.springbootcar.dto.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{
	public List<Car> getCarByType(String type);
	public List<Car> getCarByColor(String color);
	public List<Car> getCarByBrand(String brand);
	
	@Query("SELECT c FROM Car c WHERE brand = :brand AND type = :type")
	public List<Car> getCarByBrandAndType(@Param("brand") String b, @Param("type") String t);
	
	@Query("SELECT c FROM Car c WHERE type = ?1 AND color = ?2")
	public List<Car> getCarByTypeAndColor(String type, String color);
}
