package homeworks.lesson6;

public class Horse extends Animal {

    private String food = "трава";
    private String location = "луг";
    private String hoofCondition = "Копыта не стёрты";

    @Override
    protected void makeNoise() {
        System.out.println("Конь ест");;
    }

    @Override
    protected void eat() {
        System.out.println("Конь ржёт");;
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

    public String getHoofCondition() {
        return hoofCondition;
    }

    public void setHoofCondition(String hoofCondition) {
        this.hoofCondition = hoofCondition;
    }
}
