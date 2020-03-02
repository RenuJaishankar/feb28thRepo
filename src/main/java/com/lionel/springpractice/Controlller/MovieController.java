package com.lionel.springpractice.Controlller;


import com.lionel.springpractice.Model.Animal;
import com.lionel.springpractice.Model.Book;
import com.lionel.springpractice.Model.Movie;
import com.lionel.springpractice.Repo.AnimalRepo;
import com.lionel.springpractice.Repo.BookRepo;
import com.lionel.springpractice.Repo.MovieRepo;
import com.lionel.springpractice.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MovieController {
    @Autowired
    MovieService  movieService;



    // Autowired allows us to avoid constructing an object
    // think of it as dependency injection
//    @Autowired
//    AnimalRepo animalRepo;

    // exposing the endpoint "/hello" that will have the value of the return value of the hello() function
   @RequestMapping(value="/movies",method= RequestMethod.GET)
   ModelAndView getMovies(){
     return movieService.getMovies();
   }

//    @RequestMapping(name="animals.html",method=RequestMethod.GET)
//    public ModelAndView getAnimals(){
//        ModelAndView mav = new ModelAndView("animals");
//        mav.addObject("animals", animalRepo.findAll());
//        return mav;
//    }

//    @RequestMapping("/hello")
//    public String hello(){
//        return "Hello World! My app works!";
//    }

//    @GetMapping("/books")
//    public Iterable<Book> getBooks(){
//        return bookRepo.findAll();
//    }

//    @GetMapping("/movies")
//    public Iterable<Movie> getMovies(){
//        return MovieRepo.findAll();
//    }

    // creating our get method for our animals repo
    // this aligns 1:1 with the HTTP GET method
//    @GetMapping("/animals")
//    public Iterable<Animal> getAnimals(){
//        return animalRepo.findAll();
//    }

}

