package homeworks.lesson6;

public class Dog extends Animal {

    private String food = "мясо";
    private String location = "дом";
    private String doghouseCondition = "Будка новая";

    @Override
    protected void eat() {
        System.out.println("Собака ест");;
    }

    @Override
    protected void makeNoise() {
        System.out.println("Собака гавкает");;
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    public String getDoghouseCondition() {
        return doghouseCondition;
    }

    public void setDoghouseCondition(String doghouseCondition) {
        this.doghouseCondition = doghouseCondition;
    }
}
