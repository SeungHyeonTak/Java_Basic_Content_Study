package ObjectPackage;

public class Main {
    static class Student {
        String name;

        public Student(String name) {
            this.name = name;
        }

        public boolean equals(Object obj) {
            Student _obj = (Student) obj;
            return name == _obj.name;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Kim");
        Student s2 = new Student("Kim");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
