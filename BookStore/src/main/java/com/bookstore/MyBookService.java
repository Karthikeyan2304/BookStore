package com.bookstore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entity.MyBookEnity;
import com.bookstore.repository.MyBookRepo;

@Service
public class MyBookService {
	
	@Autowired
	private MyBookRepo mybookrepo;
	
	
	public void  saveMyBook(MyBookEnity mybook)
	{
	mybookrepo.save(mybook);
	}
	
	public List<MyBookEnity> getMyAllMyBook()
	{
	return mybookrepo.findAll();	
	}
	
	public void deleteById(int id)
	{
mybookrepo.deleteById(id);	
	}
}



