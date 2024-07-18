package homeworks.lesson011;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class Util {

    public static final String PRODUCTS_MAIN_MENU = """
        
        Welcome, adventurer!
    1 - show list of products
    2 - add a product
    3 - delete a product
    0 - exit
    """;

    public static final String ORDERS_MAIN_MENU = """
        
        Welcome, adventurer!
    1 - show list of orders
    2 - add an order
    3 - delete a order
    0 - exit
    """;

    public static final String CHOISE = "Your choice ";

    public static final File PRODUCTS_FILE = Path.of("src", "resources", "products.txt").toFile();
    public static final File ORDERS_FILE = Path.of("src", "resources", "orders.txt").toFile();

    public static void createProductsFile() {
        try {
            if(!Files.exists(Path.of("src", "resources"))) {
                Files.createDirectory(Path.of("src", "resources"));
            }
            Files.createFile(Path.of("src", "resources", "products.txt"));
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void createOrdersFile() {
        try {
            if(!Files.exists(Path.of("src", "resources"))) {
                Files.createDirectory(Path.of("src", "resources"));
            }
            Files.createFile(Path.of("src", "resources", "orders.txt"));
        } catch (IOException e) {
            e.getMessage();
        }
    }

    Util(){}

}
