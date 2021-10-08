package DesignPattern.strategy.animalPackage;

interface MovementStrategy {
    void move();
}

class Fly implements MovementStrategy{
    // 나는 전략
    @Override
    public void move() {
        System.out.println("날다");
    }
}

class Walk implements MovementStrategy {
    // 걷는 전략
    @Override
    public void move() {
        System.out.println("걷다");
    }
}

class Swim implements MovementStrategy {
    // 헤엄
    @Override
    public void move() {
        System.out.println("헤엄치다");
    }
}

