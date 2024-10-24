package com.luv2code.spring_boot_library.controller;

import com.luv2code.spring_boot_library.entity.Book;
import com.luv2code.spring_boot_library.service.IBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {

    private final IBookService bookService;

    @PutMapping("/secure/checkout")
    public ResponseEntity<Book> checkoutBook(@RequestParam Long bookId) throws Exception {
        String userEmail = "testuser@email.com";
        return ResponseEntity.ok(bookService.checkoutBook(userEmail, bookId));
    }

    @GetMapping("/secure/isCheckedOut/byUser")
    public ResponseEntity<Boolean> isCheckedOutByUser(@RequestParam Long bookId) throws Exception {
        String userEmail = "testuser@email.com";
        return ResponseEntity.ok(bookService.isBookCheckedOutByUser(userEmail, bookId));
    }

}
