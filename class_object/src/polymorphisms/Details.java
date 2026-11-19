package polymorphisms;

public class Details {
	public void ditails( String name) {
	System.out.println("Name : " + name);
	}
	public void ditails(String name,int age) {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
public static void main(String[] args) {
	Details d= new Details();
	d.ditails("Nikhil");
	d.ditails("Nikhil", 23);
}
}
