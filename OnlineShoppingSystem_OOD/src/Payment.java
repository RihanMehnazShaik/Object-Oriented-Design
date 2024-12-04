public class Payment {
    private String paymentId;
    private String method;

    public Payment(String paymentId, String method) {
        this.paymentId = paymentId;
        this.method = method;
    }
    public void processPayment(){
        System.out.println("Payment processed via: "+method);
    }
}
