package constructor;

public class Person {
	String name;
	int age;
		public Person( String name,int age ) {
			this.name=name;
			this.age=age;
		}	
			//copy constructor
			
			Person(Person p){
				this.name=p.name;
				this.age=p.age;
		}
			public void display() {
				System.out.println("Name : " + name);
				System.out.println("Age : " + age );
				
			}

}
