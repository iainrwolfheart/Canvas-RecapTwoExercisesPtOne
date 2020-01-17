package library.model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Book {
	
	private String title;
	private double price;
	private List<String> authors;
	private Location location;
	
	
	public Book (String title, double price, String... writers) {
		this.title = title;
		this.price = price;
		List<String> writersList = new ArrayList<String>();
		//I chose to use List instead of String[] in order to make the addAuthor method
		//work more easily i.e. no need to create a new array, copy contents and assign
		//back to this.authors
		
		for (String writer : writers) {
			writersList.add(writer);
		}
		this.authors = writersList;
	}
	public Book (String title, double price, Location location, String... writers) {
		this(title, price, writers);
		this.setLocation(location);
	}

	@Override
	public String toString() {
		DecimalFormat decimal = new DecimalFormat("#.00");
		return "Book: '" + title + "'\nPrice: £" + decimal.format(price) + "\nAuthors: " 
				+ authors.toString().replace("[","").replace("]","") + "\n" +
				location.toString() + "\n";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public void addAuthor(String author) {
		if (this.authors.size() < 3) {
			this.authors.add(author);
		}
		else System.out.println(author + " cannot be added to the book's credits.\n");
	}
	
	public Location getLocation() {
		return location;	
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
}
