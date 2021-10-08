package DesignPattern.strategy.movePackage;

interface MovableStrategy {
    void move();
}

class RailLoadStrategy implements MovableStrategy {
    // 기차
    @Override
    public void move() {
        System.out.println("선로 통행");
    }
}

class LoadStrategy implements MovableStrategy {
    // 버스
    @Override
    public void move() {
        System.out.println("도로 통행");
    }
}