package Class;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("대박박", "011225-1234567");
        System.out.println("k1.name" + k1.name);
        System.out.println("k1.ssn" + k1.ssn);

        Korean k2 = new Korean("뿡빵띠", "930525-7654321");
        System.out.println("k2.name" + k2.name);
        System.out.println("k2.ssn" + k2.ssn);
    }
}
