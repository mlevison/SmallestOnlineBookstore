package com.mlevison.smallestbookstore;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

public class SelectBookTest {

	@Test
	public void SelectOneBookForPurchase() {
		ShoppingCart shoppingCart = new ShoppingCart();

		shoppingCart.selectBook("Great Book");
		List<Book> bookList = shoppingCart.getBooks();

		assertNotNull(bookList);
		assertEquals(1, bookList.size());
		assertEquals("Great Book", bookList.get(0).getTitle());
	}

}
