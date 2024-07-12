package homeworks.lesson9;

public class Bus extends Car {

    @Override
    public String toString() {
        return "Автобус " + super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    Bus(String brand, String model, int vehicleYear, int doorCount, String engine) {
        super(brand, model, vehicleYear, doorCount, engine);
    }
}
