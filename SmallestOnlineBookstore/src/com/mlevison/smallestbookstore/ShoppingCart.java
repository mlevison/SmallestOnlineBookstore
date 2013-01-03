package com.mlevison.smallestbookstore;

import java.util.*;

public class ShoppingCart {
	private final List<Book> bookList = new ArrayList<Book>();

	public List<Book> getBooks() {
		return bookList;
	}

	public void selectBook(String title) {
		bookList.add(new Book(title));
	}
}
