package com.nyetflix.controllers;

import com.nyetflix.entities.Movie;
import com.nyetflix.repositories.MovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Steven on 4/07/2018.
 */

@Controller
@RequestMapping("/movies")
public class MovieController {

    @RequestMapping("/all")
    public ModelAndView getAllMovies() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("allMovies");
        return modelAndView; 
    }
}
