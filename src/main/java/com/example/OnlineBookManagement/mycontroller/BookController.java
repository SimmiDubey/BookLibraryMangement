package com.example.OnlineBookManagement.mycontroller;

import com.example.OnlineBookManagement.model.Book;
import com.example.OnlineBookManagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBook();
    }


    @PostMapping
    public Book saveBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }


    @PutMapping("/{id}")
    public String updateBook(@PathVariable Long id, @RequestBody Book updateBook) {
        Book result = bookService.updatedBook(id, updateBook);
        return (result != null) ? "Book updated successfully!" : "Book not found";
    }
}
