package override_polymorphism;

public class Main_Class {
	public static void main(String[] args) {
		Animal a=new Dog();
		a.sound();
		a=new Cat();
		a.sound();
		
	}

}
