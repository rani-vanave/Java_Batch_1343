package demo;

public class Library {
	int bookId;
	String bookName;
	String authorName;
	String publisher;
	String category;
	double price;
	int totalPages;
	String language;
	String publicationDate;
	String libraryName;
	String librarianName;
	String location;
	int totalbooks;
	int availableBooks;
	boolean isAvailable;
	
	
public static void Book() {
	System.out.println("popular books");
	
}
public static void issueBook() {
	System.out.println("book issued");
}
public static void returnBook() {
	System.out.println("Book returned");
}
public static void Available() {
	System.out.println("books is available");
}
public static void showlibrary() {
	System.out.println("library Name " );
	
}




public void display() {
	System.out.println("bookId " + bookId);
	System.out.println("bookName " + bookName);
	System.out.println("authorName " + authorName);
	System.out.println("publisher " + publisher);
	System.out.println("category " + category);
	System.out.println("price " + price);
	System.out.println("totalPages " + totalPages);
	System.out.println("language" + language);
	System.out.println("publicationDate " + publicationDate);
	System.out.println("libraryName " + libraryName);
	System.out.println("librarianName " + librarianName);
	System.out.println("location " + location);
	System.out.println("totalbooks " + totalbooks);
	System.out.println("availableBooks " + availableBooks);
	System.out.println("isavailable " + isAvailable);
	Book();
	issueBook();
	returnBook();
	Available();
	showlibrary();
}
	


	public static void main(String[] args) {
	 Library lab= new Library();
	 lab.bookId=10001;
	 lab.bookName="java";
	 lab.authorName="james Gosling";
	 lab.publisher="xyz";
	 lab.category="programming";
	 lab.price= 500.30;
	 lab.totalPages=300;
	 lab.language="English";
	 lab.publicationDate="10-01-2010";
	 lab.libraryName="city library";
	 lab.librarianName="Garje N B";
	 lab.location="pune";
	 lab.totalbooks=1000;
	 lab.availableBooks=500;
	 
	 lab. display();
	}
}

