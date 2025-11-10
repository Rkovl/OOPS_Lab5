package library;

import java.util.ArrayList;

public class Library {

    //  GRASP Principles: Creator, Controller
    //	Manage the catalog of books and members.
    //	Track which books are borrowed and available


    // Attributes:
    // private catalog (list of Book)
    // private members (list of Members)

    // DONE: implement functionality of Member class
    private ArrayList<Book> catalog = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public Library() {
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void removeBook(Book book) {
        catalog.remove(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public ArrayList<Book> availableBooks() {
        ArrayList<Book> availableBooks = new ArrayList<>();
        for (Book book : catalog)
            if (book.isAvailable())
                availableBooks.add(book);

        return availableBooks;
    }

    public ArrayList<Book> borrowedBooks() {

        ArrayList<Book> borrowedBooks = new ArrayList<>();
        for (Book book : catalog)
            if (!book.isAvailable())
                borrowedBooks.add(book);

        return borrowedBooks;

    }
}
