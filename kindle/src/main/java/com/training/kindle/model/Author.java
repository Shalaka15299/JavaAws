package com.training.kindle.model;

public class Author {

	private int authorId;
	private String authorName;
	private String desription;
	private Book book;
	private static int counter = 100;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int authorId, String authorName, String desription, Book book) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.desription = desription;
		this.book = book;
	}
	public Author(String authorName, String desription, Book book) {
		super();
		this.authorId = counter++;
		this.authorName = authorName;
		this.desription = desription;
		this.book = book;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getDesription() {
		return desription;
	}
	public void setDesription(String desription) {
		this.desription = desription;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", desription=" + desription + ", book="
				+ book + "]";
	}
	
	
	
}
