public class Product {
    private String name;
    private String productId;
    private int stock;
    private double price;
    private String category;

    public Product(String name, String productId, int stock, double price, String category) {
        this.name = name;
        this.productId = productId;
        this.stock = stock;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getProductId() {
        return productId;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
    public void addReview(Review review){
        System.out.println("Review added : "+review.getComment());
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
