/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.uci.quinto.rest;

/**
 *
 * @author Rodrigo
 */
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldREST {

	@GET
	@Path("/{parameter}")
	public Response responseMsg( @PathParam("parameter") String parameter,
			@DefaultValue("Nothing to say") @QueryParam("value") String value) {

		String output = "Hola: " + parameter;

		return Response.status(200).entity(output).build();
	}
}