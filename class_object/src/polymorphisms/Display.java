package polymorphisms;

public class Display {
	
    public int display(int a) {
    	return a;
	
}
    public String display( String a) {
    	return a;
    }
    public static void main(String[] args) {
		Display d= new Display();
		
		System.out.println( "Intager : " + d.display(45));
		System.out.println( "String : " +d.display("Ram"));
		
	}
}
