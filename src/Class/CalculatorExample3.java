package Class;

public class CalculatorExample3 {
    public static void main(String[] args) {
        Calculator3 myCal = new Calculator3();

        // 정사각형
        double result1 = myCal.areaRectangle(10);

        // 직사각형
        double result2 = myCal.areaRectangle(10, 20);

        System.out.println("정사각형의 넓이 : " + result1);
        System.out.println("직사각형의 넓이 : " + result2);
    }
}
