package homeworks.lesson9;

public abstract class Car {

    protected String brand;
    protected String model;
    protected int vehicleYear;
    protected int doorCount;
    protected String engine;

    protected boolean equals(Car car) {
        if (brand.equals(car.brand) && model.equals(car.model) && vehicleYear == car.vehicleYear && doorCount == car.doorCount && engine.equals(car.engine)) {
            return true;
        } else {
            return false;
        }
    };

    public int hashCode() {
        return brand.hashCode() + model.hashCode() + vehicleYear + doorCount + engine.hashCode();
    };

    public String toString() {
        return brand + ", модель " + model + ", год выпуска " + vehicleYear + ", количество дверей " + doorCount + ", двигатель " + engine;
    };

    Car(String brand, String model, int vehicleYear, int doorCount, String engine) {
        this.brand = brand;
        this.model = model;
        this.vehicleYear = vehicleYear;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    Car() {}

}
