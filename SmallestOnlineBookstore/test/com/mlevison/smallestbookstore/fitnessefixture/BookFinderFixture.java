package com.mlevison.smallestbookstore.fitnessefixture;

import java.util.*;

import com.mlevison.smallestbookstore.*;
import com.mlevison.supporting.fakebook.*;

public class BookFinderFixture {
	private String authorName;

	public void setAuthorName(String name) {
		authorName = name;
	}

	public String title() {
		List<Book> bookList = BookDB.getBookList();
		Book book = new BookFinder(bookList).findByAuthor(authorName);
		return book.getTitle();
	}
}
