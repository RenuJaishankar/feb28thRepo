package com.lionel.springpractice.Service;

import com.lionel.springpractice.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;



    public ModelAndView getBooks(){
        ModelAndView mav = new ModelAndView("books");
        mav.addObject("books", bookRepo.findAll());
        return mav;
    }

}
