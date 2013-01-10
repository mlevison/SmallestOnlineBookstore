package com.mlevison.smallestbookstore;

import static org.mockito.Mockito.*;

import org.junit.*;

import com.mlevison.supporting.slowcreditcompanies.*;

public class BuyBookTest {

	@Test
	public void test() {
		CreditCardCompany mockedCreditCardCompany = mock(CreditCardCompany.class);

		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.selectBook("Not So Great Expectations");
		shoppingCart.payForContents();

		// verify(mockedCreditCardCompany).processPayment(anyString(),
		// anyDouble());
	}

}
