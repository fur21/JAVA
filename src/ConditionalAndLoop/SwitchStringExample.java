package ConditionalAndLoop;

public class SwitchStringExample {
    public static void main(String[] args) {
        String position = "과장";

        switch (position) {
            case "부장":
                System.out.println("700만원입니다");
                break;
            case "과장":
                System.out.println("500만원입니다");
                break;
            default:
                System.out.println("300만원입니다");
                break;
        }
    }
}
