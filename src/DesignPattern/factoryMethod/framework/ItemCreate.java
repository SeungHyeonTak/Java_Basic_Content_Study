package DesignPattern.factoryMethod.framework;

public abstract class ItemCreate {
    public Item create() {
        Item item;

        requestItemsInfo();  // 아이템 정보
        item = createItem();  // 아이템 생성
        createItemLog();  // 아이템 생성에 대한 정보

        return item;
    }

    abstract protected void requestItemsInfo();

    abstract protected void createItemLog();

    abstract protected Item createItem();
}
