package homeworks.lesson9;

public class PassengerCar extends Car {

    @Override
    public String toString() {
        return "Легковой автомобиль " + super.toString();
    }

    @Override
    protected boolean equals(Car car) {
        return super.equals(car);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    PassengerCar(String brand, String model, int vehicleYear, int doorCount, String engine) {
        super(brand, model, vehicleYear, doorCount, engine);
    }

    PassengerCar() {
        super();
    }
}
