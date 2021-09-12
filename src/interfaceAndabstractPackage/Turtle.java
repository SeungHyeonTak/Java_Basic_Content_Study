package interfaceAndabstractPackage;

public class Turtle extends Animal implements Swimable {
    public Turtle(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void swimDown(int yDistance) {
        setY(getY() - yDistance);
    }

    // 일반 클래스이므로 상속 받은 추상클래스에서 추상 메서드의 구현 부분을 채워준다.
    @Override
    public void printInfo() {
        System.out.println("Turtle -> " + toString());
    }
}
