package Operator;

public class OverflowExample {
    public static void main(String[] args) {
        long x = 100000000;
        long y = 100000000;
        long z = x * y;
        System.out.println(z);
    }
}
