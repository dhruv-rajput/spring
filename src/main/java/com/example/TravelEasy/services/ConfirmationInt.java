package com.example.TravelEasy.services;

import java.util.List;

import com.example.TravelEasy.entities.Booking;

public interface ConfirmationInt {

	public Booking addBooking(Booking booking);
	public List<Booking> getBooking();
}
