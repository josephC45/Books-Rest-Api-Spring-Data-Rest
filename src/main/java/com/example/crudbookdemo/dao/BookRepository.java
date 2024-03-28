package com.example.crudbookdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.crudbookdemo.entity.Book;

// Provide Entity type and primary key
//@RepositoryRestResource(path="catalog")
public interface BookRepository extends JpaRepository<Book,Integer> {

}
