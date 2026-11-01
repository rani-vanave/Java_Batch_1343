package constructor;

public class LibraryBookMain {
	public static void main(String[] args) {
		LibraryBook b=new LibraryBook(101, "Java Programming", "James Gosling");
		
		LibraryBook b1=new LibraryBook(102, "Python Basics", "Guido van Rossum");
		
		LibraryBook b2=new LibraryBook(103, "SQL Complete","Mark Smith");
		
		b.display();
		b1.display();
		b2.display();
	}

}
