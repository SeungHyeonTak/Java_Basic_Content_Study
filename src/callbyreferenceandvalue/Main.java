package callbyreferenceandvalue;

class CallByValue {
    public void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}

class CallByReference {
    int data;

    public CallByReference(int data) {
        this.data = data;
    }
}

public class Main {

    public static void swap(CallByReference x, CallByReference y) {
        int temp = x.data;
        x.data = y.data;
        y.data = temp;
    }

    public static void swap2(CallByReference x, CallByReference y) {
        CallByReference temp = x;
        x = y;
        y = temp;

    }

    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        CallByValue cv = new CallByValue();
//        System.out.println("a : " + a + ", " + "b : " + b);
//        cv.swap(a, b);
//        System.out.println("a : " + a + ", " + "b : " + b);

        CallByReference a = new CallByReference(10);
        CallByReference b = new CallByReference(20);

        System.out.println("a : " + a.data + ", " + "b : " + b.data);
        System.out.println("a : " + a.hashCode() + ", " + "b : " + b.hashCode());
//        swap(a, b);
        swap2(a, b);
        System.out.println("a : " + a.data + ", " + "b : " + b.data);
        System.out.println("a : " + a.hashCode() + ", " + "b : " + b.hashCode());
    }
}
