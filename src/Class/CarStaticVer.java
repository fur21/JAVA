package Class;

public class CarStaticVer {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    public static void main(String[] args) {
        CarStaticVer myCar = new CarStaticVer();
        myCar.speed = 60;
        myCar.run();
    }
}
