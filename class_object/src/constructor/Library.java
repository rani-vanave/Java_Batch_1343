package constructor;

public class Library {
	String libraryName;
	String librarianName;
	int totalBooks;
	
	public Library( String Name,String librarian,int Books) {
		libraryName = Name;
		librarianName= librarian;
		totalBooks =Books;
		
		System.out.println("Library Name ----> " + Name);
		System.out.println("Librarian Name ---> " + librarian);
		System.out.println("total Books ----> " + Books);	
	}

}
