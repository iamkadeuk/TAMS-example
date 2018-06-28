package com.cnaps.edu.bookshelf.domain.model;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;

import com.sk.cnaps.domain.model.AbstractEntity;
import com.sk.cnaps.domain.model.AggregateProxy;
import com.sk.cnaps.domain.model.AggregateRoot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Bookshelf extends AbstractEntity implements AggregateRoot {	
	private String owner;
	private String name;
	
	@Convert(converter=AggregateProxy.class)
	@Column(columnDefinition="TEXT")
	private AggregateProxy<Book> booksAggregate;
}
