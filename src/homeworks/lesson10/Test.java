package homeworks.lesson10;

public class Test {

    public static void main(String[] args) {

        Garage garage = new Garage();
        Car car1 = new Car();
        car1.isBroken = true;
        try {
            garage.parking(car1);
        } catch(CarIsBrokenException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Don't worry!");
        }

        Rainbow rainbow = new Rainbow();
        rainbow.printColor();

    }
}
