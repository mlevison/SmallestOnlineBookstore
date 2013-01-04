package com.mlevison.smallestbookstore;

import java.util.*;

public class ShoppingCart {
	private final List<Book> bookList = new ArrayList<Book>();
	private final List<BookChangeStateListener> bookChangeStateListenerList = new ArrayList<BookChangeStateListener>();

	public List<Book> getBooks() {
		return bookList;
	}

	public void selectBook(String title) {
		bookList.add(new Book(title));

		for (BookChangeStateListener bookChangeStateListener : bookChangeStateListenerList) {
			bookChangeStateListener.BookAddedToShoppingCart();
		}
	}

	public void addBookChangeStateListener(
			BookChangeStateListener bookChangeStateListener) {
		bookChangeStateListenerList.add(bookChangeStateListener);
	}

	public void payForContents() {
		for (BookChangeStateListener bookChangeStateListener : bookChangeStateListenerList) {
			bookChangeStateListener.ShoppingCartPaidFor();
		}
	}
}
