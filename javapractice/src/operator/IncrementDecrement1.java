package operator;

public class IncrementDecrement1 {
	public static void main(String[] args) {
		int i=15;
		int a=5;
		a--;//4
		i++;//16
		
		System.out.println(a++ + --i);//19
		i--;//14
		a++;//6
		System.out.println(++i + a--);//21
		
		++i;//16
		a--;//4
		
		System.out.println(i-- + a++ + ++i);//36
		
		i--;//15
		 
		System.out.println(i++ + 4 + a + --i + ++a + i--);//60
		
		i++;//16
		a--;//4
		++i;//17
		System.out.println(--a + i++);//20
	}

}
