package com.niit.kpm.myrest;


import java.util.ArrayList;

import javax.ws.rs.*; 	
import javax.ws.rs.core.MediaType;

@Path("/countries")
public class CountryResource {

	CountryService cs=new CountryService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList getCountries()
	{
		ArrayList loc=cs.getAllCountries();
		return loc;
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Country getCountryById(@PathParam("id") int id)
	{
		
		return cs.getCountry(id);
		
	}
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Country addCountry(Country country)
	{	return cs.updateCountry(country);}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public  void deleteCountry(@PathParam("id") int id)
	{
		cs.deleteCountry(id);
	}
}
