package com.cnaps.edu.bookshelf.domain.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;

import com.sk.cnaps.domain.model.AbstractEntity;
import com.sk.cnaps.domain.model.AggregateProxy;
import com.sk.cnaps.domain.model.AggregateRoot;
import com.sk.cnaps.domain.util.ListConverter;

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
public class Book extends AbstractEntity implements AggregateRoot {	
	private String title;
	private BookType bookType;
	
	@Convert(converter=ListConverter.class)
	@Column(columnDefinition="TEXT")
	private List<Chapter> chapters;
	
	@Convert(converter=AggregateProxy.class)
	@Column(columnDefinition="TEXT")
	private AggregateProxy<Author> authorAggregate;
}
