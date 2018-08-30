package com.flightAdmin.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.flightAdmin.model.Airports;

@Repository
public class FlightDaoImpl implements FlightDao{

	private DataSource dataSource;
	 
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
	
	/**
	 * Method to View all the Airports
	 */
	public List<Airports> viewallAirports() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Airports> fetchAirports() {
		// TODO Auto-generated method stub
		
		jdbcTemplate = new JdbcTemplate(dataSource);
		List<Airports> he=new ArrayList<Airports>();
		
		String CountryCode = "US";
		
		List<Map<String, Object>> rows=(List<Map<String, Object>>) jdbcTemplate.queryForList(SqlQuery.getAirports, CountryCode);
		
		 for (Map<String, Object> row : rows) {
		   		Airports ar=new Airports();
		   		ar.setIata((String) row.get("IATA"));
		   		he.add(ar);
		   		//System.out.println("Added ---- ");
		   	}
		
		return he;
	
	}

}
