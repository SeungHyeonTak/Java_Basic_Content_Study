package DesignPattern.templateMethod;

import DesignPattern.templateMethod.dp.AbstGameConnectionHelper;
import DesignPattern.templateMethod.dp.DefaultGameConnectionHelper;

public class Main {
    public static void main(String[] args) {
        AbstGameConnectionHelper helper = new DefaultGameConnectionHelper();
        helper.requestConnection("아이디 암호 등 접속 정보");
    }
}
