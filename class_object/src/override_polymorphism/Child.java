package override_polymorphism;

public class Child extends Parent {
	
	public Child() {
		System.out.println("Child constructor");
	}
	public int m1(int a) {
		return 56;
	}
	
	public int m1(int a,int b) {
		return 56;
	}
	public static void main(String[] args) {
		Child c= new Child();
		c.m1(1);
		c.m1(3, 6);
	}
	

}
