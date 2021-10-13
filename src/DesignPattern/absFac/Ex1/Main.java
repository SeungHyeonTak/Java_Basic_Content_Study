package DesignPattern.absFac.Ex1;

import DesignPattern.absFac.Ex1.abst.BikeFactory;
import DesignPattern.absFac.Ex1.abst.Body;
import DesignPattern.absFac.Ex1.gt.GtBikeFactory;
import DesignPattern.absFac.Ex1.sam.SamFactory;

public class Main {
    public static void main(String[] args) {
        BikeFactory samFactory = new SamFactory();
        BikeFactory gtFactory = new GtBikeFactory();

        Body samFactoryBody = samFactory.createBody();
        Body gtFactoryBody = gtFactory.createBody();

        System.out.println(samFactoryBody.getClass());
        System.out.println(gtFactoryBody.getClass());
    }
}
