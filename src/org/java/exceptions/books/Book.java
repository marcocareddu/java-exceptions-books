package org.java.exceptions.books;

public class Book {

//	Properties
	private String title;
	private int pages;
	private String author;
	private String editor;
	
//	Constructor
	public Book(String title, int pages, String author, String editor) {
		setTitle(title);
		setPages(pages);
		setAuthor(author);
		setEditor(editor);
	}
	
//	Getters
	public String getTitle() {
		return title;
	}
	public int getPages() {
		return pages;
	}
	public String getAuthor() {
		return author;
	}
	public String getEditor() {
		return editor;
	}
	
//	Setters
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public void setAuthor(String author) {
		this.author = author;
	}	
	public void setEditor(String editor) {
		this.editor = editor;
	}
	
	//	Full Print
	@Override
	public String toString() {
		return "\n-----------------------------------------\n"
				+ "Titolo: " + getTitle() + "\n"
				+ "Pagine: " + getPages() + "\n"
				+ "Autore: " + getAuthor() + "\n"
				+ "Editore: " + getEditor() + "\n"
				+ "\n-----------------------------------------\n";
}
	}
