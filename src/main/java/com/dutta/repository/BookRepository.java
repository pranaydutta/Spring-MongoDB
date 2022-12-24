package com.dutta.repository;

import com.dutta.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends MongoRepository<Book,Integer> {


    @Query("{id:?0}")   //SQL Equivalent : SELECT * FROM BOOK WHERE ID=?
    Optional<Book> getBookById(Integer id);

    @Query("{pages:{$lt:?0}}")   // SQL Equivalent : SELECT * FROM BOOK where pages<?
        // @Query("{ pages : { $gte: ?0 } }")                        // SQL Equivalent : SELECT * FROM BOOK where pages>=?
        //@Query("{ pages : ?0 }")                                      // SQL Equivalent : SELECT * FROM BOOK where pages=?
    List<Book> getBooksByPages(Integer pages);



    @Query("{author: ?0, cost: ?1}")                            // SQL Equivalent : SELECT * FROM BOOK where author = ? and cost=?
        //@Query("{$and :[{author: ?0},{cost: ?1}] }")
    List<Book> getBooksByAuthorAndCost(String author, Double cost);

    @Query("{$or :[{author: ?0},{name: ?1}]}")            //SQL Equivalent : select count(*) from book where author=? or name=?
    List<Book> getBooksByAuthorOrName(String author, String name);

    @Query(value ="{author: ?0}", count=true)           //SQL Equivalent : select count(*) from book where author=?
    Integer getBooksCountByAuthor(String author);


    //Sorting
    @Query(value = "{author:?0}", sort= "{name:1}") //ASC
    //@Query(value = "{author=?0}", sort= "{name:-1}") //DESC
    List<Book> getBooksByAuthorSortByName(String author);

    //------------------- @Query with Projection ---------------------------------------
    @Query(value= "{pages: ?0}", fields="{name:1, author:1}")   // only data of name & author properties will be displayed
    //@Query(value= "{pages: ?0}", fields="{name:1, author:1, cost:1, pages:1}") // will display all properties data
    List<Book> getBookNameAndAuthorByPages(Integer pages);


    @Query(value= "{author : ?0}")           // SQL Equivalent :  select * from books where author=?
    List<Book> getAllBooksByAuthor(String author);


    @Query("{ author : { $regex : ?0 } }")
    List<Book> getBooksByAuthorRegEx(String author);




}
