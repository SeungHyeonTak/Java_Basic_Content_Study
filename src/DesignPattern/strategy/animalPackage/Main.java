package DesignPattern.strategy.animalPackage;

public class Main {
    public static void main(String[] args) {
        Move eagle = new Move();
        Move dog = new Move();
        Move fish = new Move();

        eagle.setMovementStrategy(new Fly());
        eagle.moving();

        dog.setMovementStrategy(new Walk());
        dog.moving();

        fish.setMovementStrategy(new Swim());
        fish.moving();
    }
}
