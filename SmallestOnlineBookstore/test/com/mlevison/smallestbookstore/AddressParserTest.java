package com.mlevison.smallestbookstore;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.*;

public class AddressParserTest {
	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Test
	public void parseUSHomeAddressTwoLinesPostalCode() {
		AddressParser addressParser = new AddressParser(
				"19 Quaker Ridge Rd.\nBethel CT 06801");

		assertEquals("06801", addressParser.getPostalCode());
		assertThat(addressParser.getPostalCode().toString(), is("06801"));
	}

	@Test
	public void parseUSHomeAddressTwoLinesState() {
		AddressParser addressParser = new AddressParser(
				"19 Quaker Ridge Rd.\nBethel CT 06801");

		assertEquals("CT", addressParser.getState());
	}

	@Test
	public void parseUSHomeAddressTwoLinesNoPostalCode() {
		expectedException.expect(IllegalArgumentException.class);
		new AddressParser("19 Quaker Ridge Rd.\nBethel CT");
	}

	@Test
	public void parseCanadianHomeAddressTwoLinesPostalCode() {
		AddressParser addressParser = new AddressParser(
				"540 CONCESSION 2\nCayuga, On, N0A 1E0");

		assertEquals("N0A 1E0", addressParser.getPostalCode());
	}

	@Test
	public void parseCanadianHomeAddressTwoLinesPostalCodeNoSpace() {
		AddressParser addressParser = new AddressParser(
				"540 CONCESSION 2\nCayuga, On, N0A1E0");

		assertEquals("N0A1E0", addressParser.getPostalCode());
	}
}
