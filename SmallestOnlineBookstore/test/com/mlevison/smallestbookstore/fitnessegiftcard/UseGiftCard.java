package com.mlevison.smallestbookstore.fitnessegiftcard;

import com.mlevison.smallestbookstore.*;

public class UseGiftCard {
	private final GiftCard giftCard = new GiftCard();

	public void setStartingBalance(int balance) {
		giftCard.setAmount(balance);
	}

	public void setTransaction(int transaction) {
		giftCard.spend(transaction);
	}

	public int finalBalance() {
		return giftCard.currentBalance();
	}
}
