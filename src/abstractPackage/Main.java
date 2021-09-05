package abstractPackage;

public class Main {
    public static void main(String[] args) {
//        AbstractClassEx ex = new ClassEx(10, "Java");
//
//        ex.fun1();
//        ex.fun2();

        BankClass mybank = new MyBankClass("홍길동", "123-456", 1000);

        mybank.deposit();
        mybank.withdraw();
        mybank.installmentSavings();
        mybank.cancellation();

        System.out.println();

        mybank.getInfo();
    }
}
