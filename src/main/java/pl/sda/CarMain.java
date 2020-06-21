package pl.sda;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car(new TractorEngine());
        car.startCar();
    }
}

