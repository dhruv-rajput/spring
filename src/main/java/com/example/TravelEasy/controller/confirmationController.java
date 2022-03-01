package com.example.TravelEasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.TravelEasy.entities.Booking;
import com.example.TravelEasy.services.Confirmation;

@RestController
@CrossOrigin(origins = "*")
public class confirmationController {
	
	@Autowired 
	private Confirmation confirmation;
	
	
	@GetMapping("/confirmation")
	public List<Booking> getConfirmation()
	{
		return this.confirmation.getBooking();
		
	}
	
	
	@PostMapping(path = "/confirmation" , consumes = "application/json")
	public Booking postConfirmation(@RequestBody Booking booking)
	{
		return this.confirmation.addBooking(booking);
	}
	
	
	

}


