public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // By default, the book is available
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Borrow method: sets book as unavailable if possible
    public boolean borrow() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false; // Already borrowed
    }

    // Return method: sets book as available
    public void returnBook() {
        isAvailable = true;
    }

    // Optional: display book details
    public String toString() {
        return "\"" + title + "\" by " + author + " | " +
               (isAvailable ? "Available" : "Checked Out");
    }
}
