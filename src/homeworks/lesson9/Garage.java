package homeworks.lesson9;

import java.util.HashMap;

public class Garage {

    HashMap<Car, Integer> cars;

    void parking(Car car) {
        cars.put(car, equalsCarsCount(car) + 1);
        if(equalsCarsCount(car) > 1) {

        }
    }

    void departure(Car car) {
        for(Car carTemp: cars.keySet()) {
            if(car.equals(carTemp) && cars.get(car) < cars.get(carTemp)) {
                cars.replace(carTemp, cars.get(carTemp), cars.get(carTemp) - 1);
            }
        }
        cars.remove(car);
    }

    int certainTypeAutoCounter(Car car) {
        int certainTypeAutoNumber = 0;
        for(Car tempCar: cars.keySet()) {
            if(car.getClass().equals(tempCar.getClass())) {
                certainTypeAutoNumber++;
            }
        }
        return certainTypeAutoNumber;
    }

    int equalsCarsCount(Car car) {
        int equalsCarsCount = 0;
        for(Car tempCar: cars.keySet()) {
            if(car.equals(tempCar)) {
                equalsCarsCount++;
            }
        }
        return equalsCarsCount;
    }

    Garage() {
        cars = new HashMap<>();
    }

}
