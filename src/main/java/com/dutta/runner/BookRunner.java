package com.dutta.runner;

import com.dutta.model.Book;
import com.dutta.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class BookRunner implements CommandLineRunner {

    @Autowired
private BookRepository bookRepo;
    @Override
    public void run(String... args) throws Exception {

//        bookRepository.deleteAll();
//
//        // Saving 4 books into DB
//        bookRepository.saveAll(Arrays.asList(
//                new Book(501, "Core Java",1542L, "Kathy Sierra"),
//                new Book("Spring in Action", 4525L),
//                new Book(503, "Hibernate in Action", 7788L,"Gavin King"),
//                new Book(504, "Practical MongoDB", 54554L,"Shakuntala Gupta")
//        ));
//        System.out.println("All Data saved into MongoDB");
//
//        // Updating ID(PK) manually (allowed) : It will create one new record
//        bookRepository.save(new Book(255,"Practical MongoDB", 5455L,"Navin Sabharwal")); // insert
//
//        // Printing all books
//        List<Book> bookList =  bookRepository.findAll();
//        bookList.forEach(System.out::println);

//        //bookRepo.saveAll(List.of(
//                new Book(500, "Core Java", 200, "Kathy Sierra", 1065.5),
//                new Book(501, "JSP & Servlets", 350, "Kathy Sierra", 1749.0),
//                new Book(502, "Spring in Action", 480, "Craig Walls", 940.75),
//                new Book(503, "Pro Angular", 260, "Freeman", 1949.25),
//                new Book(504, "HTML CSS", 100, "Thomas Powell", 2317.09),
//                new Book(505, "Hibernate in Action", 180, "Gavin King", 889.25),
//                new Book(506, "Practical MongoDB", 180, "Shakuntala Gupta", 785.0),
//                new Book(507, "Pro Spring Boot", 850, "Felipe Gutierrez", 2167.99),
//                new Book(508, "Beginning jQuery", 180, "Franklin", 1500.00),
//                new Book(509, "Java Design Patterns", 114, "Devendra Singh", 919.99)
//
//      //  ));

      //  System.out.println("------All records has been saved successfully-------");

        /* -----------------------------------------------------------------------------------*/

        //bookRepo.getBooksByPages(400).forEach(System.out::println);
        //bookRepo.getBooksByAuthorOrName("Freeman","Spring in Action").forEach(System.out::println);
       //Integer count= bookRepo.getBooksCountByAuthor("Kathy Sierra");

       // System.out.println(count);

       // bookRepo.getBooksByAuthorRegEx("^S").forEach(System.out::println);

       // bookRepo.getBooksByAuthorRegEx("man$").forEach(System.out::println);

    }
}
