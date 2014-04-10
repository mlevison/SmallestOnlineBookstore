package com.mlevison.smallestbookstore;

import static org.junit.Assert.*;

import com.mlevison.supporting.fakebook.*;

public class SeekerShoppingCartTest {

	// @Test
	public void oneBookToBuy() {
		SeekerShoppingCart seekerShoppingCart = new SeekerShoppingCart();

		seekerShoppingCart.addBook(new Book("Great Expectations", "C. Dickens",
				"123456", "Penguin", 5.0, 101, 2.1));

		assertEquals(1, seekerShoppingCart.numberOfBooks());
		assertEquals(seekerShoppingCart.getBook().getTitle(),
				"Great Expectations");
	}

}
