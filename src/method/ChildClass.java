package method;

public class ChildClass {
    // 변수에 어떠한 값들을 할당 하지 않으면 String은 null int는 0으로 출력된다.
    public String name;
    public String gender;
    public int age;

    public ChildClass() {
        System.out.println("--ChildClass constructor--");
    }

    public void setInfo(String n, String g, int a) {
        System.out.println("--setInfo() START--");
        this.name = n;
        this.gender = g;
        this.age = a;
    }

    public void getInfo() {
        System.out.println("--getInfo() START--");
        System.out.println("name : " + name);
        System.out.println("gender : " + gender);
        System.out.println("age : " + age);
        this.mySecret();
    }

    private void mySecret() {
        System.out.println("--mySecret()--");
    }
}
