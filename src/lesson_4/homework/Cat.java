package lesson_4.homework;

import java.util.Random;

public class Cat {

    private String name = "Кот";
    private int age = 8;
    static final String[] CATS_NAMES = new String[] {"Кот", "Кошак", "Котяш", "Котей", "Котофей", "Псих", "Бешеный", "Безумец", "Шизик", "Маньяк"};
    static Random rand = new Random();

    Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Cat() {

    }

    public void setRandomName() {
        name = CATS_NAMES[rand.nextInt(10)];
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setRandomAge() {
        age = rand.nextInt(28) + 1;
    }

    public void showCatInfo() {
        System.out.println("Имя кота " + this.getName() + ", возраст кота " + this.getAge());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
