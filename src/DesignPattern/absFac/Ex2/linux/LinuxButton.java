package DesignPattern.absFac.Ex2.linux;

import DesignPattern.absFac.Ex2.abst.Button;

public class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("리눅스 버튼");
    }
}
