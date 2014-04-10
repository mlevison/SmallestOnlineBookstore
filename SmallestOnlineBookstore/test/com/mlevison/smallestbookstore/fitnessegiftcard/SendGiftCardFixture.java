package com.mlevison.smallestbookstore.fitnessegiftcard;

public class SendGiftCardFixture {
	private BuyGiftCardFixture buyGiftCardFixture;

	public boolean giftCardHere() {
		if (buyGiftCardFixture == null) {
			return false;
		}
		return true;
	}

	public void buyGiftCard(int value) {
		buyGiftCardFixture = new BuyGiftCardFixture();
		buyGiftCardFixture.setAmount(value);
	}

	public int giftCardBalance() {
		if (buyGiftCardFixture == null) {
			return 0;
		}
		return buyGiftCardFixture.currentBalance();
	}

	public void sendGiftCardTo(String name) {
		buyGiftCardFixture = null;
	}
}
