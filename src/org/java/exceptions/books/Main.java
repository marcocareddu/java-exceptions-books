package org.java.exceptions.books;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

//		Question
	    System.out.println("Quanti libri vuoi inserire?");
		
//	    Conts
	    final String FILE_PATH = "C:\\Users\\marco\\Desktop\\Books.txt";
//		Vars
		String booksQuantityString = in.nextLine();
		int booksQuantity = Integer.valueOf(booksQuantityString);
		int booksIndex = 0;
		
//		Arrays
		Book[] books = new Book[booksQuantity];
		

			
//			Exceptions
			try {
				while(booksIndex < booksQuantity) {

				    System.out.println("Inserisci il titolo del libro " + (booksIndex +1) + "\n");
					String title = in.nextLine();

				    System.out.println("Inserisci il numero di pagine del libro " + (booksIndex +1) + "\n");
					int pages = in.nextInt();
					in.nextLine();
					
				    System.out.println("Inserisci l'autore del libro " + (booksIndex +1) + "\n");
					String author = in.nextLine();
					
				    System.out.println("Inserisci l'editore del libro " + (booksIndex +1) + "\n");
					String editor = in.nextLine();
					
					Book newBook = new Book(title, pages, author, editor);
					books[booksIndex] = newBook;
					
					booksIndex++;}
				
			} catch (Exception e) {
				System.err.println("ERROR: " + e);
			} finally {
				if (in != null)
					in.close();
			}
		
			try {
				FileWriter myWriter = new FileWriter(FILE_PATH);
				for(int i = 0; i < books.length; i++) {
					myWriter.write(books[i].toString());
				}
				myWriter.close();
			} catch(IOException e){
				e.printStackTrace();
			}
			
			Scanner reader = new Scanner(FILE_PATH);
			
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println("OutPut dal file: \n" + data);
			}
			reader.close();

//        Print array
        System.out.println(Arrays.asList(books));
	}
}
