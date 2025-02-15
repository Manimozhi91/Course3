package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Book;

@Repository
public interface BookCabRepository extends JpaRepository<Book, Integer>{
}
