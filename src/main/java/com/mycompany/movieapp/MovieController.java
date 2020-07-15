/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movieapp;

import com.mycompany.movieapp.models.Movie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Lavan Muthineni<muttineni.lavan@gmail.com>
 */
public class MovieController {

    public static void main(String[] args) throws Exception {

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("a1", DateUtil.parseDate("26 Jan"), DateUtil.parseDate("31 Jan")));
        movies.add(new Movie("a2", DateUtil.parseDate("30 Jan"), DateUtil.parseDate("15 Feb")));
        movies.add(new Movie("a3", DateUtil.parseDate("30 Jan"), DateUtil.parseDate("28 Mar")));
        movies.add(new Movie("a4", DateUtil.parseDate("29 Feb"), DateUtil.parseDate("30 Mar")));
        movies.add(new Movie("a5", DateUtil.parseDate("5 Mar"), DateUtil.parseDate("28 Mar")));
        movies.add(new Movie("a6", DateUtil.parseDate("5 Apr"), DateUtil.parseDate("29 Apr")));

        System.out.println(new MovieController().getMaxProfitMovies(movies).toString());

    }

    public List<Movie> getMaxProfitMovies(List<Movie> movies) {
        List<Movie> selectedMovies = new ArrayList<Movie>();

        if (movies == null || movies.isEmpty()) {
            return selectedMovies;
        }

        Collections.sort(movies);
        Date lastFilmEndingTime = null;
        int count = 0;

        for (int i = 0; i < movies.size(); i++) {
            Movie currentMovie = movies.get(i);

            if (lastFilmEndingTime == null
                    || currentMovie.getStartDate().after(lastFilmEndingTime)) {
                lastFilmEndingTime = currentMovie.getEndDate();
                count++;
                selectedMovies.add(currentMovie);
            } else if (currentMovie.getEndDate().before(lastFilmEndingTime)) {
                lastFilmEndingTime = currentMovie.getEndDate();
                selectedMovies.set(selectedMovies.size() - 1, currentMovie);
            }
        }

        return selectedMovies;
    }

}
