package constructor_practice;

public class BookMain {


    public static void main(String[] args) {

        Book b1 = new Book(101, "Java Programming",
                "James Gosling", 2);

        b1.displayBookDetails();

        b1.issueBook();

        b1.displayBookDetails();

        b1.returnBook();

        b1.displayBookDetails();
    }
}


