package generic;

import java.util.ArrayList;

public class GenericClass2 {
    public static class GenericTest1<T> {
        public T info;
        public void get(T a, T b) {
            T result;
            T result2;
            result = a;
            result2 = b;
        }
    }
    public static void main(String[] args) {
        GenericTest1<Integer> generic = new GenericTest1<Integer>();
        generic.info = 1;
        generic.get(1, 2);
    }
}
