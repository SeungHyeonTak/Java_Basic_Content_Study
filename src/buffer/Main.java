package buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        System.out.println("s : " + s);

//        StringTokenizer st = new StringTokenizer(s);
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        System.out.println("a : " + a + " " + "b : " + b);

        String array[] = s.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
