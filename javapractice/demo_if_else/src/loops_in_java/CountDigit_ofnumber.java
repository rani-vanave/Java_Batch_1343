package loops_in_java;

public class CountDigit_ofnumber {
	public static void main(String[] args) {
          int n=12345;
          int count=0;
          
          for(;n>0; n=n/10) {
        	  count++;
          }
				
		System.out.println("Digits = " + count);		
	}

}
