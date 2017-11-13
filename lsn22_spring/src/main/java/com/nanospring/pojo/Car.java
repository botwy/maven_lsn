package com.nanospring.pojo;



public class Car {

    @NanoSpringDI
    private Engine engine;

    public Car() {
        System.out.println("create car");
    }

    public Car(Engine engine) {
        this.engine=engine;
        System.out.println("create car constructor2");
    }

    public void move() {
        engine.start();
        System.out.println("move");

    }

}
