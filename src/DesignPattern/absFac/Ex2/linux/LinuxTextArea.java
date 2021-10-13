package DesignPattern.absFac.Ex2.linux;

import DesignPattern.absFac.Ex2.abst.TextArea;

public class LinuxTextArea implements TextArea {
    @Override
    public String getText() {
        return "리눅스 TextArea";
    }
}
