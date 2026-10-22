package loops_in_java;

public class Prime_number {
	public static void main(String[] args) {
		int n=6;
		boolean prime= n>=2;
		for(int i =2 ; i<=n/ i;i++) {
			if(n%1 ==0) {
				prime =false;
				break;
			}
		}
		
		if(prime) {
			System.out.println("Prime");
		}else {
			System.out.println("Not prime");
		}
	}

}