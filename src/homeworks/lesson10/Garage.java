package homeworks.lesson10;

import java.util.HashMap;

public class Garage {

    private final HashMap<Car, Integer> CARS = new HashMap<>();

    public void parking(Car car) throws CarIsBrokenException {
        if(car.isBroken) {
            throw new CarIsBrokenException("Car is broken! It can't move!");
        }
        if (equalsCarsCount(car) != 0) {
            for(Car tempCar: CARS.keySet()) {
                if(car.equals(tempCar)) {
                    CARS.replace(tempCar, CARS.get(tempCar) + 1);
                    break;
                }
            }
        } else {
            CARS.put(car, 1);
        }
    }

    public void departure(Car car) throws CarIsBrokenException {
        if(car.isBroken) {
            throw new CarIsBrokenException("Car is broken! It can't move!");
        }
            if(CARS.get(car) == 1) {
                CARS.remove(car);
            } else {
                CARS.replace(car, CARS.get(car) - 1);
            }
        }

    private int equalsCarsCount(Car car) {
        int equalsCarsCount = 0;
        for(Car tempCar: CARS.keySet()) {
            if(car.equals(tempCar)) {
                equalsCarsCount++;
            }
        }
        return equalsCarsCount;
    }

    public void showAllCars() {
        for(Car tempCar: CARS.keySet()) {
            System.out.println(tempCar);
        }
    }
}
