/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movieapp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

/**
 *
 * @author Lavan Muthineni<muttineni.lavan@gmail.com>
 */
public class Movie implements Comparable<Movie>{
    private String name;
    
    private DateTime startDate;
    
    private DateTime endDate;
    
    public Movie(){}
    
    public Movie(String name, DateTime startDate, DateTime endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the startDate
     */
    public DateTime getStartDate() {
        return startDate;
    }

    /**
     * @return the endDate
     */
    public DateTime getEndDate() {
        return endDate;
    }   

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
    
    
    
    // Overriding the compareTo method
    public int compareTo(Movie movie) {
      return (this.startDate).compareTo(movie.startDate);
    }    
}
