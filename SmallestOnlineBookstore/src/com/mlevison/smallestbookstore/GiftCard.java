package com.mlevison.smallestbookstore;

public class GiftCard {
	public int amount;
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