package homeworks.lesson011;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductsMenu extends Menu {

    public void start() {
        if(!Util.PRODUCTS_FILE.exists()) {
            Util.createProductsFile();
        }
        while(isActive) {
            System.out.println(Util.PRODUCTS_MAIN_MENU);
            System.out.print(Util.CHOISE);
            doUserSelection(SCANNER.nextInt());
        }
    }

    protected void doUserSelection(int userSelection) {
        switch (userSelection) {
            case 0: close(); break;
            case 1: showListOfProducts(); break;
            case 2: addProduct(); break;
            case 3: deleteProduct(); break;
            default:
                System.out.println("Wrong selection");
        }
    }

    private void showListOfProducts() {
        try (BufferedReader reader = new BufferedReader(new FileReader(Util.PRODUCTS_FILE))) {
            String products = reader.lines().collect(Collectors.joining(System.lineSeparator()));
            System.out.println(products);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void addProduct() {
        Product product = new Product();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Util.PRODUCTS_FILE, true))) {
            writer.write(product.toString() + System.lineSeparator());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<String> getPreservedProducts(String deletingProduct) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(Util.PRODUCTS_FILE))) {
            while(reader.ready()) {
                String line = reader.readLine();
                if(!line.contains(deletingProduct)) {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    private void deleteProduct() {
        System.out.print("Write the name or the ID of the product you would like to remove: ");
        List<String> lines = getPreservedProducts(SCANNER.next());
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Util.PRODUCTS_FILE, true))) {
            Files.writeString(Util.PRODUCTS_FILE.toPath(), "");
            for(String writedLine: lines) {
                writer.write(writedLine + System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
