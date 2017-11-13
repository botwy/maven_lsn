package com.nanospring;


import com.nanospring.pojo.Car;

public class Main {

    public  static void main(String... args) throws InstantiationException, IllegalAccessException {
       Nanospring  nanospring = new Nanospring("com.nanospring.pojo");
        Car car = nanospring.getBean(Car.class);

        car.move();
    }
}
