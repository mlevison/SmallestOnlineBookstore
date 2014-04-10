package com.mlevison.smallestbookstore;

import java.util.*;

import com.mlevison.supporting.fakebook.*;

public class BookFinder {
	private final List<Book> bookList;

	public BookFinder(List<Book> inBookList) {
		bookList = inBookList;
	}

	public Book findByAuthor(String name) {
		for (Book book : bookList) {
			if (book.getAuthor().contains(name)) {
				return book;
			}
		}
		return null;
	}
}
