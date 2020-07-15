/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movieapp;


import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 *
 * @author Lavan Muthineni<muttineni.lavan@gmail.com>
 */

public class MoviesApplication extends Application<AppConfig> {

     @Override
    public void run(AppConfig configuration, Environment e) throws Exception {
        MoviesResource resource = new MoviesResource(new MovieController());
        e.jersey().register(resource);
    }
    
    public static void main(String[] args) throws Exception {
        new MoviesApplication().run("server");
    }


   
    
}