package createClass;

public class Main {
    public static void main(String[] args) {
//        Grandeur myCar1 = new Grandeur();
//        myCar1.color = "red";
//        myCar1.gear = "auto";
//        myCar1.price = 100;
//
//        myCar1.run();
//        myCar1.stop();
//        myCar1.info();
//
//        Grandeur myCar2 = new Grandeur();
//        myCar2.color = "yellow";
//        myCar2.gear = "auto";
//        myCar2.price = 500;
//
//        myCar2.run();
//        myCar2.stop();
//        myCar2.info();

        Bicycle mybicycle = new Bicycle();
        mybicycle.color = "red";
        mybicycle.price = 100;

        mybicycle.info();

        Bicycle mybicycle2 = new Bicycle("yellow", 500);

        mybicycle2.info();

        mybicycle2.color = "red";

        mybicycle2.info();

    }
}
