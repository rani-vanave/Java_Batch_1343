package constructor;

import javax.print.DocFlavor.READER;

public class Rectangle {
	double length;
	double breadth;
	
	 public Rectangle(double length,double breadth){
		 this.length=length;
		 this.breadth=breadth;
		 
		 
	 }
	 public void calculateArea() {
		 double area=length*breadth;
		 System.out.println("Length : " + length);
		 System.out.println("Breadth : " + breadth);
		 System.out.println("Area : " + area);
	 }
	 
	 

}
