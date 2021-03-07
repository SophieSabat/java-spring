package com.example.javaspring.dao;

import com.example.javaspring.models.Princess;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrincessDAO extends JpaRepository<Princess, Integer> {
}
