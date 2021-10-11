package DesignPattern.templateMethod.dp;

public abstract class AbstGameConnectionHelper {
    protected abstract String doSecurity(String str); // 보안 과정

    protected abstract boolean authentication(String id, String password); // 인증과정

    protected abstract int authorization(String userName); // 권한과정

    protected abstract String connection(String info); // 접속과정

    // template method
    public String requestConnection(String encodedInfo) {
        String decodedInfo = doSecurity(encodedInfo); // 보안작업 -> 암호화 된 문자열을 복호화 한다.

        // 반환된 것을 가지고 아이디, 암호를 할당한다.
        String id = "aaa";
        String password = "bbb";
        if (!authentication(id, password)) { // 인증과정
            throw new Error("아이디 암호 불일치");
        }

        // 권한 과정
        String userName = "userName";
        int i = authorization(userName);

        switch (i) {
            case -1:
                throw new Error("셧다운");
            case 0:
                System.out.println("게임 매니저");
                break;
            case 1:
                System.out.println("유료 회원");
                break;
            case 2:
                System.out.println("무료 회원");
                break;
            case 3:
                System.out.println("권한 없음");
                break;
            default:  // 기타 상항
                System.out.println("기타 상황");
                break;
        }

        return connection(decodedInfo);
    }
}
