package com.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.entity.MyBookEnity;

public interface MyBookRepo extends JpaRepository<MyBookEnity, Integer>
{

}
