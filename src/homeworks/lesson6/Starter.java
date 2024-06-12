package homeworks.lesson6;

public class Starter {

    public static void main(String[] args) {

        Animal[] animals = {new Dog(), new Cat(), new Horse()};
        Vet vet = new Vet();

        for (Animal animal: animals) {
            vet.treatAnimal(animal);
        }

    }

}
