package org.java.exceptions.books;

public class Book {

//	Properties
	private String title;
	private int pages;
	private String author;
	private String editor;
	
//	Constructor
	public Book(String title, int pages, String author, String editor) throws Exception {
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
	public void setTitle(String title) throws Exception {
		
		if(title == null || title.trim().isEmpty() || title.trim().length() < 3) {
			throw new IllegalArgumentException("Invalid or empty string for Title.");
		}
		this.title = title;
	}
	public void setPages(int pages) throws Exception {
		if(pages <= 0) {
			throw new IllegalArgumentException(" Pages must be >= 0.");
		}
		this.pages = pages;
	}
	public void setAuthor(String author) throws Exception {
		if(author == null || author.trim().isEmpty() || author.trim().length() < 3) {
			throw new IllegalArgumentException("Invalid or empty string for Author.");
		}
		this.author = author;
	}	
	public void setEditor(String editor) throws Exception {
		if(editor == null || editor.trim().isEmpty() || editor.trim().length() < 3) {
			throw new IllegalArgumentException("Invalid or empty string for Editor.");
		}
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
				+ "-----------------------------------------\n";
}
	}
