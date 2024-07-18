package homeworks.lesson011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Product {

    private UUID productId;
    private String productName;
    private Date productionDate;

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

    @Override
    public String toString() {
        return "Product \"" + productName + "\", ID " + productId
                + ", manufacturing date " + Product.simpleDateFormat.format(productionDate);
    }

    public Product() {
        productId = UUID.randomUUID();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        productName = scanner.nextLine();
        System.out.print("Enter production date (through the point): ");
        try {
            productionDate = simpleDateFormat.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Wrong date format");
        }
    }

}
