public class Bird {
    private  final BirdType type;

    public Bird(BirdType type) {
        this.type = type;
    }

    public  double getSpeed() {
       return type.getSpeed();
    }
}
