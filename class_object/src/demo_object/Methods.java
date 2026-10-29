package demo_object;

import java.math.BigInteger;
import java.util.Arrays;

public class Methods {

    // 1–20: Methods that return values

    public int show() {
        return 100;
    }

    public int show(int a) {
        return a;
    }

    public int show(int a, int b) {
        return a + b;
    }

    public double show(double a, double b) {
        return a + b;
    }

    public String show(String text) {
        return text;
    }

    public boolean show(boolean value) {
        return value;
    }

    public char show(char value) {
        return value;
    }

    public long show(long value) {
        return value;
    }

    // Return the square of a float
    public float show(float value) {
        return value * value;
    }

    // Keep the decimal part instead of converting b to int
    public double show(int a, double b) {
        return a + b;
    }

    public double show(double a) {
        return a * a;
    }

    public int show(int a, int b, int c) {
        return a + b + c;
    }

    public String show(String a, String b) {
        return a + b;
    }

    public boolean show(int a, int b, boolean check) {
        return check && a > b;
    }

    public int show(char letter, int count) {
        return letter + count;
    }

    public double show(float a, double b) {
        return a + b;
    }

    public String show(String name, int age) {
        return name + " is " + age;
    }

    // BigInteger avoids overflow for large multiplication
    public BigInteger show(BigInteger a, BigInteger b) {
        return a.multiply(b);
    }

    public int show(int[] numbers) {
        return numbers.length;
    }

    public double show(double[] numbers) {
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        return total;
    }

    // void methods: these print output

    public void show(int a, String label) {
        System.out.println(label + ": " + a);
    }

    public void show(double a, double b, String label) {
        System.out.println(label + ": " + (a + b));
    }

    public void show(String text, int times, boolean upper) {
        for (int i = 0; i < times; i++) {
            System.out.println(upper ? text.toUpperCase() : text);
        }
    }

    public void show(char a, char b) {
        System.out.println(a + " " + b);
    }

    public void show(long number, String label) {
        System.out.println(label + ": " + number);
    }

    public void show(float temperature, char unit) {
        System.out.println(temperature + " " + unit);
    }

    public void show(int[] numbers, String label) {
        System.out.println(label + ": " + Arrays.toString(numbers));
    }

    public void show(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public void display() {
        System.out.println("This is the display method");
    }

}
