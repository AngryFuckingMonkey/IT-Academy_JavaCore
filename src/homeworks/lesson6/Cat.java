package homeworks.lesson6;

public class Cat extends Animal {

    private String food = "мясо";
    private String location = "лес";
    private int treeClimbingTime = 4;

    @Override
    protected void makeNoise() {
        System.out.println("Кот мяукает");;
    }

    @Override
    protected void eat() {
        System.out.println("Кот ест");;
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

    public int getTreeClimbingTime() {
        return treeClimbingTime;
    }

    public void setTreeClimbingTime(int treeClimbingTime) {
        this.treeClimbingTime = treeClimbingTime;
    }
}
