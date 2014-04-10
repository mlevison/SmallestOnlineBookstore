package com.mlevison.smallestbookstore;

import static org.junit.Assert.*;

import org.junit.*;

import com.mlevison.supporting.fakebook.*;

public class CalculateBookTax {

	@Test
	public void bookTaxOnCheapBookInBC() {
		Book book = new Book("Great Expectations", "Dickens", "",
				"Lost in the Sands of time", 2.00, 100, 2.1);

		double tax = taxCalculator.calc(book, "BC");

		assertEquals(3.00, tax, Double.MIN_VALUE);
	}

	@Test
	public void bookTaxOnExpensiveBookInBC() {
		Book book = new Book("lessor Expectations", "Not Dickes", "", "",
				10.00, 100, 2.1);

		double tax = taxCalculator.calc(book, "BC");

		assertEquals(15.00, tax, Double.MIN_VALUE);
	}

	@Test
	public void bookTaxOnExpensiveBookInOnt() {
		Book book = new Book("lessor Expectations", "Not Dickes", "", "",
				10.00, 100, 2.1);

		double tax = taxCalculator.calc(book, "ON");

		assertEquals(5.00, tax, Double.MIN_VALUE);
	}

}
