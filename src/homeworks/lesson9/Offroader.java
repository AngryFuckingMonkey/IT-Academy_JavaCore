package homeworks.lesson9;

public class Offroader extends Car {

    @Override
    public String toString() {
        return "Внедорожник " + super.toString();
    }

    @Override
    protected boolean equals(Car car) {
        return super.equals(car);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    Offroader(String brand, String model, int vehicleYear, int doorCount, String engine) {
        super(brand, model, vehicleYear, doorCount, engine);
    }

    Offroader() {
        super();
    }
}
