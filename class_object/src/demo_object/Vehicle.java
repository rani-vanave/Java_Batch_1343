package demo_object;

public class Vehicle {
	int vehicleId;
	String brand;
	String model;
	String color;
	String vehicleType;
	String fuelType;
	double price;
	int manufacturingYear;
	String registrationNo;
	int seatingCapacity;
	double mileage;
	String ownerName;
	String insuranceNumber;
	String registrationDate;
	boolean isElectrict;
	
	public  String vehicleDetail() {
		System.out.println("vehicleId : " + vehicleId );
		System.out.println("brand : " + brand);
		System.out.println("model : " + model);
		
	return null;
		
	}
	public void start() {
		System.out.println(brand + "vehicle started");
		
	}
	public void stop() {
		System.out.println(brand + "vehicle stopped");
	}
	public void displayPrice() {
		System.out.println("price : " + price );
		
	}
	public void displayMileage() {
		System.out.println("Mileage :" + mileage + "km/l");
	}
	public void display() {
		System.out.println("vehicleId : " + vehicleId );
		System.out.println("brand : " + brand);
		System.out.println("model : " + model);
		System.out.println("color : " + color );
		System.out.println("vehicleType : " + vehicleType);
		System.out.println("fuelType : " + fuelType);
		System.out.println("price : " + price );
		System.out.println("manufactufingYear : " + manufacturingYear);
		System.out.println("registrationNo: " + registrationNo);
		System.out.println("seatingCapacity : " + seatingCapacity );
		System.out.println(" : " + brand);
		System.out.println("model : " + model);
		
		
	}

}
