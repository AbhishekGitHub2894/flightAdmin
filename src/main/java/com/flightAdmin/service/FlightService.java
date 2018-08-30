package com.flightAdmin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.flightAdmin.dao.FlightDaoImpl;
import com.flightAdmin.model.Airports;

@Service
public class FlightService {

	@Autowired
	FlightDaoImpl fd;
	
	
public List<Airports> getflightcountry(){
		
		return fd.fetchAirports();
	}
	
}
