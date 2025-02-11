package com.example.OnlineBookManagement.service;

import com.example.OnlineBookManagement.model.Book;
import com.example.OnlineBookManagement.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;


    public List<Book>getAllBook(){
        return bookRepo.findAll();
    }



    public Book addBook(Book book){
        return bookRepo.save(book);
    }


    public Book updatedBook(Long id,Book updateBook) {
        Book existingBook = bookRepo.findById(id).orElse(null);
        if(existingBook!=null){
            existingBook.setTitle(updateBook.getTitle());
            existingBook.setAuthor(updateBook.getAuthor());
            existingBook.setGenre(updateBook.getGenre());
            existingBook.setYear(updateBook.getYear());
            existingBook.setQuantity(updateBook.getQuantity());
        }


        Book save = bookRepo.save(existingBook);
        return save;

    }


     public void deleteBook(long id)
     {
          bookRepo.deleteById(id);
     }


}
