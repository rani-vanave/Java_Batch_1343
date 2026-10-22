package operator;

 class AssignmentOperator2 {
public static void main(String[] args) {
	
int a = 10;             System.out.println(a);  // = 10
a += 5;                 System.out.println(a);  // += 15
a -= 3;                 System.out.println(a);  // -= 12
a *= 2;                 System.out.println(a);  // *= 24
a /= 4;                 System.out.println(a);  // /= 6
a %= 4;                 System.out.println(a);  // %= 2

int b = 8;              System.out.println(b);  // = 8
b &= 3;                 System.out.println(b);  // &= 0
b = 8;                  System.out.println(b);  // = 8
b |= 3;                 System.out.println(b);  // |= 11
b ^= 3;                 System.out.println(b);  // ^= 8
b <<= 2;                System.out.println(b);  // <<= 32
b >>= 1;                System.out.println(b);  // >>= 16
b >>>= 2;               System.out.println(b);  // >>>= 4

int c = 5;              

c += 10;                System.out.println(c);  // += 15
c *= 3;                 System.out.println(c);  // *= 45
c -= 20;                System.out.println(c);  // -= 25
c /= 5;                 System.out.println(c);  // /= 5
c %= 3;                 System.out.println(c);  // = 5

}

}