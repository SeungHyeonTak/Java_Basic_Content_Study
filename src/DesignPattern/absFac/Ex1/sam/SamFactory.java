package DesignPattern.absFac.Ex1.sam;

import DesignPattern.absFac.Ex1.abst.BikeFactory;
import DesignPattern.absFac.Ex1.abst.Body;
import DesignPattern.absFac.Ex1.abst.Wheel;

public class SamFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
