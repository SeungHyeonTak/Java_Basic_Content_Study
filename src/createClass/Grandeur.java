package createClass;

public class Grandeur {
    public String color;
    public String gear;
    public int price;

    public Grandeur() {  // 생성자
        System.out.println("Grandeur constructor");
    }

    public void run() {  // 메서드 (기능)
        System.out.println("--run()--");
    }

    public void stop() {  // 메서드 (기능)
        System.out.println("--stop()--");
    }

    public void info() {  // 메서드 (기능)
        System.out.println("--info()--");
        System.out.println("color : " + color);
        System.out.println("gear : " + gear);
        System.out.println("price : " + price);
    }
}
