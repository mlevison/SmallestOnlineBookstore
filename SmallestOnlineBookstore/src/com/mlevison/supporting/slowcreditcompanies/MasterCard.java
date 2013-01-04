package com.mlevison.supporting.slowcreditcompanies;

public class MasterCard extends CreditCardCompany {

	@Override
	protected boolean isValidImpl(String card) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected String processPaymentImpl(String card, Double money) {
		// TODO Auto-generated method stub
		return null;
	}

}
