package DesignPattern.absFac.Ex1.gt;

import DesignPattern.absFac.Ex1.abst.BikeFactory;
import DesignPattern.absFac.Ex1.abst.Body;
import DesignPattern.absFac.Ex1.abst.Wheel;

public class GtBikeFactory  implements BikeFactory {
    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
