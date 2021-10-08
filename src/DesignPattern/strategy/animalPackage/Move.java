package DesignPattern.strategy.animalPackage;

public class Move {
    private MovementStrategy movementStrategy;

    public void setMovementStrategy(MovementStrategy _movementStrategy) {
        this.movementStrategy = _movementStrategy;
    }

    public void moving() {
        movementStrategy.move();
    }
}
