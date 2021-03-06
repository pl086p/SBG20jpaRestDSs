package com.jpa.entity;

import javax.persistence.*;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="book_category")
public class BookCategory {
	
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    private Set<Book> books;
    
    public BookCategory(){
    }

    public BookCategory(String name) {
        this.name = name;
    } 
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    @OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        String result = String.format(
                "Category[id=%d, name='%s']%n",
                id, name);
        if (books != null) {
            for(Book book : books) {
                result += String.format(
                        "Book[id=%d, name='%s']%n",
                        book.getId(), book.getName());
            }
        }

        return result;
    }	
	
}

