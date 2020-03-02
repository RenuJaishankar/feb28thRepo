package com.lionel.springpractice.Service;

import com.lionel.springpractice.Repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class MovieService {

@Autowired
MovieRepo movieRepo;
    public ModelAndView getMovies(){
        ModelAndView mav = new ModelAndView("movies");
        mav.addObject("movies", movieRepo.findAll());
        return mav;
    }
}
