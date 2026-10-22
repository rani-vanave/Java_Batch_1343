package operator;

public class IncrementDecrement {
	public static void main(String args[]) {
		int i=5;
		  i++;
	
	System.out.println(--i);	 // u=5 p=5
	--i;
	++i;
	System.out.println(i++);//p=5 u=6
	i--;
	--i;
	System.out.println(i++);//p=4 u=5
	i++;
	i--;
	System.out.println(i+5);//p=10 u=5
	i++;
	--i;
	System.out.println(++i);//p=6 u=6
	i--;
	++i;
	System.out.println(i+2);//p=8 u=6
	
	--i;
	++i;
	System.out.println(i--);//p=6 u=5
	--i;
	i++;//5
	System.out.println(i-- + i ++);  //p=9 u=10
	
	i--;
	++i;
	System.out.println(i++);//p=5 u=6
	
	
	}
	
	

}
