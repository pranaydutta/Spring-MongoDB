package com.dutta.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Document("bookCollection")
public class Book {

    @Id
    private int id;

    private String name;
    private Integer pages;
    private String author;
    private Double cost;
}
