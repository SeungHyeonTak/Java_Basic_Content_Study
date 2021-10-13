package DesignPattern.absFac.Ex2.mac;

import DesignPattern.absFac.Ex2.abst.Button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("맥 버튼 클릭");
    }
}
