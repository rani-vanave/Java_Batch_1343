package constructor;

public class Hospital {
	
	String hospitalName;
	String location;
	int totalBeds;
	String doctorName;
	
	public Hospital() {
		hospitalName = "city Hospital";
		location ="pune";
		totalBeds=100;
		doctorName="Dr Sharma";
		
}
	void display() {
		System.out.println("Hospital Name : " + hospitalName);
		System.out.println("Hospital location : " + location);
		System.out.println("Doctor Name : " + doctorName);
		
		
	}
	
	

}
