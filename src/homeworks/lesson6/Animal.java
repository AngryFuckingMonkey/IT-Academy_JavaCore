package homeworks.lesson6;

public class Animal {

    protected String food;
    protected String location;

    protected void makeNoise() {
        System.out.println("Животное издаёт звуки");
    }

    protected void eat() {
        System.out.println("Животное ест");
    }

    protected void sleep() {
        System.out.println("Животное спит");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
