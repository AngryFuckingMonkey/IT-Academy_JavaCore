package homeworks.lesson10;

import java.util.Objects;
import java.util.Scanner;
import java.util.UUID;

public class Car {

    protected final UUID CAR_NUMBER;
    protected int vehicleYear;
    protected boolean isBroken;

    @Override
    public int hashCode() {
        return Objects.hash(CAR_NUMBER);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return vehicleYear == car.vehicleYear;
    }

    @Override
    public String toString() {
        return "Авто " + vehicleYear +  " года выпуска";
    }

    Car() {
        System.out.print("Введите год изготовления автомобиля: ");
        Scanner scanner = new Scanner(System.in);
        try {
            vehicleYear = scanner.nextInt();
            if(vehicleYear < 1885 || vehicleYear > 2024) {
                throw new DefinitelyWrongVehicleYearException("It's really wrong car manufacturing year");
            }
        } catch (DefinitelyWrongVehicleYearException e) {
            System.out.println(e.getMessage());
            while(vehicleYear < 1885 || vehicleYear > 2024) {
                System.out.print("Please try again: ");
                vehicleYear = scanner.nextInt();
            }
        } finally {
            System.out.println("Alrighty then!");
            CAR_NUMBER = UUID.randomUUID();
        }
    }
}
