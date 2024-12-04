import java.util.ArrayList;
import java.util.List;

public class Cart {
    private String userId;
    private String cartId;
    private List<CartItem> items;

    public Cart(String userId, String cartId) {
        this.userId = userId;
        this.cartId = cartId;
        this.items = new ArrayList<CartItem>();
    }
    public void addItem(Product product,int quantity){
        items.add(new CartItem(quantity,"I-"+System.currentTimeMillis(),product));
        product.setStock(product.getStock()-quantity);
        System.out.println("Item added to cart: "+product.getName());
    }
    public void removeItem(String cartItemId){
        items.removeIf(item->item.getItemId().equals(cartItemId));
    }
    public void clearCart(){
        items.clear();
    }

    public List<CartItem> getItems() {
        return items;
    }
}
