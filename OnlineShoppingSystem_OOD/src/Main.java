public class Main {
    public static void main(String[] args) {
        Buyer b1=new Buyer("B001","mini","mini@gmail.com");
        Admin a1=new Admin("A001","tanu","tanu@yahoo.com");
        b1.signup();
        b1.login();
        a1.signup();
        a1.login();
        Product p1=new Product("Laptop","P001",50,1000,"Electronics");
        Product p2=new Product("Smartphone","P002",30,500,"Electronics");
        Product p3=new Product("Tshirt","P003",100,20,"Apparel");
        a1.addProduct(p1);
        a1.addProduct(p2);
        a1.addProduct(p3);
        Cart c=new Cart("B001","C001");
        c.addItem(p1,1);
        c.addItem(p3,6);
        System.out.println("Cart Items:");
        c.getItems().forEach(item->System.out.println(item.getItemId()+" | "+item.getProduct().getName()+" | "+item.getQuantity()));
        Payment payment=new Payment("P001","COD");
        b1.checkOut(c,payment);

    }
}