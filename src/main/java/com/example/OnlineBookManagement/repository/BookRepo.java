package com.example.OnlineBookManagement.repository;

import com.example.OnlineBookManagement.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,Long> {
}
