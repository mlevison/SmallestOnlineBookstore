package com.mlevison.supporting.fakebook;

public class Book {
	private final String title;
	private final String author;
	private final String ISBN;
	private final String publisher;
	private final double price;
	private final int edition;
	private final double weight;

	public Book(String inTitle, String inAuthor, String inISBN,
			String inPublisher, double inPrice, int inEdition, double inWeight) {
		title = inTitle;
		author = inAuthor;
		ISBN = inISBN;
		publisher = inPublisher;
		price = inPrice;
		edition = inEdition;
		weight = inWeight;
	}

	public String getTitle() {
		return title;
	}

	public double getWeight() {
		return weight;
	}

	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getPublisher() {
		return publisher;
	}

	public double getPrice() {
		return price;
	}

	public int getEdition() {
		return edition;
	}
}
