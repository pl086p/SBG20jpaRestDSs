package com.jpa.entity;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="library")
public class Library {
	
	@Column(name="id")
    private Integer id;
	
    @Column(name="name")
    private String name;
    
   
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
    
}

