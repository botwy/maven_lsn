package com.nanospring;

import badcode.Car;

public class Main {

    public  static void main(String... args) throws InstantiationException, IllegalAccessException {
       Nanospring  nanospring = new Nanospring("com.nanospring");
        Car car = nanospring.getBean(Car.class);

       // car.move();
    }
}
