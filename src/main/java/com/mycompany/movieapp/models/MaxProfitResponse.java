/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movieapp.models;

import java.util.List;

/**
 *
 * @author Lavan Muthineni<muttineni.lavan@gmail.com>
 */
public class MaxProfitResponse {
    
    private int maxProfit;
    
    private List<Movie> selectedMovies;
    
    public MaxProfitResponse(List<Movie> selectedMovies){
        this.selectedMovies = selectedMovies;
        this.maxProfit = selectedMovies.size(); 
    }
    
    public void setMaxProfit(int maxProfit){
        this.maxProfit = maxProfit;
    }
    
    public int getMaxProfit(){
        return maxProfit;
    }

    /**
     * @return the selectedMovies
     */
    public List<Movie> getSelectedMovies() {
        return selectedMovies;
    }

    /**
     * @param selectedMovies the selectedMovies to set
     */
    public void setSelectedMovies(List<Movie> selectedMovies) {
        this.selectedMovies = selectedMovies;
    }
    
}
