package createClass;

public class Bicycle {
    public String color;
    public int price;

    public Bicycle() {  // 생성자
        System.out.println("Bicycle constructor1");
    }

    public Bicycle(String c, int p) {  // 매개변수가 있는 생성자
        System.out.println("Bicycle constructor2");
        this.color = c;
        this.price = p;
    }

    public void info() {  // 메서드 (기능) - 정보
        System.out.println("--info()--");
        System.out.println("color : " + color);
        System.out.println("price : " + price);
    }
}
