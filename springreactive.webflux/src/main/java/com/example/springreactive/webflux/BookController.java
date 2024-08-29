package com.example.springreactive.webflux;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RestController
@RequestMapping("/books")

public class BookController
{

@Autowired
private BookRepository bookRepository;
@GetMapping 
public Flux<Book> getAllBooks(){ 
	return bookRepository.findAll();
}
@GetMapping("/{id}")
public Mono<Book> getBookById(@PathVariable String id) {
	return bookRepository.findById(id);
}
 @PostMapping
public Mono<Book> CreateBook9(@RequestBody Book book){
	return bookrepository.save(book);
}
}