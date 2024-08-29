package com.example.springreactive.webflux;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document

public class Book {
    @Id
    private String id;
    private String title;
    private String author;

 public Book() {} 

 public Book(String title, String author) {

this.title = title;

this.author=author;
}
}