package library;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	private String name;
	private String memberID;
	private List<Book> borrowedBooks;

	public Member(String memberID, String name) {
		this.memberID = memberID;
		this.name = name;
		this.borrowedBooks = new ArrayList<>();
	}

	public void borrowBook(Book book) {
		if (book.isAvailable()) {
			book.borrowBook();
			borrowedBooks.add(book);
			System.out.println(name + " borrowed " + book.getTitle());
		} else {
			System.out.println(book.getTitle() + " is not available for borrowing.");
		}
	}

}
