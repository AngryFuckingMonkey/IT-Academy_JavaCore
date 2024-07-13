package homeworks.additionalTasks.lesson012.fruits;

public class Market {

    public static void main(String[] args) {

        Bucket bucket = new Bucket();

        Fruit firstApple = new Apple(0.54f);
        Fruit secondApple = new Apple(0.23f);
        Fruit firstPear = new Pear(0.23f);
        Fruit secondPear = new Pear(0.19f);
        Fruit firstApricot = new Apricot(0.23f);
        Fruit secondApricot = new Apricot(0.28f);

        bucket.addFruit(firstApple);
        bucket.addFruit(secondApple);
        bucket.addFruit(firstPear);
        bucket.addFruit(secondPear);
        bucket.addFruit(firstApricot);
        bucket.addFruit(secondApricot);

        bucket.showAllFruit();

        System.out.println(bucket.getAllFruitCost());
        System.out.println(bucket.getAllApplesCost());
        System.out.println(bucket.getAllPearsCost());
        System.out.println(bucket.getAllApricotsCost());

    }

}
