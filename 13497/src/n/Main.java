package n;

public class Main {
public static void main(String[] args) {
	School school=new School();
	Classroom classroom =new Classroom();
	Student student = new Student();
	Address address =new Address();
	String city=address.getcityName();
	
	System.out.println(city);
	
}
}
