package homeworks.lesson011;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrdersMenu extends Menu {

    public void start() {
        if(!Util.ORDERS_FILE.exists()) {
            Util.createOrdersFile();
        }
        while(isActive) {
            System.out.println(Util.ORDERS_MAIN_MENU);
            System.out.print(Util.CHOISE);
            doUserSelection(SCANNER.nextInt());
        }
    }

    protected void doUserSelection(int userSelection) {
        switch (userSelection) {
            case 0: close(); break;
            case 1: showListOfOrders(); break;
            case 2: addOrder(); break;
            case 3: deleteOrder(); break;
            default:
                System.out.println("Wrong selection");
        }
    }

    private void showListOfOrders() {
        try (BufferedReader reader = new BufferedReader(new FileReader(Util.ORDERS_FILE))) {
            String orders = reader.lines().collect(Collectors.joining(System.lineSeparator()));
            System.out.println(orders);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void addOrder() {
        Order order = new Order();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Util.ORDERS_FILE, true))) {
            writer.write(order.toString() + System.lineSeparator());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<String> getPreservedOrders(String deletingOrder) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(Util.ORDERS_FILE))) {
            while(reader.ready()) {
                String line = reader.readLine();
                if(!line.contains(deletingOrder)) {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    private void deleteOrder() {
        System.out.print("Write the ID of the order you would like to remove: ");
        List<String> lines = getPreservedOrders(SCANNER.next());
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Util.ORDERS_FILE, true))) {
            Files.writeString(Util.ORDERS_FILE.toPath(), "");
            for(String writedLine: lines) {
                writer.write(writedLine + System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
