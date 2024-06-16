package homeworks.lesson4;

public class Starter {

    public static void main(String[] args) {

        int count = 0;

        while(count < 10) {
            Cat cat = new Cat();
            cat.showCatInfo();
            count++;
        }

        System.out.println();

        for (count = 0; count < 10; count++) {
            Cat cat = new Cat();
            cat.setRandomName();
            cat.setRandomAge();
            cat.showCatInfo();
        }

        System.out.println();

        do {
            Cat cat = new Cat(Cat.rand.nextInt(28) + 1, Cat.CATS_NAMES[Cat.rand.nextInt(10)]);
            cat.showCatInfo();
            count--;
        } while(count > 0);

        System.out.println();

        Cat[] arrayOfCats = new Cat[5];

        for(Cat cat: arrayOfCats) {
            cat = new Cat();
            cat.setRandomName();
            cat.setRandomAge();
            cat.showCatInfo();
        }
    }
}
