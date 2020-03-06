package com.niit.kpm.myrest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {
	 @GET
	    @Produces(MediaType.TEXT_PLAIN)
	    public String sayPlainTextHeloo() {
	        return "Go Got it!";
	    }
	    @GET
	    @Path("/xmlhello")
	    @Produces(MediaType.TEXT_XML)
	    public String SayXMLHello()
	    {
	    	return "<?xml version=\"1.0\"?>"+"<hello> HELLO Jersey"+"</hello></xml>";
	    }
	    @GET
	    @Path("/htmlhello")
	    @Produces(MediaType.TEXT_XML)
	    public String SayHTMLHello()
	    {
	    	return "<HTML>"+"<TITLE>"+"HELLO Jersey"+"</TITLE>"+"<BODY><H1>"+
	    "Hello Jersey HTML"+"</h1><body>"+"</html>";
	    }



}
