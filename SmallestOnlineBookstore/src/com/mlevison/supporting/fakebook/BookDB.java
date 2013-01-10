package com.mlevison.supporting.fakebook;

import java.util.*;

public final class BookDB {
	private final static ArrayList<Book> bookList = new ArrayList<Book>();

	static {
		bookList.add(new Book("Great Expectations", "C. Dickens", "123456",
				"Penguin", 5.0, 101, 2.1));
		bookList.add(new Book("Small Expectations", "Not Dickens", "123457",
				"Small Press", 0.0, 1, 1.1));
		bookList.add(new Book("Snuff", "Terry Pratchett", "123458", "Penguin",
				10.0, 10, 0.5));
		bookList.add(new Book("Drive", "Dan Pink", "123459", "Penguin", 5.0,
				101, 2.1));
		bookList.add(new Book("Men at Arms", "Terry Pratchett", "22222",
				"Small Fantasy Press", 11.0, 5, 1.2));
		bookList.add(new Book("Predictable Irrational", "Dan Ariely", "223232",
				"Harper", 12.99, 3, 0.9));
		bookList.add(new Book("The Honest Truth about Dishonesty",
				"Dan Ariely", "987654", "Harper", 21.99, 1, 2.1));
		bookList.add(new Book("The Upside of Irrationality", "Dan Ariely",
				"123456", "Harper", 14.99, 2, 1.0));
		bookList.add(new Book("Why We Make Mistaks", "J. Hallinan", "123456",
				"Broadway", 12.99, 3, 0.75));

	}
}
