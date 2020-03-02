package com.lionel.springpractice.Controlller;



import com.lionel.springpractice.Model.Animal;
import com.lionel.springpractice.Model.Book;
import com.lionel.springpractice.Model.Movie;
import com.lionel.springpractice.Repo.AnimalRepo;
import com.lionel.springpractice.Repo.BookRepo;
import com.lionel.springpractice.Repo.MovieRepo;
import com.lionel.springpractice.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class BookController {
        @Autowired
        BookService bookService;
        @RequestMapping(value="/books",method= RequestMethod.GET)
        ModelAndView getBooks(){
            return bookService.getBooks();
        }


//
//        @RequestMapping("/hello")
//        public String hello(){
//            return "Hello World! My app works!";
//        }

//    @GetMapping("/books")
//    public Iterable<Book> getMovies(){
//        return bookRepo.findAll();
//    }






    }


