package interfaceAndabstractPackage;

public class Pigeon extends Animal implements Flyable {
    public Pigeon(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void fly(int yDistance) {
        setY(getY() + yDistance);
    }

    @Override
    public void flyMove(int xDistance, int yDistance) {
        setY(getY() + yDistance);
        setX(getX() + xDistance);
    }

    // 일반 클래스이므로 상속 받은 추상클래스에서 추상 메서드의 구현 부분을 채워준다.
    @Override
    public void printInfo() {
        System.out.println("Pigeon -> " + toString());
    }
}
