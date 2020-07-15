/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movieapp;

import com.mycompany.movieapp.models.MaxProfitResponse;
import com.mycompany.movieapp.models.Movie;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.*;

/**
 *
 * @author Lavan Muthineni<muttineni.lavan@gmail.com>
 */

@Path("movies")
@Produces(MediaType.APPLICATION_JSON)
public class MoviesResource {
    
    private MovieController movieController;
    
    public MoviesResource(MovieController movieController){
        this.movieController = movieController;
    }
 
    @GET
    @Path("/message")
    public String getMsg(){
        return "Welcome To Movies App";
    }
    
    @POST
    @Path("/maxProfit")
    public MaxProfitResponse maxProfit(List<Movie> movies){
        List<Movie> selectedMovies = movieController.getMaxProfitMovies(movies);
        return new MaxProfitResponse(selectedMovies);
    }
}
