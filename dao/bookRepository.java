package com.example.bookss.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.bookss.entities.book;

//public interface bookRepository extends JpaRepository<book, Integer>  {
//	
//}
public interface bookRepository extends CrudRepository<book, Integer>  {
	
}