package library;
//Simplified verion of Library Management System

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class LibraryApp {
    public static void main(String[] args) {

        Library library = new Library();
        LibrarianController controller = new LibrarianController(library);

        System.out.println(" *** Library management system demo *** ");

        // Adding some books to the catalog
        System.out.println("\n *** Adding \"Dune\" to the library:");
        library.addBook("Dune", "Frank");

        System.out.println("\n *** Adding \"1984\" to the library:");
        library.addBook("1984", "Gorge Orwell");

        System.out.println("\n *** Adding \"Moby Dick\" to the library:");
        library.addBook("Moby Dick");

        // Show available books
        System.out.println("\n *** Show all books:");
        controller.displayBooks();

        // Adding members
        System.out.println("\n *** Adding \"Alice\" to the library members");
        library.addMember("Alice");

        System.out.println("\n *** Adding \"Bob\" to the library members");
        library.addMember("Bob");

        // Show members
        System.out.println("\n *** Show all members");
        controller.displayMembers();

        // Borrow a book
        System.out.println("\n *** Alice borrows Dune:");
        controller.borrowBook("Dune", "Alice");

        // Show available books after borrowing
        System.out.println("\n *** Show all books:");
        controller.displayAvailableBooks();

        System.out.println("\n *** Bob borrows 1984:");
        controller.borrowBook("1984", "Bob");

        // Show available books after borrowing
        System.out.println("\n *** Show all books:");
        controller.displayAvailableBooks();

        System.out.println("\nBob borrows Dune:");
        controller.borrowBook("Dune", "Bob");

        // Show available books after borrowing
        System.out.println("\n *** Show all books:");
        controller.displayAvailableBooks();

        // Return a book
        System.out.println("\n *** Alice returns Dune:");
        controller.returnBook("Dune", "Alice");

        // Show available books after returning
        System.out.println("\n *** Show all books:");
        controller.displayAvailableBooks();

        System.out.println("\n *** Bob borrows Dune:") ;
        controller.borrowBook("Dune", "Bob");

        // Show available books after borrowing
        System.out.println("\n *** Show all books:");
        controller.displayAvailableBooks();

    }
}