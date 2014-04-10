package com.mlevison.smallestbookstore;

import java.util.*;

import com.mlevison.supporting.fakebook.*;
import com.mlevison.supporting.slowcreditcompanies.*;

// Comment
public class ShoppingCart {
	private final List<Book> bookList = new ArrayList<Book>();
	private final List<BookChangeStateListener> bookChangeStateListenerList = new ArrayList<BookChangeStateListener>();

	public List<Book> getBooks() {
		return bookList;
	}

	public void selectBook(String title) {
		bookList.add(new Book(title, "", "", "", 0, 0, 0));

		for (BookChangeStateListener bookChangeStateListener : bookChangeStateListenerList) {
			bookChangeStateListener.BookAddedToShoppingCart();
		}
	}

	public void addBookChangeStateListener(
			BookChangeStateListener bookChangeStateListener) {
		bookChangeStateListenerList.add(bookChangeStateListener);
	}

	public void payForContents(CreditCardCompany creditCardCompany) {
		creditCardCompany.processPayment("Some Card", 2.0);
		for (BookChangeStateListener bookChangeStateListener : bookChangeStateListenerList) {
			bookChangeStateListener.ShoppingCartPaidFor();
		}
	}
}
