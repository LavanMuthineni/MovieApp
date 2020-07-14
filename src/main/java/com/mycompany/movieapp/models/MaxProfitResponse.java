/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movieapp.models;

/**
 *
 * @author Lavan Muthineni<muttineni.lavan@gmail.com>
 */
public class MaxProfitResponse {
    
    private int maxProfit;
    
    public MaxProfitResponse(int maxProfit){
        this.maxProfit = maxProfit; 
    }
    
    public void setMaxProfit(int maxProfit){
        this.maxProfit = maxProfit;
    }
    
    public int getMaxProfit(){
        return maxProfit;
    }
    
}
