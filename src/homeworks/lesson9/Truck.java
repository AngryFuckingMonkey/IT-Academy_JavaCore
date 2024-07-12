package homeworks.lesson9;

public class Truck extends Car {

    @Override
    public String toString() {
        return "Грузовой автомобиль " + super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    Truck(String brand, String model, int vehicleYear, int doorCount, String engine) {
        super(brand, model, vehicleYear, doorCount, engine);
    }
}
