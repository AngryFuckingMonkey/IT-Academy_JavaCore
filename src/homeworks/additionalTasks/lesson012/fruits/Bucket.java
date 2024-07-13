package homeworks.additionalTasks.lesson012.fruits;

import java.util.ArrayList;
import java.util.List;

public class Bucket {

    private List<Fruit> fruits = new ArrayList<>();
    private int appleCount;
    private int pearCount;
    private int apricotCount;

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
        if(fruit.getClass() == Apple.class) {
            appleCount++;
        } else if(fruit.getClass() == Pear.class) {
            pearCount++;
        } else if (fruit.getClass() == Apricot.class) {
            apricotCount++;
        }
    }

    public float getAllFruitCost() {
        float allFruitCost = 0.0f;
        for(Fruit fruit: fruits) {
            allFruitCost += fruit.getFruitCost();
        }
        return allFruitCost;
    }

    public float getAllApplesCost() {
        float applesPrice = 0.0f;
        for(Fruit fruit: fruits) {
            if(fruit instanceof Apple) {
                applesPrice += fruit.getFruitCost();
            }
        }
        return applesPrice;
    }

    public float getAllPearsCost() {
        float pearsPrice = 0.0f;
        for(Fruit fruit: fruits) {
            if(fruit instanceof Pear) {
                pearsPrice += fruit.getFruitCost();
            }
        }
        return pearsPrice;
    }

    public float getAllApricotsCost() {
        float apricotsPrice = 0.0f;
        for(Fruit fruit: fruits) {
            if(fruit instanceof Apricot) {
                apricotsPrice += fruit.getFruitCost();
            }
        }
        return apricotsPrice;
    }

    public void showAllFruit() {
        for(Fruit fruit: this.getFruits()) {
            System.out.println(fruit);
        }
    }

}
