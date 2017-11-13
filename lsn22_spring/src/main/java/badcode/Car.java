package badcode;

public class Car {

    private Engine engine;

    public Car() {
        engine = new Engine();
        System.out.println("create car");
    }

    public void move() {
        System.out.println("move");
        engine.start();
    }

}
