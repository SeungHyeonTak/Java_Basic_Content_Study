package DesignPattern.decorator.abst;

abstract public class AbstAdding implements IBeverage {
    // component와 장식을 동일시 해주는 역할을 한다.
    private IBeverage base;

    // 아래 생성자를 통해 IBeverage를 초기화 해주었다.
    // 해당 의미는 AbstAdding도 IBeverage처럼 행동 할 수 있다는 의미이다.
    public AbstAdding(IBeverage base) {
        super();
        this.base = base;
    }

    @Override
    public int getTotalPrice() {
        return base.getTotalPrice();
    }

    protected IBeverage getBase() {
        return base;
    }
}
