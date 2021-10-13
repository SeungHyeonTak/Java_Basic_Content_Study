package DesignPattern.absFac.Ex2.linux;

import DesignPattern.absFac.Ex2.abst.Button;
import DesignPattern.absFac.Ex2.abst.GuiFac;
import DesignPattern.absFac.Ex2.abst.TextArea;

public class LinuxGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}
