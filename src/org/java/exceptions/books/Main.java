package org.java.exceptions.books;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

//		Question
	    System.out.println("Quanti libri vuoi inserire?");
		
//		Vars
		String booksQuantityString = in.nextLine();
		int booksQuantity = Integer.valueOf(booksQuantityString);
		
//		Arrays
		Book[] books = new Book[booksQuantity];
		
		for(int i = 0; i < booksQuantity; i++) {

		    System.out.println("Inserisci il titolo. \n");
			String title = in.nextLine();
			
		    System.out.println("Inserisci il numero delle pagine. \n");
			String pagesString = in.nextLine();
			int pages = Integer.valueOf(pagesString);
			
		    System.out.println("Inserisci l'autore. \n");
			String author = in.nextLine();
			
		    System.out.println("Inserisci l'editore. \n");
			String editor = in.nextLine();
			
//			New Instances
			Book newBook = new Book(title, pages, author, editor);
			
			books[i] = newBook;
		}
		
//        Print array
        System.out.println(Arrays.asList(books));
	}
}
