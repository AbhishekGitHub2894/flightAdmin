package com.flightAdmin.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.flightAdmin.model.Airports;


public interface FlightDao {

	
	public List<Airports> viewallAirports();
	
	
	public List<Airports> fetchAirports();
}
