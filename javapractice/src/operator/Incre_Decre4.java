package operator;

public class Incre_Decre4 {
	public static void main(String[] args) {
		int i = 56;
		--i;//55
		++i;//56
		System.out.println(i-- + 10);//p=66 u=65
		i--;//54
		++i;//55
		System.out.println(i-- + ++i);//110
		i--;//54
		++i;//55
		i++;//56
		System.out.println(i + --i);//111
		i--;//54
		i++;//55
		System.out.println(i++ +2);//p=57 u=58
		i++;//57
		++i;//58
		i--;//57
		System.out.println(i + 2 + i-- + ++i + i++ + --i);
		
	}

	}


