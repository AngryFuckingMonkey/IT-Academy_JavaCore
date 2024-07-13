package homeworks.additionalTasks.lesson012.cookable;

public class Test {

    public static void main(String[] args) {

        Food food = new Food();
        food.prepare(new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("Bake some " + str);
            }
        }, "apples");

    }

}
