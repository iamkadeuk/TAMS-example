package com.cnaps.edu.bookshelf.domain.model;

import java.util.List;

import com.sk.cnaps.domain.model.ValueObject;

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
public class Chapter extends ValueObject {
	private String no;
	private String title;
	private List<String> sections;
}
 