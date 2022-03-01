package com.example.TravelEasy.Dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.TravelEasy.entities.Passengers;

public interface PassengersDao extends JpaRepository<Passengers, Integer>{


}