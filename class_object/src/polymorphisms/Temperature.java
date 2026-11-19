package polymorphisms;

public class Temperature {
	public double convert( double celsius) {
		return(celsius * 9/5) + 32;
		
		}
	double convert(int fahrenheit) {
		return (fahrenheit - 32) * 5.0/9;
	}
	public static void main(String[] args) {
		Temperature t= new Temperature();
		System.out.println("fahrenheit : " + t.convert(25.0));
		System.out.println("Celsius : " + t.convert(98));
	}
	

}
