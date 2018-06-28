package com.cnaps.edu.bookshelf.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cnaps.edu.bookshelf.domain.model.Author;
import com.sk.cnaps.domain.repository.AggregateRepository;

public interface AuthorRepository extends PagingAndSortingRepository<Author, Long>, AggregateRepository<Author> {

}
