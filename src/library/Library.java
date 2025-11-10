package library;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	
	// Attributes:
	// private catalog (list of Book) 
	// private members (list of Members)

    private HashMap<String, Book> catalog;
    private HashMap<String, Member> members;

	// DONE: implement functionality of Member class
    public Library() {
        catalog = new HashMap<>();
        members = new HashMap<>();
    }

    public void addBook(String title, String author) {
        catalog.put(title, new Book(title, author));
    }
    public void removeBook(String title) {
        catalog.remove(title);
    }

    public void addMember(String name){
        members.put(name, new Member(name));
    }
    public void removeMember(String name){
        members.remove(name);
    }

    public void showAvailableBooks() {
        for (Book book : catalog.values()) {
            if (book.isAvailable()) {
                System.out.println(book.toString());
            }
        }
    }
    public void showUnavailableBooks() {
        for (Book book : catalog.values()) {
            if (!book.isAvailable()) {
                System.out.println(book.toString());
            }
        }
    }
}
