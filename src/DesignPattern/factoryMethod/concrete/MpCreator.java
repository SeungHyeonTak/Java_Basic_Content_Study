package DesignPattern.factoryMethod.concrete;

import DesignPattern.factoryMethod.framework.Item;
import DesignPattern.factoryMethod.framework.ItemCreate;

import java.util.Date;

public class MpCreator extends ItemCreate {
    @Override
    protected void requestItemsInfo() {
        System.out.println("데이터베이스에서 마력 물약의 정보를 가져온다.");
    }

    @Override
    protected void createItemLog() {
        System.out.println("마력 물약을 새로 생성 했습니다." + new Date());
    }

    @Override
    protected Item createItem() {
        return new MpPotion();
    }
}
