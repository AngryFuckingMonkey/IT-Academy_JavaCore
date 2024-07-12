package homeworks.lesson9;

public class Offroader extends Car {

    @Override
    public String toString() {
        return "Внедорожник " + super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    Offroader(String brand, String model, int vehicleYear, int doorCount, String engine) {
        super(brand, model, vehicleYear, doorCount, engine);
    }
}
