import badcode.Car;

public class Main {

    public  static void main(String... args) {
       Nanospring  nanospring = new Nanospring("");
        Car car = nanospring.getBean(Car.class);

       // car.move();
    }
}
