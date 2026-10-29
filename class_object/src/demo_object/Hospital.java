package demo_object;

public class Hospital {
  int patientId;
  String patientName;
  int age;
  String gender;
  String disease;
  String doctorName;
  String department;
  String bloodGroup;
  String admitDate;
  String dischargeDate;
  double billAmt;
  String roomNo;
  String hospitalName;
  String address;
  long mobNo;
  
 public static void patient() {
	 System.out.println("patient is strong");
 }
 public static void admitpatient() {
	 System.out.println("patient is admit");
 }
 public static void dischargepatient() {
	 System.out.println("is discharge");
	 
 }
 public static void showbill() {
	 System.out.println("bill amount");
 }
 public static void showdoctor() {
	 System.out.println("doctor name");
 }
 
 public void display() {
	 System.out.println("patientId : " + patientId);
	 System.out.println("patientName : " + patientName);
	 System.out.println("age : " + age);
	 System.out.println("gender : " + gender);
	 System.out.println("disease : " + disease);
	 System.out.println("doctorName : " + doctorName);
	 System.out.println("department : " + department);
	 System.out.println("bloodGroup : " + bloodGroup);
	 System.out.println(" admitDate : " + admitDate);
	 System.out.println("dischargeDate : " + dischargeDate);
	 System.out.println("billAmt : " + billAmt);
	 System.out.println("roomNo: " + roomNo);
	 System.out.println("hospilatName: " + hospitalName);
	 System.out.println("mobNo: " + mobNo);

	 patient();
	 admitpatient();
	 dischargepatient();
	 showbill();
	 showdoctor();
	 



 }
 
 
}
