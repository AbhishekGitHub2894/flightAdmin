package com.flightAdmin.model;




public class Airports {

	
	int id;
	String Name;
	String City;
	String StateOrCountry;
	String iata;
	String icao;
	float lat;
	float lon;
	float alt;
	float timezone;
	String dst;
	String fscode;
	String faacode;
	String citycode;
	String statecode;
	String countrycode;
	String regionname;
	String timezoneregionname;
	int rank;
	int numofpassengers;
	String hub;
	String primary;
	int classification;
	//not taken geopoint - ignored as it is not needed. 
	int hasroute;  // this is bit in db
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getStateOrCountry() {
		return StateOrCountry;
	}
	public void setStateOrCountry(String stateOrCountry) {
		StateOrCountry = stateOrCountry;
	}
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public String getIcao() {
		return icao;
	}
	public void setIcao(String icao) {
		this.icao = icao;
	}
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public float getLon() {
		return lon;
	}
	public void setLon(float lon) {
		this.lon = lon;
	}
	public float getAlt() {
		return alt;
	}
	public void setAlt(float alt) {
		this.alt = alt;
	}
	public float getTimezone() {
		return timezone;
	}
	public void setTimezone(float timezone) {
		this.timezone = timezone;
	}
	public String getDst() {
		return dst;
	}
	public void setDst(String dst) {
		this.dst = dst;
	}
	public String getFscode() {
		return fscode;
	}
	public void setFscode(String fscode) {
		this.fscode = fscode;
	}
	public String getFaacode() {
		return faacode;
	}
	public void setFaacode(String faacode) {
		this.faacode = faacode;
	}
	public String getCitycode() {
		return citycode;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	public String getStatecode() {
		return statecode;
	}
	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getRegionname() {
		return regionname;
	}
	public void setRegionname(String regionname) {
		this.regionname = regionname;
	}
	public String getTimezoneregionname() {
		return timezoneregionname;
	}
	public void setTimezoneregionname(String timezoneregionname) {
		this.timezoneregionname = timezoneregionname;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getNumofpassengers() {
		return numofpassengers;
	}
	public void setNumofpassengers(int numofpassengers) {
		this.numofpassengers = numofpassengers;
	}
	public String getHub() {
		return hub;
	}
	public void setHub(String hub) {
		this.hub = hub;
	}
	public String getPrimary() {
		return primary;
	}
	public void setPrimary(String primary) {
		this.primary = primary;
	}
	public int getClassification() {
		return classification;
	}
	public void setClassification(int classification) {
		this.classification = classification;
	}
	public int getHasroute() {
		return hasroute;
	}
	public void setHasroute(int hasroute) {
		this.hasroute = hasroute;
	}
	
	
	
	
	
}
