public class CartItem {
    private int quantity;
    private String itemId;
    private Product product;

    public CartItem(int quantity, String itemId, Product product) {
        this.quantity = quantity;
        this.itemId = itemId;
        this.product = product;
    }

    public String getItemId() {
        return itemId;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
