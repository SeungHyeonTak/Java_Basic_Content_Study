package DesignPattern.strategy.movePackage;

public class Main {
    public static void main(String[] args) {
        Moving train = new Moving();
        Moving bus = new Moving();

        train.setMovableStrategy(new RailLoadStrategy());
        bus.setMovableStrategy(new LoadStrategy());

        train.move();
        bus.move();

        bus.setMovableStrategy(new RailLoadStrategy());
        bus.move();
    }
}
