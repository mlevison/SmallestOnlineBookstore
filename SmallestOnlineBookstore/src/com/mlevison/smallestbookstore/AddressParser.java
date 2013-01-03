package com.mlevison.smallestbookstore;

public class AddressParser {
	private final String postalCode;
	private final String state;

	public AddressParser(String address) {
		int length = address.length();

		postalCode = parsePostalCode(address, length);

		if (null == postalCode) {
			throw new IllegalArgumentException("Missing Postal Code");
		}

		int stateStart = length - (postalCode.length() + 3);
		state = address.substring(stateStart, stateStart + 2);
	}

	private String parsePostalCode(String address, int length) {
		String usPostalCode = address.substring(length - 5);
		if (Character.isDigit(usPostalCode.charAt(0))
				&& Character.isDigit(usPostalCode.charAt(1))) {
			return usPostalCode;
		}
		String canadianPostalCode = address.substring(length - 7);
		if (Character.isLetter(canadianPostalCode.charAt(0))
				&& Character.isDigit(canadianPostalCode.charAt(1))) {
			return canadianPostalCode;
		}

		String canadianPostalCodeNoSpaces = address.substring(length - 6);
		if (Character.isLetter(canadianPostalCodeNoSpaces.charAt(0))
				&& Character.isDigit(canadianPostalCodeNoSpaces.charAt(1))) {
			return canadianPostalCodeNoSpaces;
		}

		return null;
	}

	public Object getStreet() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPostalCode() {
		return postalCode;
	}

	public String getState() {
		return state;
	}

}