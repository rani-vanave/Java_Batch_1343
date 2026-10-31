package constructor;

public class PersonMain {
	public static void main(String[] args) {
		Person p1=new Person("Rani" , 21);
		
		Person p2=new Person(p1);
		
		System.out.println("Original obj : ");
		
		p1.display();
		
		System.out.println("Copied obj ");
		p2.display();
		
		
		
	}

}
