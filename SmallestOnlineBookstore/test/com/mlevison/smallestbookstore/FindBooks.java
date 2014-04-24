package com.mlevison.smallestbookstore;

import org.junit.*;
import org.mockito.*;

public class FindBooks {
	@Test
	public void findBooksByTitle() {
		BookDatabase db = Mockito.mock(BookDatabase.class);
		BookController bc = new BookController(db);
		bc.findBooksByTitle("Lord of Rings");

		Mockito.verify(db).findBooksByTitleFromDatabase("Lord of Rings");
	}
}
