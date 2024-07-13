package homeworks.additionalTasks.lesson012.fruits;

public class Apple extends Fruit {

    final static float PRICE = 3.0f;

    @Override
    protected float getFruitCost() {
        return this.weight * PRICE;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }

    public Apple(float weight) {
        this.weight = weight;
    }

}
