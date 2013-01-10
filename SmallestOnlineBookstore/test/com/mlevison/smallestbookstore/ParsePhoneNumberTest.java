package com.mlevison.smallestbookstore;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class ParsePhoneNumberTest {

	@Test
	public void numberWithDashesNoBracesIsValid() {
		PhoneNumberParser phoneNumberParser = new PhoneNumberParser();

		Boolean validNumber = phoneNumberParser.isValid("613-591-3808");

		assertTrue(validNumber);
	}

	@Test
	public void numberWithDashesNoBracesFindsAreaCode() {
		PhoneNumberParser phoneNumberParser = new PhoneNumberParser();

		String areaCode = phoneNumberParser.getAreaCode("613-591-3808");

		assertEquals(areaCode, "613");
	}

	@Test
	public void numberWithBracesAroundAreaCodeDashesInSecondPosition() {
		PhoneNumberParser phoneNumberParser = new PhoneNumberParser();

		Boolean validNumber = phoneNumberParser.isValid("(613)591-3808");

		assertTrue(validNumber);
	}

	@Test
	public void numberWithBracesAroundAreaCodeDashesInSecondPositionFindsAreaCode() {
		PhoneNumberParser phoneNumberParser = new PhoneNumberParser();

		String areaCode = phoneNumberParser.getAreaCode("(613)591-3808");

		assertEquals(areaCode, "613");
	}

	@Test
	public void numberWithNoAreaCode() {
		PhoneNumberParser phoneNumberParser = new PhoneNumberParser();

		Boolean validNumber = phoneNumberParser.isValid("591-3808");

		Assert.assertFalse(validNumber);
	}

}
