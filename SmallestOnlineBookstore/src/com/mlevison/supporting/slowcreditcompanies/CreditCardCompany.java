package com.mlevison.supporting.slowcreditcompanies;

public abstract class CreditCardCompany {
	public final boolean isValid(String card) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// really bad code to ingore exception
		}
		return isValidImpl(card);
	}

	protected abstract boolean isValidImpl(String card);

	public final String processPayment(String card, Double money) {
		return processPaymentImpl(card, money);
	}

	protected abstract String processPaymentImpl(String card, Double money);
}
