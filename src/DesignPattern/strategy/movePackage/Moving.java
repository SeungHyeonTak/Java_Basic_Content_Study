package DesignPattern.strategy.movePackage;

public class Moving {
    private MovableStrategy movableStrategy;

    public void move() {
        movableStrategy.move();
    }

    public void setMovableStrategy(MovableStrategy movableStrategy) {
        this.movableStrategy = movableStrategy;
    }
}

class Bus extends Moving {

}

class Train extends Moving {
    
}
