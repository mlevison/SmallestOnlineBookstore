package com.mlevison.smallestbookstore.fitnessegiftcard;

import com.mlevison.smallestbookstore.*;

public class BuyGiftCardFixture {
	GiftCard giftCard = new GiftCard();
	public void setAmount(int newAmount) {
		giftCard.setAmount(newAmount);
	}
	public int currentBalance() {
		return giftCard.currentBalance();
	}
}
