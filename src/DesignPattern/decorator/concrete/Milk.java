package DesignPattern.decorator.concrete;

import DesignPattern.decorator.abst.AbstAdding;
import DesignPattern.decorator.abst.IBeverage;

public class Milk extends AbstAdding {
    public Milk(IBeverage meterial) {
        super(meterial);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + 50;
    }
}
