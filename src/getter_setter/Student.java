package getter_setter;

import java.awt.desktop.SystemSleepEvent;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        // 학생 점수가 바뀌게 되면 변경은 불가능하다.
        // 왜? score가 private으로 되어있기 때문이다.
        this.name = name;
        this.score = score;
    }

    public void getInfo() {
        System.out.println("--getInfo()--");
        System.out.println("name : " + name);
        System.out.println("score : " + score);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        // 중간에 점수가 변경될 수 있으므로 setter를
        // main class에서 호출한 다음 setScore에 인자로 담아서 호출 하면 된다.
        if (score > 50) {
            this.score = score;
        }
    }
}
