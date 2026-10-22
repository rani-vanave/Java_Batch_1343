package loops_in_java;

public class Cubesofnumber {
	public static void main(String[] args) {
	//	for(int i=1; i<=10;i++) {
		//	System.out.println(i*i*i);
		//}
//	}
//}
	//	 count number divisible by 3 between 1 & 100
	int count=0;
	 
 for(int i=1;i<=100;i++) {
	if(i%3==0) {
		count++;
	}
}

System.out.println("Count = " + count);
}
}