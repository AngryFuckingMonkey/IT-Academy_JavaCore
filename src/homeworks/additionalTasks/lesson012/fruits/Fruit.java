package homeworks.additionalTasks.lesson012.fruits;

public abstract class Fruit {

    protected float weight;

    protected void printManufacturedInfo() {
        System.out.println("Made in Belarus");
    }

    abstract protected float getFruitCost();

}
