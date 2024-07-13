package homeworks.additionalTasks.lesson012.fruits;

public class Pear extends Fruit {

    final static float PRICE = 5.0f;

    @Override
    protected float getFruitCost() {
        return this.weight * PRICE;
    }

    @Override
    public String toString() {
        return "Pear{" +
                "weight=" + weight +
                '}';
    }

    public Pear(float weight) {
        this.weight = weight;
    }

}
