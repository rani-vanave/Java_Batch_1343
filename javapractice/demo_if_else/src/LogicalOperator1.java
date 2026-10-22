package operator;

public class LogicalOperator1 {
	public static void main(String[] args) {
		boolean check =4 <6;
		System.out.println(check ||false &&4>4||!("Ram"=="ram"));
		System.out.println(56!=4&& check || 4>4 &&(!(true)));
		
		
		
		System.out.println(45>12||(12>11&& 45==45)||(false && 4>4 )||!("Ram "=="ram"));
              //            true
		
		
		System.out.println(check || 45 >12 || (12 >11 && 45==45)&& 4>4 );
		
		
		
		System.out.println(12>=12.1 ||12.1 >=12.1 && 4.0 <= 4.0 || 34>=2.4);
		
		
		
		
		System.out.println(!(12>=12.1) || false && 4>4 && !(true));
		System.out.println(false || true && 4>4 || !("Ram"=="ram"));
	}

}
