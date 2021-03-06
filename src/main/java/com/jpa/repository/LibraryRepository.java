package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jpa.entity.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer>{
	
}