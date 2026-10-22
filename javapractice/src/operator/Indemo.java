package operator;

public class Indemo {
public static void main(String[] args) {
	int i=30;
	i++;//31
	--i;//30
	System.out.println(i--+ 2);//32
	i--;//28
	++i;//29
	i--;//28
	System.out.println(i + i++ + ++i +i--);//116
	i++;//30
	--i;//29

    System.out.println(--i + i++ + ++i +i--);//116
    
}
}
