package com.bookstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mybook")
public class MyBookEnity {
@Id
		
	private int id;
	private String name;
	private String author;
	private double price;
	
	
	public MyBookEnity(int id, String name, String author, double price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	
	
	}


	public MyBookEnity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getAuthor() {
		return author;
	}


	public double getPrice() {
		return price;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "MyBookEnity [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}


	
	
}


