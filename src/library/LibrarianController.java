package library;

public class LibrarianController {

    // GRASP Principle: Controller
    // Handles user requests like borrowing and returning books.
    // Delegates tasks to the appropriate objects.

    // DONE: implement functionality of Member class
    private Library library;

    public LibrarianController(Library library) {
        this.library = library;
    }

    public void borrowBook(String bookName, String memberName) {
        Book book = library.getBook(bookName);
        Member member = library.getMember(memberName);

        if (member == null || book == null) {
            System.out.println("Error: Book or member not found");
        }
        else {
            if (book.borrow()){
                member.borrowBook(book);
            }
            else {
                System.out.println("Error: Book is not available");
            }
        }
    }

    public void returnBook(String bookName, String memberName) {
        Member member = library.getMember(memberName);
        Book book = library.getBook(bookName);
        if (member == null) {
            System.out.println("Error: Member not found");
        }
        else {
            if(member.returnBook(book)){
                book.returnBook();
            }
            else {
                System.out.println("Error: Member did not have book");
            }
        }
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : library.getAvailableBooks()) {
            System.out.println(book);
        }
    }
    public void displayBooks() {
        System.out.println("Book Catalog:");
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }
    }
    public void displayMembers() {
        System.out.println("Members:");
        for (Member member : library.getMembers()) {
            System.out.println(member);
        }
    }

}

