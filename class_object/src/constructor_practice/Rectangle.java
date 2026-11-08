package constructor_practice;

public class Rectangle {
	
	    private double length;
	    private double breadth;

	    public Rectangle(double length, double breadth) {

	        this.length = length;
	        this.breadth = breadth;
	    }

	    public double calculateArea() {
	        return length * breadth;
	    }

	    public double calculatePerimeter() {
	        return 2 * (length + breadth);
	    }

	    public boolean checkSquare() {

	        if (length == breadth) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public void displayResults() {

	        System.out.println("Length: " + length);
	        System.out.println("Breadth: " + breadth);

	        System.out.println("Area: " + calculateArea());

	        System.out.println("Perimeter: " + calculatePerimeter());

	        if (checkSquare()) {
	            System.out.println("It is a Square.");
	        } else {
	            System.out.println("It is a Rectangle.");
	        }
	    }
}
	

