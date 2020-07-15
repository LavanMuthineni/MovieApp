/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movieapp.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Lavan Muthineni<muttineni.lavan@gmail.com>
 */
public class Movie implements Comparable<Movie>{
    
    @JsonProperty
    @NotEmpty
    private String name;
    
    private Date startDate;
    
    private Date endDate;
    
    public Movie(){}
    
    public Movie(String name, Date startDate, Date endDate){
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd MMM")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @return the endDate
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd MMM")
    public Date getEndDate() {
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
    
    @JsonProperty
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd MMM")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @param endDate the endDate to set
     */
    @JsonProperty
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd MMM")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    public int compareTo(Movie movie) {
        return (this.startDate).compareTo(movie.startDate);
    }
    
    public String toString(){
        return this.getName();
    }
}



