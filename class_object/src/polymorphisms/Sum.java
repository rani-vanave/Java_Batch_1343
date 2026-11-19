package polymorphisms;

public class Sum {
	public int sum(int a,int b) {
		return a+b;
	}
	public float sum(float a,float b) {
		return a+b;
	}
	public static void main(String[] args) {
		Sum s= new Sum();
		System.out.println( "Integer sum = " +s.sum(45, 34));
		System.out.println( "float sum = " +s.sum(4.5f, 3.2f));
	}

}
