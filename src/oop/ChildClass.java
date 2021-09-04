package oop;

public class ChildClass extends ParentClass {
    int b;
    public ChildClass() {
//        super(40);
        System.out.println("ChildClass constructor");
        this.b = 20;
    }

    public void childFun() {
        System.out.println("--childFun() START--");
    }

    @Override
    public void makeJJajang() {
        System.out.println("---more makeJJajang()-");
    }

    public void display() {
        System.out.println(a);
        System.out.println(b);
    }
}
