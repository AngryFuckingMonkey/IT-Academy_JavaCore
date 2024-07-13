package homeworks.additionalTasks.lesson012.fruits;

public class Apricot extends Fruit {

    final static float PRICE = 7.0f;

    @Override
    protected float getFruitCost() {
        return this.weight * PRICE;
    }

    @Override
    public String toString() {
        return "Apricot{" +
                "weight=" + weight +
                '}';
    }

    public Apricot(float weight) {
        this.weight = weight;
    }

}
