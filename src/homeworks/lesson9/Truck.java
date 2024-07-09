package homeworks.lesson9;

public class Truck extends Car {

    @Override
    public String toString() {
        return "Грузовой автомобиль " + super.toString();
    }

    @Override
    protected boolean equals(Car car) {
        return super.equals(car);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    Truck(String brand, String model, int vehicleYear, int doorCount, String engine) {
        super(brand, model, vehicleYear, doorCount, engine);
    }

    Truck() {
        super();
    }
}
