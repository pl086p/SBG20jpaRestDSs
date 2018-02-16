package com.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entity.BookCategory;
import com.jpa.repository.BookCategoryRepository;

@RestController
public class BookCategoryRestServiceController {
	@Autowired 
	private BookCategoryRepository bookCategoryRepo;
	
	@GetMapping("/bookCategory/all")
	public @ResponseBody Iterable<BookCategory> getAllBookCategorys() {
		return bookCategoryRepo.findAll();
	}
	
	@GetMapping("/bookCategory/{id}")
	public BookCategory getBookCategoryById(@PathVariable Integer id) {
		return bookCategoryRepo.findOne(id);  
	}
}
