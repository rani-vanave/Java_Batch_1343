package Encapsulation;

public class Sum {
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println("Addition : " + sum);
		
	}
	public static void main(String[] args) {
		Sum s=new Sum();
		s.add(4, 15);
	}

}
