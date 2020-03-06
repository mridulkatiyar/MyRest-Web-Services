package com.niit.kpm.myrest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("employee")
public class EmployeeResource {
	@GET
	@Path("{empno}")
	@Produces("application/json")
	public String getJson(@PathParam("empno") int empno)
	{
		switch(empno)
		{
		case 1:return "{'name':'John Snow', 'age':28}";
		
		case 2:return "{'name':'Peter Parker', 'age':35}";
		
		case 3:return "{'name':'Bhartika Parker', 'age':22}";
		
		default:return "{'name':'Narendra Damodar Das Modi', 'age':56}";
		
		
		}
	}

}
