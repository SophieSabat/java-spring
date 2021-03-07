package com.example.javaspring.dao;


import com.example.javaspring.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarDAO extends JpaRepository<Car, Integer> {
}
