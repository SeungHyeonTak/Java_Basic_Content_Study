package generic;

public class GenericClass4 {
    public static class EmployeeInfo {
        public int rank;

        public EmployeeInfo(int rank) {
            this.rank = rank;
        }
    }

    public static class Person<T, X> {
        public T info;
        public X id;

        public Person(T info, X id) {
            this.info = info;
            this.id = id;
        }

//        public <U> void printInfo(U info) {
//            System.out.println(info);
//        }

        public T printInfo(T info) {
            return info;
        }
    }

    public static void main(String[] args) {
        Integer i = 10;
        EmployeeInfo e = new EmployeeInfo(1);
        Person<EmployeeInfo, Integer> person = new Person<EmployeeInfo, Integer>(e, i);
        System.out.println(person.id.intValue());
        person.<EmployeeInfo>printInfo(e);
        person.printInfo(e);
    }
}
