package collections;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        array.add("1");
        array.add("2");
        array.add("3");

        for (String i : array) {
            System.out.println(i);
        }

    }
}
