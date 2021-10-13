package DesignPattern.absFac.Ex2.win;

import DesignPattern.absFac.Ex2.abst.TextArea;

public class WinTextArea implements TextArea {
    @Override
    public String getText() {
        return "윈도우 텍스트 에어리어";
    }
}
