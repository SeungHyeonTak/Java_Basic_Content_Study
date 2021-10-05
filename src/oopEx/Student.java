package oopEx;

public class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal() {
        // 국어, 영어, 수학의 점수를 모두 더해서 반환
        return kor + eng + math;
    }

    public float getAverage() {
        // 총점을 과목수로 나눈 평균을 구한다.
        float ave = getTotal();
        return Math.round(ave / 3f * 10) / 10f;
    }

    public String info() {
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
    }

    public static void main(String[] args) {
//        Student s = new Student();
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
//        s.name = "홍길동";
//        s.ban = 1;
//        s.no = 1;
//        s.kor = 100;
//        s.eng = 60;
//        s.math = 76;
//
//        System.out.println("이름 : " + s.name);
//        System.out.println("총점 : " + s.getTotal());
//        System.out.println("평균 : " + s.getAverage());

        System.out.println(s.info());
    }
}
