package com.nanospring;

import badcode.Engine;

public class Car {

    @Nanoannotation
    private Engine engine;

    public Car() {
        System.out.println("create car");
    }

    public void move() {
        System.out.println("move");
        engine.start();
    }

}
