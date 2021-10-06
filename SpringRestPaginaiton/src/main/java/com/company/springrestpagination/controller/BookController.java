package com.company.springrestpagination.controller;

import com.company.springrestpagination.entity.Book;
import com.company.springrestpagination.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookController
{
    private final BookRepository bookRepository;

    @GetMapping("/book")
    public Page<Book> getBooks (Pageable pageable)
    {
        return bookRepository.findAll(pageable);
    }

    @GetMapping("/bookSlice")
    public Slice<Book> getSliceBooks (Pageable pageable)
    {
        return bookRepository.findAll(pageable);
    }
}
