package com.mlevison.smallestbookstore;

import com.mlevison.supporting.fakebook.*;

public class taxCalculator {

	public static double calc(Book book, String prov) {

		if ("BC" == prov) {
			return book.getPrice() * 1.5;
		}

		return book.getPrice() * 0.5;
	}

}
