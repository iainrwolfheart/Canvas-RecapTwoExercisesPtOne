package library.client;

import java.util.ArrayList;
import java.util.List;

import library.model.Book;

public class Main {

	public static void main(String[] args) {
		
		Book javaBeginnersGuide = new Book("Java: A Beginner's Guide 8th Edition", 
				32.50, "Herbert Shildt", "Dave Biggins");
		
		javaBeginnersGuide.addAuthor("Tom Ramsden");
		javaBeginnersGuide.addAuthor("Bob Hoskins"); //One too many
		
		//Note the input of doubles vs output
		Book iQ84 = new Book("1Q84: Books One and Two", 11.99, "Haruki Murakami");
		Book javaProjects = new Book("Java Projects - Second Edition", 35, "Peter Verhas");
		Book python = new Book("Python For Kids", 27.5, "Jason R. Briggs");
		
//		System.out.println(javaBeginnersGuide.toString());
//		System.out.println(iQ84.toString());
//		System.out.println(javaProjects.toString());
//		System.out.println(python.toString());
		
		List<Book> booksList = new ArrayList<>();
		booksList.add(javaBeginnersGuide);
		booksList.add(javaProjects);
		booksList.add(python);
		booksList.add(iQ84);
		
		for (Book book : booksList) {
			System.out.println(book.toString());
		}
	}

}
