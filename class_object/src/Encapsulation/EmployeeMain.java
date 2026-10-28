package Encapsulation;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e = new Employee() ;
		e.setemployee_ID(101);
		e.setemployeeName("Rani");
		e.setage(21);
		e.setgender("female");
		e.setdepartment("IT");
		e.setdesignation("Software Devloper");
		e.setsalary(35000.00);
		e.setemail("rano@123gmail.com");
		e.setphoneNum(9453626720l);
		e.setaddress("at khilad");
		e.setcity("pune");
		e.setstate("Maharashtra");
		e.setcompanyName("Infosys");
		e.setjoiningDate("28-10-2026");
		e.setqualification("BCA");
		
		System.out.println("Employee ID : " + e.getemployee_ID());
		System.out.println("Employee Name : " + e.getemployeeName());
		System.out.println("Employee Age : " + e.getage());
		System.out.println("Employee gender : " + e.getgender());
		System.out.println("Employee Department : " + e.getdepartment());
		System.out.println("Employee Designation : " + e.getdesignation());
		System.out.println("Employee salary : " + e.getsalary());
		System.out.println("Employee Email : " + e.getemail());
		System.out.println("Employee PhoneNumber : " + e.getphoneNum());
		System.out.println("Employee Address : " + e.getaddress());
		System.out.println("Employee City : " + e.getcity());
		System.out.println("Employee Stste : " + e.getstate());
		System.out.println("Employee Company Name : " + e.getcompanyName());
		System.out.println("Employee Joining Date : " + e.getjoiningDate());
		System.out.println("Employee Qualification : " + e.getqualification());
			
		}
		
	}


