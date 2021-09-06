package exceptionPackage;

public class Main {
    public static void main(String[] args) {
//        int i = 10;
//        int j = 0;
//        int k = 0;
//
//        System.out.println("Exception BEFORE");
//
//        try {
//            k = i / j;
//        } catch (Exception e) {
//            e.printStackTrace();
//            String msg = e.getMessage();
//            System.out.println("msg : " + msg);
//        }
//
//        System.out.println("Exception AFTER");
        Main m = new Main();

        try {
            m.firstMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void firstMethod() throws Exception {
        secondMethod();
    }

    public void secondMethod() throws Exception {
        thirdMethod();
    }

    public void thirdMethod() throws Exception {
        System.out.println("10 / 0 = " + (10 / 0));
    }
}
