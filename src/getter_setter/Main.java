package getter_setter;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동", 90);
        student1.getInfo();

        student1.setScore(100);  // setter로 점수 변경
        student1.getInfo();
    }
}
