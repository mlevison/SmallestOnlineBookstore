package com.mlevison.smallestbookstore.fitnessegiftcard;

public class BuyGiftCardFixture {
	int amount;
	public void setAmount(int newAmount) {
		if (newAmount < 0) {
			throw new IllegalArgumentException();
		}
		amount = newAmount;
	}
	public int currentBalance() {
		return amount;
	}
}
