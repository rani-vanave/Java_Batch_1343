package operator;

public class IncrementD3 {
public static void main(String[] args) {
	int i=15;
	i++;
	 System.out.println(--i);//15
	 i++;//16
	 --i;//15
	 i--;//14
	 System.out.println(i++ +5);//19
	 i--;//14
	 i++;//15
	 System.out.println(i-- +3);//18
		 i--;//13
		 ++i;//14
		 System.out.println(i++);//14
		 i++;//16
		 --i;//15
		 System.out.println(i+i++ + --i)//45
		 ;
}
}
