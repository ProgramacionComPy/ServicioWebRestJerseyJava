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
import com.google.gson.Gson;
import edu.uci.quinto.clases.Numeros;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("/suma")
public class SumaRestService {
 
	@GET
	@Path("/sumar/{parameter}/{parameter2}")
	public String  sumarNumerosGet(@PathParam("parameter") int msg, @PathParam("parameter2") int msg2) {
 
	return String.valueOf(msg+msg2);
        
	}
        
        @POST
        @Path("/sumar")
        @Consumes(MediaType.APPLICATION_JSON)
        @Produces(MediaType.TEXT_PLAIN)
        public String  sumarNumerosPost(String json) { 
            Gson gson = new Gson();
            Numeros nums = gson.fromJson(json, Numeros.class);     
            String responseString = String.valueOf(nums.getNro1()+nums.getNro2());
    
        return responseString;
 
	}
        
        @PUT
        @Path("/sumar")
        @Consumes(MediaType.APPLICATION_JSON)
        @Produces(MediaType.TEXT_PLAIN)
        public String  sumarNumerosPut(String json) { 
            Gson gson = new Gson();
            Numeros nums = gson.fromJson(json, Numeros.class);     
            String responseString = String.valueOf(nums.getNro1()+nums.getNro2());
    
        return responseString;
 
	}
 
}