package homeworks.lesson9;

public class Bus extends Car {

    @Override
    public String toString() {
        return "Автобус " + super.toString();
    }

    @Override
    protected boolean equals(Car car) {
        return super.equals(car);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    Bus(String brand, String model, int vehicleYear, int doorCount, String engine) {
        super(brand, model, vehicleYear, doorCount, engine);
    }

    Bus() {
        super();
    }
}
