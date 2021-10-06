package com.company.springrestpagination.repository;

import com.company.springrestpagination.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer>
{
}
