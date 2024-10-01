package org.example.waa1.controller;

import org.example.waa1.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("/books")
    public List<Book> getBooks() {
        return Arrays.asList(new Book(1, "Effective Java", "9780134685991"),
                new Book(2, "Clean Code", "9780132350884"),
                new Book(3, "Spring in Action", "9781617294945")
        );

    }

}
