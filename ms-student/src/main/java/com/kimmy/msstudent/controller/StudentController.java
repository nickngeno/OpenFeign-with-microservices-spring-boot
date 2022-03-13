package com.kimmy.msstudent.controller;

import com.kimmy.msstudent.model.Book;
import com.kimmy.msstudent.model.Post;
import com.kimmy.msstudent.repository.BookRestConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    BookRestConsumer bookRestConsumer;

    @GetMapping("/api/book/data")
    public String getBookData(){
        return  bookRestConsumer.getBookData();
    }
    @GetMapping("api/books/all")
    public List<Book> getAllBooks(){
        return  bookRestConsumer.getAllBooks();
    }

    @GetMapping("api/books/{id}")
    public Book getBook(@PathVariable int id){
        return  bookRestConsumer.getBook(id);
    }
    @GetMapping("api/posts")
    public List<Post> getPosts(){
        return  bookRestConsumer.getAllPosts();
    }
}
