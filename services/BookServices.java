package com.example.bookss.services;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.bookss.dao.bookRepository;
import com.example.bookss.entities.book;

@Service
public class BookServices {
	@Autowired
	private bookRepository repositoryy;
//	private static List<book> list = new ArrayList<>();
//	static {
//		list.add(new book(12, "python programming ", "XYZ"));
//		list.add(new book(15, "java programming ", "XDFDFFYZ"));
//		list.add(new book(17, "javascript programming ", "XDDFFGYZ"));
//		list.add(new book(16, "cpp programming ", "XYZGJKLOJ"));
//
//	}

	// get all books
	public List<book> getAllBooks() {
		List<book> list=(List<book>) this.repositoryy.findAll();
			return list;
	}

	public book getBookById(int id) {
		book book = null;
		try {
			
//		  book = list.stream().filter(e -> e.getId() == id).findFirst().get();
			book =this.repositoryy.findById(id).get();
			 
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return book;

	}

	// adding the book
	public book addBook(book b) {
		book result=repositoryy.save(b);
		return result;
	}

	// delete book
	public void deleteBook(int bid) {
//		list = list.stream().filter(book -> book.getId() != bid).collect(Collectors.toList());
		repositoryy.deleteById(bid);
		
	}

	// update the book
	public void updateBook(book book,int bookId)
	{
//	   list =list.stream().map(b->{
//		   if (b.getId()==bookId) {
//			 b.setTitle(book.getTitle());
//			 b.setAuthor(book.getAuthor());
//		}
//		   return b;
//	   }).collect(Collectors.toList());
//	   }
		book.setId(bookId);
		repositoryy.save(book);}
	}


