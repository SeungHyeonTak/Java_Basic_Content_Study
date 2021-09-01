package defaultConstructor;

public class Main {
    public static void main(String[] args) {
//        ObjectClass obj1 = new ObjectClass();
//        int[] iArr = {10, 20, 30};
//        ObjectClass obj2 = new ObjectClass("Java", iArr, 3);
        ThisMethod tm = new ThisMethod();
        System.out.println(tm.getModel());
    }
}
