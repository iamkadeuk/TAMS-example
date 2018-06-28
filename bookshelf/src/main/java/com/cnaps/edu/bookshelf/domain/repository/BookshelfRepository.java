package com.cnaps.edu.bookshelf.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cnaps.edu.bookshelf.domain.model.Bookshelf;
import com.sk.cnaps.domain.repository.AggregateRepository;

public interface BookshelfRepository extends PagingAndSortingRepository<Bookshelf, Long>, AggregateRepository<Bookshelf> {

}
