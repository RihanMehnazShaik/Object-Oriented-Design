public class EmailNotification implements Notification{
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Sending Notification to "+user.getEmail()+" : "+message);
    }
}
