package polymorphisms;

public class Student {
	int id;
	String name;
	public Student() {
		id=0;
		name="null";
		
	}
	public Student(int id ) {
		this.id=id;
		name="Null";
		
	}
	Student(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	void display() {
		System.out.println(id +"  "+name);
		
	}
	public static void main(String[] args) {
		Student s1 =new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.display();
		s2.display();
		s3.display();
	}

}
