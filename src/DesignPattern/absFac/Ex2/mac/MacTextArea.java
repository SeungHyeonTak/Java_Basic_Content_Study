package DesignPattern.absFac.Ex2.mac;

import DesignPattern.absFac.Ex2.abst.TextArea;

public class MacTextArea implements TextArea {
    @Override
    public String getText() {
        return "맥 텍스트 에어리어";
    }
}
