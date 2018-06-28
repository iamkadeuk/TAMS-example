package com.cnaps.edu.bookshelf.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cnaps.edu.bookshelf.domain.model.Book;
import com.sk.cnaps.domain.repository.AggregateRepository;

public interface BookRepository extends PagingAndSortingRepository<Book, Long>, AggregateRepository<Book> {

}
