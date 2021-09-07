package generic;

public class GenericClass3 {
//    public static class StudentInfo {
//        public int grade;
//
//        public StudentInfo(int grade) {
//            // 생성자
//            this.grade = grade;
//        }
//    }
//
//    public static class StudentPerson {
//        public StudentInfo info;
//
//        public StudentPerson(StudentInfo info) {
//            // 생성자
//            this.info = info;
//        }
//    }
//
//    public static class EmployeeInfo {
//        public int rank;
//
//        public EmployeeInfo(int rank) {
//            // 생성자
//            this.rank = rank;
//        }
//    }
//
//    public static class EmployeePerson {
//        public EmployeeInfo info;
//
//        public EmployeePerson(EmployeeInfo info) {
//            // 생성자
//            this.info = info;
//        }
//    }

    public static class StudentInfo {
        public int grade;
        public StudentInfo(int grade) {
            this.grade = grade;
        }
    }

    public static class EmployeeInfo {
        public int rank;
        public EmployeeInfo(int rank) {
            this.rank = rank;
        }
    }

    public static class Person<T> {
        public T info;
        public Person(T info) {
            this.info = info;
        }
    }

    public static void main(String[] args) {
        Person<EmployeeInfo> p = new Person<EmployeeInfo>(new EmployeeInfo(1));
        EmployeeInfo e = p.info ;
        System.out.println(e.rank);

//        StudentInfo si = new StudentInfo(2);
//        StudentPerson sp = new StudentPerson(si);
//        System.out.println(sp.info.grade);
//
//        EmployeeInfo ei = new EmployeeInfo(1);
//        EmployeePerson ep = new EmployeePerson(ei);
//        System.out.println(ep.info.rank);

    }
}
