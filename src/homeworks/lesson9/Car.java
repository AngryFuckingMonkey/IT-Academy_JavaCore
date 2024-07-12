package homeworks.lesson9;

import java.util.Objects;
import java.util.UUID;

public abstract class Car {
    
    protected final UUID CAR_NUMBER;
    protected String brand;
    protected String model;
    protected int vehicleYear;
    protected int doorCount;
    protected String engine;

    @Override
    public int hashCode() {
        return Objects.hash(CAR_NUMBER);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return brand.equals(car.brand) && model.equals(car.model) && vehicleYear == car.vehicleYear && doorCount == car.doorCount && engine.equals(car.engine);
    }

    @Override
    public String toString() {
        return brand + ", модель " + model + ", год выпуска " + vehicleYear + ", количество дверей " + doorCount + ", двигатель " + engine;
    }

    Car(String brand, String model, int vehicleYear, int doorCount, String engine) {
        this.brand = brand;
        this.model = model;
        this.vehicleYear = vehicleYear;
        this.doorCount = doorCount;
        this.engine = engine;
        CAR_NUMBER = UUID.randomUUID();
    }
}
