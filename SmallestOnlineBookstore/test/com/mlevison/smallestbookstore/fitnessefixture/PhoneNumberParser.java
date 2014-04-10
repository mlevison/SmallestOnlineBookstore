package com.mlevison.smallestbookstore.fitnessefixture;

public class PhoneNumberParser {
	private String inputNumber;

	public void setInputNumber(String number) {
		inputNumber = number.replaceAll("[()]", "");
	}

	public String areaCode() {
		return inputNumber.substring(0, 3);
	}

	public String exchange() {
		return inputNumber.substring(3, 6);
	}

	public String number() {
		return inputNumber.substring(6, 10);
	}
}
