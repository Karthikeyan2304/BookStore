package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.BookService;
import com.bookstore.MyBookService;
import com.bookstore.entity.Book;
import com.bookstore.entity.MyBookEnity;

@Controller
//@RestController
public class BookController 
{

	@Autowired
	private BookService service;
	
	@Autowired
	private MyBookService mybookservice;
	
	
	@GetMapping({"/","/home"})
	public String home()
	{
		return "home";
		
	}
	
	@GetMapping("/bookregister")
	public String bookRegister()
	{
		return "bookRegister";
	}
	
	
	
	
	
	@GetMapping("/booklist")
	public ModelAndView AllBook()
	{	
	List<Book>list=service.getAllBookS();
	return new ModelAndView("booklist","book",list);
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book book)
	{
		service.save(book);
	return  "redirect:/booklist";
	}

@GetMapping("/mybook")
public String getMyBook(Model model)
{	
List<MyBookEnity>list=mybookservice.getMyAllMyBook();
model.addAttribute("book",list);
	return "mybook";
//return to mybook html page
}





@RequestMapping("/mylist/{id}")
public String getMyBookList(@PathVariable("id")int id)
{
	Book book=service.getBookById(id);
MyBookEnity mybook=new MyBookEnity(book.getId(),book.getName(),book.getAuthor(),book.getPrice());
mybookservice.saveMyBook(mybook);
	return "redirect:/mybook";	
//	return  to mybook html page
}



@RequestMapping("/editBook/{id}")
public String editBook(@PathVariable("id")int id,Model model)
{
	Book book=service.getBookById(id);
	model.addAttribute("book",book);
	return "bookedit";
}
}




			
//	model.addAttribute("user",user);
//		return "Register";	
//	}
//	
  
     
//
//	@PostMapping("/registerUser")
//	public String registerUser(@ModelAttribute ("user") BookEnity user)
//	{
//	
//			System.out.println(user);
//		service.registerUser(user);
//		return "RegisterSucc";
//	}
//
//}