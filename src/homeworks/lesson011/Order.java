package homeworks.lesson011;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Order {

    private UUID orderId;
    private List<Product> productsList;
    private Date orderingDate;

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

    @Override
    public String toString() {
        return "Order ID " + orderId + ", ordering date " + Order.simpleDateFormat.format(orderingDate)
                + ", list of products " + productsList;
    }

    public Order() {
        orderId = UUID.randomUUID();
        orderingDate = new Date();
    }

}
