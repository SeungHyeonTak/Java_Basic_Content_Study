package DesignPattern.absFac.Ex2.concrete;

import DesignPattern.absFac.Ex2.abst.GuiFac;
import DesignPattern.absFac.Ex2.linux.LinuxGuiFac;
import DesignPattern.absFac.Ex2.mac.MacGuiFac;
import DesignPattern.absFac.Ex2.win.WinGuiFac;

public class FactoryInstance {
    public static GuiFac getGuiFac() {
        return switch (getOsCode()) {
            case 0 -> new MacGuiFac();
            case 1 -> new LinuxGuiFac();
            case 2 -> new WinGuiFac();
            default -> null;
        };
    }

    private static int getOsCode() {
        if (System.getProperty("os.name").equals("Mac OS X")) {
            return 0;
        }
        return 1;
    }
}

