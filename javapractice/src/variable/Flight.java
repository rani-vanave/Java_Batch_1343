package variable;

public class Flight {
	static int flightId=10001;
	static String flightNumber ;
	static String airlineName="Air India";
	static String source="pune";
	static String destination="Delhi";
	static byte totalSeats=120;
	static short flightCode;
	static long contactNo;
	static float ticketPrice;
	static double flightDistance=1450.75;
	static char flightclass;
	static boolean isDomestic=true;
	static int availableSeat=80;
	static float fuelCapacity;
	static boolean isAvailable=true;
	
	public static void main(String args[]) {
		
	
          
	
	System.out.println("flightId : " + flightId );
    System.out.println("flightNumber: " + flightNumber);
    System.out.println("airlineName: " + airlineName);
    System.out.println("source: " + source);
    System.out.println("destination : " + destination);
    System.out.println("totalSeats : " + totalSeats);
    System.out.println("flightCode: " + flightCode);
    System.out.println("contactNo: " + contactNo);
    System.out.println("ticketPrice: " + ticketPrice);
    System.out.println("flightDistance: " + flightDistance);
    System.out.println("flightclass: " + flightclass);
    System.out.println("domesticFlight : " + isDomestic);
    System.out.println("availableSeat : " + availableSeat);
    System.out.println("fuelCapacity : " + fuelCapacity);
    System.out.println("flightAvailable : " + isAvailable);
}
}

