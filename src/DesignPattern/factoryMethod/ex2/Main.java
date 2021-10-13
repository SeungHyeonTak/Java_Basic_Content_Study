package DesignPattern.factoryMethod.ex2;

public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "test1", "test2", "test3");
        Computer server = ComputerFactory.getComputer("server", "test4", "test5", "test6");
        System.out.println(pc.toString());
        System.out.println(server.toString());
    }
}
