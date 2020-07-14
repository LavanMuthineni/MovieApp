/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movieapp;

import com.mycompany.movieapp.models.Movie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTime;

/**
 *
 * @author Lavan Muthineni<muttineni.lavan@gmail.com>
 */
public class MovieController {
    
    
    public static void main(String[] args){
    
          List<Movie> movies = new ArrayList<>();
          movies.add(new Movie("a2", new DateTime("2020-1-30"), new DateTime("2020-2-15")));
          movies.add(new Movie("a1", new DateTime("2020-1-26"), new DateTime("2020-1-31")));
          
          movies.add(new Movie("a3", new DateTime("2020-2-14"), new DateTime("2020-2-28")));
          movies.add(new Movie("a4", new DateTime("2020-2-29"), new DateTime("2020-3-30")));
          movies.add(new Movie("a5", new DateTime("2020-3-05"), new DateTime("2020-3-28")));
          movies.add(new Movie("a6", new DateTime("2020-4-05"), new DateTime("2020-4-29")));
          System.out.println(new MovieController().getMaxProfit(movies));
          
          
    }
    
    public int getMaxProfit(List<Movie> movies){
        
        if(movies == null || movies.isEmpty()){
           return 0;
        }
        
        Collections.sort(movies);
        DateTime lastFilmEndingTime = null;
        int count = 0;
        
        for(int i=0; i<movies.size(); i++){
            Movie currentMovie = movies.get(i);
            
            if( lastFilmEndingTime == null || 
                currentMovie.getStartDate().getMillis() > lastFilmEndingTime.getMillis()){
                lastFilmEndingTime = currentMovie.getEndDate();
                count++;
            }
            else if(currentMovie.getEndDate().getMillis() < lastFilmEndingTime.getMillis()){
                lastFilmEndingTime= currentMovie.getEndDate();
            }
        }
        
        return count;
    }
    
}
