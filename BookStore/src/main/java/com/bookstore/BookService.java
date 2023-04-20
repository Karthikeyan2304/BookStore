package com.bookstore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bookstore.entity.Book;
import com.bookstore.repository.BookRepo;

@Service
@Component
public class BookService 
{


@Autowired	

private BookRepo repo;

	public void save(Book book)
	{
		repo.save(book);
	}
	
	public List<Book> getAllBookS(){
		return repo.findAll();
	}
	
	public Book getBookById(int id)
	{
		return  repo.findById(id).get();
	}
}
