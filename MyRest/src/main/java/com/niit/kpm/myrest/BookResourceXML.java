package com.niit.kpm.myrest;



import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.core.Response;

@Path("book")
public class BookResourceXML {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{id}")
	public Response getAllBooks(@PathParam("id") String bookId) {
		Book book = new Book();
		book.setId(bookId);
		book.setName("Harry Potter");
		book.setVolumeNumber(1);
		book.setAuthorName("J.K. Rowling");

		return Response.status(200).entity(book).build();	//build automatically converted into XML file need not create manually 

	}

}