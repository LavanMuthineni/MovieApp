/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movieapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lavan Muthineni<muttineni.lavan@gmail.com>
 */
public class DateUtil {
    
    public static DateFormat DateFormatter = new SimpleDateFormat("dd MMM");
           
    public static Date parseDate(String dateInput) throws Exception{
        if(dateInput == null || dateInput.isEmpty()){
             throw new Exception("Please check, date should not be empty");
        }
        
        try {
            return DateFormatter.parse(dateInput);
        } 
        catch (Exception e) {
            throw new Exception("Please check date input : " + dateInput);
        }
    }
    
    public static String toString(Date date) throws Exception{
        if(date == null){
             throw new Exception("Please check, date should not be empty");
        }
        
        try {
            return DateFormatter.format(date);
        } 
        catch (Exception e) {
            throw new Exception("Please check date input : " + date);
        }
    }
}
