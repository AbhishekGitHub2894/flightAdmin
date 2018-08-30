package com.flightAdmin.controller;

import java.util.List;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flightAdmin.model.Airports;
import com.flightAdmin.service.FlightService;



@RestController
public class FlightController {

	@Autowired
	FlightService fs;
	
	
	@RequestMapping(value="/getflightiata",method=RequestMethod.GET)
	@Produces({"application/json"})
	public ResponseEntity<List<Airports>> fetchflightsiata(){	
		System.out.println("Inside the getallexpense controller");	
		List<Airports> getexp = fs.getflightcountry();
		return new ResponseEntity<List<Airports>>(getexp,HttpStatus.OK);
	}
	
	
	
	
}
