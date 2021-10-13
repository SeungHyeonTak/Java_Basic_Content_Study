package DesignPattern.absFac.Ex2.win;

import DesignPattern.absFac.Ex2.abst.Button;
import DesignPattern.absFac.Ex2.abst.GuiFac;
import DesignPattern.absFac.Ex2.abst.TextArea;

public class WinGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WinTextArea();
    }
}
