package homeworks.lesson9;

import java.util.HashMap;

public class Garage {

    private final HashMap<Car, Integer> CARS = new HashMap<>();

    public void parking(Car car) {
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

    public void departure(Car car) {
        if(CARS.get(car) == 1) {
            CARS.remove(car);
        } else {
            CARS.replace(car, CARS.get(car) - 1);
        }
    }

    public int certainTypeAutoCounter(Car car) {
        int certainTypeAutoNumber = 0;
        for(Car tempCar: CARS.keySet()) {
            if(car.getClass().equals(tempCar.getClass())) {
                certainTypeAutoNumber += CARS.get(tempCar);
            }
        }
        return certainTypeAutoNumber;
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
