package Class;

public class CalculatorStaticVerExample {
    public static void main(String[] args) {
        double result1 = 10 * 10 * CalculatorStaticVer.pi;
        int result2 = CalculatorStaticVer.plus(10, 5);
        int result3 = CalculatorStaticVer.minus(10, 5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
}
