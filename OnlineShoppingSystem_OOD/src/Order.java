import java.util.List;

public class Order {
    private String orderId;
    private String buyerId;
    private List<CartItem> items;
    private String status;
    private Payment payment;

    public Order(String orderId, String buyerId, List<CartItem> items, String status, Payment payment) {
        this.orderId = orderId;
        this.buyerId = buyerId;
        this.items = items;
        this.status = status;
        this.payment = payment;
    }
    public void updateStatus(String status){
        this.status=status;
    }
}
