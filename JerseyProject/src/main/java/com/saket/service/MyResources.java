package com.saket.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.saket.dto.Customers;

@Path("/myproject")
public class MyResources {

	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getName(@PathParam("param") String msg) {

		Customers c = new Customers();
		c.setName(msg);
		c.setCity("Bangaluru");
		return c.getName();
	}

}
