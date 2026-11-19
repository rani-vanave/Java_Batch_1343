package polymorphisms;

public class Main_class {
	public static void main(String[] args) {
		System.out.println("original main method");
		main(10);
		main("Java");
		main(10,20);
	}
	static void main(int a) {
		System.out.println("Integer main : " + a);
	} 
	static void main(String name) {
		System.out.println("String main " + name);
	}
	static void main(int a, int b) {
		System.out.println("Two number : " +(a+b));
		
	}
	
	
}
