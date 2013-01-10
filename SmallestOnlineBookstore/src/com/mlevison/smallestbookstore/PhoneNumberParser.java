package com.mlevison.smallestbookstore;

public class PhoneNumberParser {

	public Boolean isValid(String phoneNumber) {
		String reducedNumber = phoneNumber.replaceAll("[(-]", "");

		if (reducedNumber.length() < 10) {
			return false;
		}
		return true;
	}

	public String getAreaCode(String phoneNumber) {
		String reducedNumber = phoneNumber.replaceAll("[(-]", "");
		return reducedNumber.substring(0, 3);
	}

}
