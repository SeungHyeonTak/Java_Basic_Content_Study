package generic;

import java.util.ArrayList;

public class Main {
    public static class GenericType<T> {
        private T genericType;

        public T getGenericType() {
            return genericType;
        }

        public void setGenericType(T genericType) {
            this.genericType = genericType;
        }
    }

    public static void main(String[] args) {
//        GenericType<String> gt = new GenericType<String>();
//        gt.setGenericType("가나다라");
//        String str = gt.getGenericType();

        GenericType<Integer> gt2 = new GenericType<Integer>();
        gt2.setGenericType(123);
        Integer str = gt2.getGenericType();
        System.out.println(str);
    }
}

