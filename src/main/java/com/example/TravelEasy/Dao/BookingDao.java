package com.example.TravelEasy.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TravelEasy.entities.Booking;

public interface BookingDao extends JpaRepository<Booking, Integer>{


	}