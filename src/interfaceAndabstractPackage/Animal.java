package interfaceAndabstractPackage;

public abstract class Animal extends Creature {
    public Animal(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void attack() {
        System.out.println("몸을 사용하여 공격!");
    }

    // Creature 추상클래스에서 printInfo 메서드가 없어도 에러가 안나는 이유는?
    // Creature도 추상클래스 Animal도 추상클래스이기에 마지막으로 상속받을 클래스에게 위임한것이다.
}
