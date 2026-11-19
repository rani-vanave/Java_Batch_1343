package polymorphisms;

public class Demo {
	public void show( int id,String name) {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		
	}
	public void show(String city, int age) {
		System.out.println("City : " + city);
		System.out.println("age : " + age);
	}
	public static void main(String[] args) {
		Demo d= new Demo();
		d.show(101, "Rahul");
		d.show("pune", 23);
	}

}
