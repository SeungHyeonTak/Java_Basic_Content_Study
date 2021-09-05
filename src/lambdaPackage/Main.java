package lambdaPackage;

public class Main {
    public static void main(String[] args) {
        LambdaInterface1 li1 = (String s1, String s2, String s3) -> {
            System.out.println(s1 + " " + s2 + " " + s3);
        };

        // 파라미터가 1개이거나 타입이 같을땐 타입 생략 가능
        LambdaInterface2 li2 = (s1) -> {
            System.out.println(s1);
        };

        // 실행문이 1개일땐 {}을 생략할 수 있다.
        LambdaInterface2 li3 = (s1) -> System.out.println(s1);

        // 파라미터와 실행문이 1개일땐 (), {}를 생략할 수 있다.
        LambdaInterface2 li4 = (s1) -> System.out.println(s1);

        // 매개변수가 없을땐 ()만 작성한다.
        LambdaInterface3 li5 = () -> System.out.println("no parameter");

        // 반환값이 있는 경우
        LambdaInterface4 li6 = (x, y) -> {
            int result = x + y;
            return result;
        };
    }
}
