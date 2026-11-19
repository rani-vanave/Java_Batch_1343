package polymorphisms;

public class Static {
	
	 static void Print(int a) {
		System.out.println("One parameter :  " + a);
		
	}
	 static void print(int a,int b) {
		System.out.println("Two parameter : " + a + b);
		
	}
	public static void main(String[] args) {
		Static.Print(45);
		Static.print(21, 23);
	}

}
