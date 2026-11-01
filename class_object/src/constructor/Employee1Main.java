package constructor;

public class Employee1Main {
	public static void main(String[] args) {
		Employee1 e=new Employee1("Rahul", 35000);
		System.out.println("Before Increment : ");
		e.display();
		e.increment();
		
		System.out.println("------------------------------");
		
		System.out.println("After 10% Increment : ");
		e.display();
	}

}
