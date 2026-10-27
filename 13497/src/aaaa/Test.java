package aaaa;

public class Test {
	public static void main(String[] args) {
		Person person=new Person();
		Demographics dd= person.getDetails(23, "Ram");
		
		Location ll=dd.giveAddress();
		String ttt=ll.getCityName();
		System.out.println(ttt);
		
		
	}

}
