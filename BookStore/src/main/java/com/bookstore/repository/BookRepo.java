package com.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.bookstore.entity.Book;

@EnableJpaRepositories
public interface BookRepo extends JpaRepository<Book, Integer>
{
////@Query("select u from userdetails u where u.email=?1")
//	UserDetails findByEmail(String email);

}
