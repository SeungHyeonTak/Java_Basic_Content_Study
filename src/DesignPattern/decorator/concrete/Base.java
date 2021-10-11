package DesignPattern.decorator.concrete;

import DesignPattern.decorator.abst.IBeverage;

public class Base implements IBeverage {
    // Component의 실질적인 인스턴스의 부분이다.
    @Override
    public int getTotalPrice() {
        // 아무것도 없는 경우라 0원이 측정된다.
        return 0;
    }
}
