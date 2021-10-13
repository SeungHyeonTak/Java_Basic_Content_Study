package DesignPattern.absFac.Ex2;

import DesignPattern.absFac.Ex2.abst.Button;
import DesignPattern.absFac.Ex2.abst.GuiFac;
import DesignPattern.absFac.Ex2.abst.TextArea;
import DesignPattern.absFac.Ex2.concrete.FactoryInstance;
import DesignPattern.absFac.Ex2.linux.LinuxGuiFac;
import DesignPattern.absFac.Ex2.mac.MacGuiFac;

public class Main {
    public static void main(String[] args) {
        GuiFac fac = FactoryInstance.getGuiFac();
        Button button = fac.createButton();
        TextArea textArea = fac.createTextArea();

        button.click();
        System.out.println(textArea.getText());
//        GuiFac guiFac = new LinuxGuiFac();
//
//        Button button = guiFac.createButton();
//        TextArea textArea = guiFac.createTextArea();
//
//        button.click();
//        System.out.println(textArea.getText());
//
//        GuiFac macFac = new MacGuiFac();
//
//        Button macButton = macFac.createButton();
//        TextArea macTextArea = macFac.createTextArea();
//
//        macButton.click();
//        System.out.println(macTextArea.getText());
    }
}
