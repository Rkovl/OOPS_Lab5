package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	private String name;
	private String memberID;
	private List<Book> borrowedBooks;

	public Member(String name) {
		this.memberID = name + String.format("%05d", new Random().nextInt(100000));;
		this.name = name;
		this.borrowedBooks = new ArrayList<>();
	}

	public void borrowBook(Book book) {
		borrowedBooks.add(book);
	}

	public boolean returnBook(Book book) {
		borrowedBooks.remove(book);
	}

}
