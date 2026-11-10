package constructor_practice;

public class Book {


    private int bookId;
    private String bookName;
    private String authorName;
    private int availableCopies;

    // Parameterized Constructor
    public Book(int bookId, String bookName,
                String authorName, int availableCopies) {

        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.availableCopies = availableCopies;
    }

    // Issue Book
    public void issueBook() {

        if (availableCopies > 0) {

            availableCopies--;
            System.out.println("Book issued successfully.");

        } else {

            System.out.println("Sorry! No copies available.");
        }
    }

    // Return Book
    public void returnBook() {

        availableCopies++;
        System.out.println("Book returned successfully.");
    }

    // Display Book Details
    public void displayBookDetails() {

        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println("Available Copies: " + availableCopies);
    }
}


