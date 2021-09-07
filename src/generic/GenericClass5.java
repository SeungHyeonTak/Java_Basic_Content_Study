package generic;

public class GenericClass5 {
    public interface Info {
        int getLevel();
    }

    public static class EmployeeInfo implements Info {
        public int rank;

        public EmployeeInfo(int rank) {
            this.rank = rank;
        }

        public int getLevel() {
            return this.rank;
        }
    }

    public static class Person<T extends Info> {
        public T info;

        public Person(T info) {
            this.info = info;
        }
    }

    public static void main(String[] args) {
        EmployeeInfo e = new EmployeeInfo(1);
        Person p = new Person(e);
//        Person<String> p2 = new Person<String>("부장");
    }
}
