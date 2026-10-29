package demo_object;

public class MainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.employeeId  = 76543;
		e1.employeeName ="ram";
		e1.age = 23;
		e1.gender ="male";
		e1.department ="IT";
		e1.designation="software developer";
		e1.salary=5000.00;
		e1.email="ram@gmail.com";
		e1.mobNo =849035268;
		e1.address="fc road";
		e1.city="pune";
		e1.companyName="google";
		e1.experience=4;
		e1.joinDate="2022";
		e1.education="MCA";
		
		e1.display();
		
	System.out.println("----------------------------------------------------------------------------");
	
	
		Student student=new Student();
		student.studId=1234;
		student.studName="Nikhil";
		student.age=26;
		student.gender="Male";
		student.course="Java";
		student.clgName="ceop";
		student.dept="technical";
		student.email="nikhil@gmail.com";
		student.mobNo=9325131318L;
		student.address="Beed";
		student.city="mumbai";
		student.semester=6;
		student.percentage=84.40;
		student.division="A";
		student.bloodGroup="B+";
		
		student .display();
		
		System.out.println("-----------------------------------------------------------------------------");
		
		 Library lab= new Library();
		 lab.bookId=10001;
		 lab.bookName="java";
		 lab.authorName="james Gosling";
		 lab.publisher="xyz";
		 lab.category="programming";
		 lab.price= 500.30;
		 lab.totalPages=300;
		 lab.language="English";
		 lab.publicationDate="10-01-2010";
		 lab.libraryName="city library";
		 lab.librarianName="Garje N B";
		 lab.location="pune";
		 lab.totalbooks=1000;
		 lab.availableBooks=500;
		 
		 lab. display();
		 
		System.out.println("------------------------------------------------------------------------------------"); 
		
		 Hospital h1 =new Hospital ();
		 h1.patientId=1212;
		 h1.patientName="Sneha";
		 h1.age=35;
		 h1.gender="Female";
		 h1.disease="cold";
		 h1.doctorName="Dr sharma";
		 h1.department="general";
		 h1.bloodGroup="A+";
		 h1.admitDate="21-10-2026";
		 h1.dischargeDate="23-10-2026";
		 h1.billAmt=1000.20;
		 h1.roomNo="85";
		 h1.hospitalName="city hospital";
		 h1.address="sangola";
		 h1.mobNo = 7883876831l;
		 
		 h1.display();
		 
		 
		 System.out.println("---------------------------------------------------------------------------------------------");
		 
		 Vehicle v=new Vehicle();
		 v.vehicleId=501;
		 v.brand="Honda";
		 v.model="Shine";
		 v.color="Black";
		 v.vehicleType="Bike";
		 v.fuelType="Petrol";
		 v.price=89000.60;
		 v.manufacturingYear=2024;
		 v.registrationNo="MH23AB1234";
		 v.seatingCapacity=2;
		 v.mileage=55;
		 v.ownerName="Amit";
		 v.insuranceNumber="ISS12345";
		 v.registrationDate="10-01-2025";
		 v.isElectrict=false;
		 
		 v.display();
			 
		 
		System.out.println("----------------------------------------------------------------------------------------------"); 
		MyDetail info = new MyDetail();
		
		info.personal();
		info.course();
		info.collegeinfo();
		
		
		 
	}

}
