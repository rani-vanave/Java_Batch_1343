package demo;

import java.math.BigInteger;

public class Main_P_R {

    public static void main(String[] args) {
        Methods m = new Methods();

        System.out.println(m.show());
        System.out.println(m.show(4));
        System.out.println(m.show(5, 3));
        System.out.println(m.show(8, 9));
        System.out.println(m.show("rani"));
        System.out.println(m.show(true));
        System.out.println(m.show('N'));
        System.out.println(m.show(456278910L));
        System.out.println(m.show(5.4f)); // square: 29.16
        System.out.println(m.show(5, 1000.00)); // 1005.0
        System.out.println(m.show(35000.32)); // square
        System.out.println(m.show(4, 10, 42));
        System.out.println(m.show("rani", "vanave"));
        System.out.println(m.show(5, 10, false));
        System.out.println(m.show("n", 45));
        System.out.println(m.show(6.2f, 50.20));
        System.out.println(m.show("rahul", 23));

        System.out.println(m.show(
                new BigInteger("9325131318"),
                new BigInteger("9529207371")
        ));

        System.out.println(m.show(27489));
        System.out.println(m.show(59.26));
        System.out.println(m.show(85.00));

        m.show(80, "TKA");
        m.show(5.99, 7.18, "XYZ");
        m.show("raj", 2, false);
        m.show('A', 'B');
        m.show(6738291036L, "Shri");
        m.show(32.0f, 'U');
        m.show(89, "Marks");

        m.display();
    }
}