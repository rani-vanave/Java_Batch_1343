package demo;

public class LibrarySystem {
	public void issudBook(String bookName,boolean isAvailable) {
		if(isAvailable) {
			System.out.println(bookName + "book issued successfully");
			
		}else {
			System.out.println(bookName + "book is not available");
		}
	}

}
