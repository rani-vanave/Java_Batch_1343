package inheritance;

public class Cat_main {
	public static void main(String[] args) {
		Dog1 d= new Dog1();
		Cat c=new Cat();
		d.eat();
		d.bark();
		System.out.println("---------------");
		c.eat();
		c.meow();
	}

}
