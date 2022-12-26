package com.training.kindle.model;

public class Book {
	private int bookId;
	 private String bookName;
	private double unitPrice;
	private String description;
	private static int counter=1;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String bookName, double unitPrice, String description) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.unitPrice = unitPrice;
		this.description = description;
	}
	public Book(String bookName, double unitPrice, String description) {
		super();
		this.bookId = counter++;
		this.bookName = bookName;
		this.unitPrice = unitPrice;
		this.description = description;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", unitPrice=" + unitPrice + ", description="
				+ description + "]";
	}
	
	
}
