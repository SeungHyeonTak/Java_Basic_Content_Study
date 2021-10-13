package DesignPattern.absFac.Ex2.mac;

import DesignPattern.absFac.Ex2.abst.Button;
import DesignPattern.absFac.Ex2.abst.GuiFac;
import DesignPattern.absFac.Ex2.abst.TextArea;

public class MacGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }
}
