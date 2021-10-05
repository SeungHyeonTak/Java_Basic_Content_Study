package oopEx;

class Ball {
    private String name = "Ball";

    public void printName() {
        System.out.println("name : " + name);
    }

    public String getName() {
        return name;
    }
}

class BaseBall extends Ball {
    @Override
    public void printName() {
        System.out.println("BaseBall");
    }

    public void printSize() {
        System.out.println("BaseBall : " + 11.0);
    }
}

class SockerBall extends Ball {
    public void printName() {
        System.out.println("SockerBall");
    }

    public void printSize() {
        System.out.println("SockerBall : " + 25.0);
    }
}

public class Characteristics1 {
    public static void main(String[] args) {
        // 은닉과 상속에 대해서
//        Ball b = new Ball();
//        b.printName();
//        System.out.println(b.getName());
//        Ball b = new BaseBall();
//        b.printName();
//        BaseBall b1 = new BaseBall();
//        b1.printSize();
//        Ball b = new SockerBall();
//        SockerBall b = new SockerBall();
//        b.printName();
//        System.out.println("====");
        Ball b1 = new Ball();
        b1.printName();
    }
}
