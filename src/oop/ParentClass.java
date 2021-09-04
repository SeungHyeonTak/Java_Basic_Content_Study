package oop;

public class ParentClass {
    int a;
    public ParentClass() {
        System.out.println("ParentClass constructor");
        this.a = 10;
    }

    public ParentClass(int n) {
        this.a = n;
    }

    public void parentFun() {
        System.out.println("--parentFun() STRAT--");
    }

    private void privateFun() {
        System.out.println("privateFun()");
    }

    public void makeJJajang() {
        System.out.println("---makeJJajang()-");
    }
}
