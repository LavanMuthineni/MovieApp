/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movieapp;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Lavan Muthineni<muttineni.lavan@gmail.com>
 */

@Path("movies")
@Produces(MediaType.APPLICATION_JSON)
public class MoviesResource {
 
    @GET
    @Path("/message")
    public String getMsg(){
        return "Welcome To Movies App";
    }
    
    @POST
    @Path("/maxProfit")
    public int maxProfit(){
        return -1;
    }
}
