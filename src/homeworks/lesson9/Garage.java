package homeworks.lesson9;

import java.util.HashMap;

public class Garage {

    private HashMap<Car, Integer> cars;

    public HashMap<Car, Integer> getCars() {
        return cars;
    }

    public void parking(Car car) {
        if (equalsCarsCount(car) != 0) {
            for(Car tempCar: cars.keySet()) {
                if(car.equals(tempCar)) {
                    cars.replace(tempCar, equalsCarsCount(car) + 1);
                    break;
                }
            }
        } else {
            cars.put(car, 1);
        }
    }

    public void departure(Car car) {
        if(cars.get(car) == 1) {
            cars.remove(car);
        } else {
            cars.replace(car, equalsCarsCount(car));
        }
    }

    public int certainTypeAutoCounter(Car car) {
        int certainTypeAutoNumber = 0;
        for(Car tempCar: cars.keySet()) {
            if(car.getClass().equals(tempCar.getClass())) {
                certainTypeAutoNumber += cars.get(tempCar);
            }
        }
        return certainTypeAutoNumber;
    }

    private int equalsCarsCount(Car car) {
        int equalsCarsCount = 0;
        for(Car tempCar: cars.keySet()) {
            if(car.equals(tempCar)) {
                equalsCarsCount++;
            }
        }
        return equalsCarsCount;
    }

    public void showAllCars() {
        for(Car tempCar: cars.keySet()) {
            System.out.println(tempCar);
        }
    }

    Garage() {
        cars = new HashMap<>();
    }

}
