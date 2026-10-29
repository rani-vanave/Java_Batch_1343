package demo_object;



public class MainAtm {
	public static void main(String[] args) {
		AtmSystem A=new AtmSystem ();
		A.checkBalance(35000.45);
		A.withdrawAmount(35000.45, 22909);
		
		System.out.println("--------------------------------------------------------------------------");
		
		StudentResult P =new StudentResult();
		double percentage = P.calculatePercentage(67, 75, 96);
		System.out.println("percentage: "+ percentage);
		
		System.out.println("----------------------------------------------------------------------------");
		
		MobileRecharge mob= new MobileRecharge();
		mob.recharge(299.30);
		
		System.out.println("------------------------------------------------------------------------------");
		TempratureConverter  T= new TempratureConverter();
		
		 double tempurature =T.celsiusToFahrenheit(32.3);
		System.out.println("Tempurature : " + tempurature);
		
		System.out.println("---------------------------------------------------------------------------");
		
		LoginSystem L=new LoginSystem();
		L.login("admin", "1234");
		System.out.println("Login : " + L.login("admin", "1234"));
		
		System.out.println("----------------------------------------------------------------------------");
		E_commerceDiscount d=new E_commerceDiscount();
		
		System.out.println("Final price " + d.calculateDiscount(35000.34));
		
		System.out.println("-----------------------------------------------------------------------------");
		
		EmployeeSalary E=new EmployeeSalary();
		
		System.out.println("Salary : " + E.calculatesalary(50000));
		
		System.out.println("------------------------------------------------------------------------------");
		
		BankInterest I=new BankInterest();
		System.out.println("Interest : " + I.calculateInterest(100000, 5,2 ));
		
		System.out.println("-------------------------------------------------------------------------------");
		 
		FoodOrderingApp F= new FoodOrderingApp();
		
		F.placeOrder("Pizza", 2);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		ElectricityBill U=new ElectricityBill();
		System.out.println("ElectricityBill " + U.calculateBill(10));
		
		System.out.println("----------------------------------------------------------------------------------");
		
		OnlineVotingSystem On=new OnlineVotingSystem();
		
		On.Vote(20);
		  
		System.out.println("------------------------------------------------------------------------------------");
		
		RideBookingApp R=new RideBookingApp();
		System.out.println( "distance : " + R.calculateFare(12.5));
		
		System.out.println("--------------------------------------------------");
		
		PasswordChecker pass=new PasswordChecker();
		System.out.println(pass.chekpassword("123@Rani02"));
		
		System.out.println("--------------------------------------------------");
		
		LibrarySystem b=new LibrarySystem();
		System.out.println("----Library System----");
		b.issudBook("Java", true);
		b.issudBook("paython",false);
		System.out.println("----------------------------------------------------");
		
		ShoppingCartTotal total=new ShoppingCartTotal();
		
		System.out.println("shopping total : " +total.calculateTotal(350.20, 100.00, 600.35));
		
		System.out.println("-----------------------------------");
		MaximumNumber max=new MaximumNumber();
		;
		int Max=max.findMax(50, 188, 106);
		
		System.out.println("first Number : 50");
		System.out.println("second Number : 188 ");
		System.out.println("third Number : 106");
		
		
		System.out.println("Maximum Number : " + Max);
		
		System.out.println("------------------------------------------");
		
		    PrimeNumCheck pnum = new PrimeNumCheck();

		    int num = 2;
		    System.out.println("Number: " + num);

		    if (pnum.isPrime(num)) {
		        System.out.println("It is a Prime Number");
		    } else {
		        System.out.println("It is not a Prime Number");
		    }
		
		   System.out.println("-----------------------------------------------"); 
		   Palindrome_Checker Palindrome =new Palindrome_Checker();
		    int n=12;
		    System.out.println("Number : " + n);
		    if(Palindrome.isPalindrome(n)){
		    	System.out.println("It is a Palindrome Number ");
		    }else {
		    	System.out.println("It is not a palindrome Numbere");
		    }
		   
		    System.out.println("------------------------------------------------");
		    EvenOdd e=new EvenOdd();
		    int [] arr= {10,15,20,25,30,35};
		    System.out.println("Arry Element : ");
		    
		    for(int i=0;i< arr.length;i++) {
		    	System.out.println(arr[i]);
		    	
		    }
		    e.countEvenOdd(arr);
		    
		    System.out.println("--------------------------------------------");
		    
		    Grade_calculator G=new Grade_calculator();
		    int marks =25;
		    System.out.println("Studrnt marks: " + marks );
		    char grade=G.getGrade(marks);
		    if(grade =='F') {
		    	System.out.println("Student is fail");
		    	
		    }else {
		    	System.out.println("Student Grade : " + grade);
		    }
		    
	}
}