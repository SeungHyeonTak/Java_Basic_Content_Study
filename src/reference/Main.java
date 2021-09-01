package reference;

public class Main {
    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass();
        ObjectClass obj2 = new ObjectClass();
        ObjectClass obj3 = new ObjectClass();

        // 객체의 주소는 다 다르다
        System.out.println("obj1 : " + obj1);
        System.out.println("obj2 : " + obj2);
        System.out.println("obj3 : " + obj3);

        obj1 = null;  // 레퍼런스 x
//        obj1.getInfo();  // 실행 안됨 NullPointException
    }
}
