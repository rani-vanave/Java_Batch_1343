package constructor;

public class ConstructorOverLoading {
	int age;
	 public ConstructorOverLoading() {
	  age =18;
	 }
	  public ConstructorOverLoading(int age) {
		  this.age=age;
	  }
	  void diplay() {
		  System.out.println("Age : " + age);
	  }
}