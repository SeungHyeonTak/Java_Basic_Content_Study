package DesignPattern.factoryMethod;

import DesignPattern.factoryMethod.concrete.HpCreator;
import DesignPattern.factoryMethod.concrete.MpCreator;
import DesignPattern.factoryMethod.framework.Item;
import DesignPattern.factoryMethod.framework.ItemCreate;

public class Main {
    public static void main(String[] args) {
        ItemCreate create;
        Item item;

        create = new HpCreator();
        item = create.create();
        item.use();

        create = new MpCreator();
        item = create.create();
        item.use();
    }
}
