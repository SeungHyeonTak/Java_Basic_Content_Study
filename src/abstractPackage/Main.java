package abstractPackage;

public class Main {
    public static void main(String[] args) {
//        AbstractClassEx ex = new ClassEx(10, "Java");
//
//        ex.fun1();
//        ex.fun2();

//        BankClass mybank = new MyBankClass("홍길동", "123-456", 1000);
//
//        mybank.deposit();
//        mybank.withdraw();
//        mybank.installmentSavings();
//        mybank.cancellation();
//
//        System.out.println();
//
//        mybank.getInfo();

        // 참조변수의 타입 변환 해보기
        TestClass tc = null;
        TestChild tChild = new TestChild();
        TestClass tc2 = new TestClass();
        TestSecondChild tChild2 = null;

        tc = tChild;
//        tChild2 = (TestSecondChild)tc2;  // 타입 변환 생략 불가 - 부모 -> 자식으로 변환 X
//        tChild2 = (TestSecondChild)tChild;  // 상관관계가 아니라 오류 발생
//        System.out.println(tChild2);
    }
}
