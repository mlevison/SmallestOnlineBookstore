package com.mlevison.smallestbookstore;

import static org.junit.Assert.*;

import org.junit.*;

public class EmailSentWhenBookMovesThroughSystem {

	@Test
	public void EmailSentWhenBookSelected() {
		LocalBookChangeListener bookChangeStateListener = new LocalBookChangeListener();
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.addBookChangeStateListener(bookChangeStateListener);

		assert (0 == bookChangeStateListener.bookAddedCount);
		shoppingCart.selectBook("Pickwick Papers");
		assertEquals(1, bookChangeStateListener.bookAddedCount);
	}

	@Test
	public void EmailSentWhen2ndBookSelected() {
		LocalBookChangeListener bookChangeStateListener = new LocalBookChangeListener();
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.addBookChangeStateListener(bookChangeStateListener);

		assert (0 == bookChangeStateListener.bookAddedCount);
		shoppingCart.selectBook("Pickwick Papers");
		shoppingCart.selectBook("Lessor Expectations");
		assertEquals(2, bookChangeStateListener.bookAddedCount);
	}

	@Test
	public void EmailSentWhenShoppingCartPaidFor() {
		LocalBookChangeListener bookChangeStateListener = new LocalBookChangeListener();
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.addBookChangeStateListener(bookChangeStateListener);
		shoppingCart.selectBook("Pickwick Papers");

		assert (0 == bookChangeStateListener.shoppingCartPaidFor);
		shoppingCart.payForContents();

		assertEquals(1, bookChangeStateListener.shoppingCartPaidFor);
	}

	public class LocalBookChangeListener implements BookChangeStateListener {
		public int bookAddedCount;
		public int shoppingCartPaidFor;

		@Override
		public void BookAddedToShoppingCart() {
			bookAddedCount++;
		}

		@Override
		public void ShoppingCartPaidFor() {
			shoppingCartPaidFor++;
		}

	}
}
