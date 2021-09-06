package listPackage;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("list size : " + list.size());

        // 데이터 추가
        list.add("Hello");
        list.add("Java");
        list.add("World");
        System.out.println("list.size : " + list.size());
        System.out.println("list : " + list);

        // 데이터 변경
        list.set(1, "C");
        System.out.println("list : " + list);

        // 데이터 추출
        String str = list.get(2);
        System.out.println("str : " + str);

        // 데이터 제거
        str = list.remove(2);
        System.out.println("str : " + str);
        System.out.println("list : " + list);

        // 데이터 전체 제거
        list.clear();
        System.out.println("list : " + list);

        boolean b = list.isEmpty();
        System.out.println("Empty : " + b);

        System.out.println("=============");

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        System.out.println("map.size() : " + map.size());

        // 데이터 추가
        map.put(5, "Hello");
        map.put(6, "Java");
        map.put(7, "World");
        System.out.println("map : " + map);
        System.out.println("map.size() : " + map.size());

        // 데이터 교체
        map.put(6, "C");
        System.out.println("map : " + map);

        // 데이터 추출
        str = map.get(5);
        System.out.println("map.get() : " + str);

        // 데이터 제거
        map.remove(8);
        System.out.println("map : " + map);

        // 특정 데이터 포함 유무
        b = map.containsKey(7);
        System.out.println("map.containsKey : " + b);

        b = map.containsValue("World");
        System.out.println("map.containValue : " + b);

        map.clear();
        System.out.println("map : " + map);

        b = map.isEmpty();
        System.out.println("map.isEmpty : " + b);
    }
}
