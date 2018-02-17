package com.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entity.Book;
import com.jpa.repository.BookRepository;

@RestController
public class BookRestServiceController {
	@Autowired // This means to get the bean called customerRepository, Which is auto-generated by Spring, we will use it to handle the data
	private BookRepository bookRepo;
	
	@GetMapping("/jpaRest/getAllBook")
	public @ResponseBody Iterable<Book> getAllBooks() {
		return bookRepo.findAll();
	}
	
	@GetMapping("/jpaRest/getBookById/{id}")
	public Book getBookById(@PathVariable Integer id) {
		return bookRepo.findOne(id);  
	}
}
