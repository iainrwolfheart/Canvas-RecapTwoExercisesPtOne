package library.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import library.model.Book;
import library.model.Location;

public class Main {

	public static void main(String[] args) {
		
		Location javaLoc = new Location(2,3);
		Location projectsLoc = new Location(2,3);
		Location iQLoc = new Location(1,7);
		Location pythonLoc = new Location(2,2);
		
		Book javaBeginnersGuide = new Book("Java: A Beginner's Guide 8th Edition", 
				32.50, javaLoc, "Herbert Shildt", "Dave Biggins");
		
		javaBeginnersGuide.addAuthor("Tom Ramsden");
		javaBeginnersGuide.addAuthor("Bob Hoskins"); //One too many
		
		//Note the input of doubles vs output
		Book iQ84 = new Book("1Q84: Books One and Two", 11.99, iQLoc, "Haruki Murakami");
		Book javaProjects = new Book("Java Projects - Second Edition", 35, projectsLoc, 
				"Peter Verhas");
		Book python = new Book("Python For Kids", 27.5, pythonLoc, "Jason R. Briggs");
		
//		System.out.println(javaBeginnersGuide.toString());
//		System.out.println(iQ84.toString());
//		System.out.println(javaProjects.toString());
//		System.out.println(python.toString());
		
		List<Book> booksList = new ArrayList<>();
		booksList.add(javaBeginnersGuide);
		booksList.add(javaProjects);
		booksList.add(python);
		booksList.add(iQ84);
		
//		for (Book book : booksList) {
//			System.out.println(book.toString());
//		}
		
		Location autoLoc = new Location(4, 7);
		Book autobiography = new Book("Snake Eater", 17.99, autoLoc, "David Hayter");
		
		booksList.add(autobiography);
//		System.out.println(autobiography.toString());
		
		HashMap<String, Book> booksMap = new HashMap<>();
		for (Book book : booksList) {
			booksMap.put(book.getTitle(), book);
		}

//		This method won't work as HashMap requires a key reference. 
//		HashMaps are not ordered by index but by key.
//		for (Book book : index)
//		{
//		    System.out.println(book.toString());
//		}
		
		Location newLoc = new Location(7,7);
		Book newBook = new Book("Midgar", 
				9.95, newLoc, "This Guy", "That Guy");
		booksMap.put(newBook.getTitle(), newBook);
		//Duplicate title/key attempt - replaces existing Book w/matching key
		Location new2Loc = new Location(9,9);
		Book new2Book = new Book("Midgar", 
				9.95, new2Loc, "This Guy", "That Guy");
		booksMap.put(new2Book.getTitle(), new2Book);

		Iterator hmi = booksMap.entrySet().iterator();
		while (hmi.hasNext()) {
			HashMap.Entry thisBook = (HashMap.Entry) hmi.next();
			System.out.println(thisBook.getValue().toString());	
		}
		
		HashMap<Book, String> reverseBook = new HashMap<>();
		for (Book book : booksList) {
			reverseBook.put(book, book.getTitle());
			System.out.println(book.toString());
		}

		System.out.println("The statement that the booksMap contains a book "
				+ "called 'Midgar' is " + booksMap.containsKey("Midgar") + ".");
	}

}
