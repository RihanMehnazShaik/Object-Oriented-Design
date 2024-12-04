import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private String userId;
    private String name;
    private  String email;
    public abstract void signup();
    public abstract void login();

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
class Buyer extends User{
    private List<Order> orderHistory;
    public Buyer(String buyerId,String name,String email){
        super(buyerId,name,email);
        this.orderHistory=new ArrayList<>();
    }
    public void signup(){
        System.out.println("Buyer: "+this.getName()+" signed up");
    }
    public void login(){
        System.out.println("Buyer: "+this.getName()+" logged in");
    }
    public void checkOut(Cart cart,Payment payment){
        Order order=new Order("ORD"+System.currentTimeMillis(),this.getUserId(),cart.getItems(),"Pending",payment);
        orderHistory.add(order);
        payment.processPayment();
        cart.clearCart();
        System.out.println("Order placed successfully!");
    }
    public void viewReccommendations(){
        RecommendationEngine recommendationEngine=new RecommendationEngine();
        recommendationEngine.getRecommendations(this.getUserId());
//        for( Product product:recommendations){
//            System.out.println(product.getName());
//        }
    }
}
class Admin extends User{
    public Admin(String buyerId,String name,String email){
        super(buyerId,name,email);
    }
    public void signup(){
        System.out.println("Admin: "+this.getName()+" signed up");
    }
    public void login(){
        System.out.println("Admin: "+this.getName()+" logged in");
    }
    public void addProduct(Product product){

    }
    public void removeProduct(Product product){

    }
    public void manageUsers(){

    }

}

