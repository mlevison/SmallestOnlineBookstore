package com.mlevison.smallestbookstore.fitnessegiftcard;

import com.mlevison.smallestbookstore.*;

public class SendGiftCardFixture {
	private GiftCard giftCard;

	public boolean giftCardHere() {
		if (giftCard == null) {
			return false;
		}
		return true;
	}

	public void buyGiftCard(int value) {
		giftCard = new GiftCard();
		giftCard.setAmount(value);
	}

	public int giftCardBalance() {
		if (giftCard == null) {
			return 0;
		}
		return giftCard.currentBalance();
	}

	public void sendGiftCardTo(String name) {
		giftCard = null;
	}
}
