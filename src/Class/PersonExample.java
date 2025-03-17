package Class;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567", "계백");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        // p1.nation = "usa";           final 변수 'nation'에 값을 대입할 수 없습니다
        // p1.ssn = "1234567-123456";   final 변수 'ssn'에 값을 대입할 수 없습니다
        p1.name = "을지문덕";

        System.out.println(p1.name);
    }
}
