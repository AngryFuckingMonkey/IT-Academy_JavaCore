package homeworks.lesson9;

public class Test {

    public static void main(String[] args) {

        Garage garage = new Garage();

        Car passengerCar1 = new PassengerCar("BMW", "X7", 2010, 5, "V6");
        Car passengerCar2 = new PassengerCar("BMW", "X7", 2010, 5, "V6");
        Car passengerCar3 = new PassengerCar("Toyota", "Cmr-7", 2009, 3, "U4");
        Car bus1 = new Bus("MAN", "B3", 1999, 4, "U8");
        Car bus2 = new Bus("Ikarus", "IK84", 1984, 5, "U8");
        Car bus3 = new Bus("MAZ", "X7", 2010, 4, "V6");
        Car truck1 = new Truck("MAN", "M17", 2000, 4, "V6");
        Car truck2 = new Truck("Volvo", "VV2b", 2004, 5, "V8");
        Car truck3 = new Truck("ZIL", "90M", 1988, 2, "U6");
        Car offroader1 = new Offroader("Toyota", "ORD-20", 2020, 5, "V8");
        Car offroader2 = new Offroader("Volkswagen", "TN-8", 2008, 3, "U6");
        Car offroader3 = new Offroader("Nissan", "XT", 1998, 5, "V6");

        garage.parking(passengerCar1);
        garage.parking(passengerCar2);
        garage.parking(passengerCar3);
        garage.parking(bus1);
        garage.parking(bus2);
        garage.parking(bus3);
        garage.parking(truck1);
        garage.parking(truck2);
        garage.parking(truck3);
        garage.parking(offroader1);
        garage.parking(offroader2);
        garage.parking(offroader3);

        garage.showAllCars();
        System.out.println(garage.certainTypeAutoCounter(passengerCar1));
        System.out.println(garage.certainTypeAutoCounter(bus1));
        System.out.println(garage.certainTypeAutoCounter(truck1));
        System.out.println(garage.certainTypeAutoCounter(offroader1));

        garage.departure(passengerCar1);
        garage.departure(bus3);
        garage.departure(truck2);
        garage.departure(bus1);
        garage.departure(offroader2);
        garage.departure(offroader1);

        garage.showAllCars();
        System.out.println(garage.certainTypeAutoCounter(passengerCar1));
        System.out.println(garage.certainTypeAutoCounter(bus1));
        System.out.println(garage.certainTypeAutoCounter(truck1));
        System.out.println(garage.certainTypeAutoCounter(offroader1));
    }

}
