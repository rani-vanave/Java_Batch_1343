package constructor;

public class LibraryBook {
	private  int bookid;
	private String title;
	private String author;
	//constructor
	
	public LibraryBook(int bookid,String title,String author) {
		this.bookid=bookid;
		this.title=title;
		this.author=author;
		
	}
	public int getBookid() {
		return bookid;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
		
	}
	public void display() {
		System.out.println("Book Id : " +getBookid());
		System.out.println("Book Title : " + getTitle());
		System.out.println("Book Author : " + getAuthor());
		
		System.out.println("-----------------------------------------");
	}

}
