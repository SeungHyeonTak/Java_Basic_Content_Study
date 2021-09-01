package defaultConstructor;

public class ObjectClass {
    public ObjectClass() {
        // 생성자
        System.out.println("--ObjectClass()--");
    }

    public ObjectClass(String s, int[] iArr, int i) {
        // 사용자 정의 생성자
        System.out.println("--ObjectClass()--");
        System.out.println(s + "\n" + iArr + "\n" + i);
    }
}
