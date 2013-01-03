package com.mlevison.smallestbookstore;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

public class SelectBookTest {

	private static final String GREAT_BOOK = "Great Book";

	@Test
	public void SelectOneBookForPurchase() {
		ShoppingCart shoppingCart = new ShoppingCart();

		shoppingCart.selectBook(GREAT_BOOK);
		List<Book> bookList = shoppingCart.getBooks();

		assertNotNull(bookList);
		assertEquals(1, bookList.size());
		assertEquals(GREAT_BOOK, bookList.get(0).getTitle());
	}

}
