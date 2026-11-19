package polymorphisms;

public class Area {
	double area(double radius) {
		return 3.14*radius*radius;
	}
	int area(int lenght,int breadth) {
		return lenght*breadth;
	}
	public static void main(String[] args) {
		Area a= new Area();
		System.out.println( "Circle Area : " +a.area(4.0));
		System.out.println("Rectangle Area : " +a.area(7, 5));
	}

}
