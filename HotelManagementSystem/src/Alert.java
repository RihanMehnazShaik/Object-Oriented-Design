import java.util.Timer;
import java.util.TimerTask;

public class Alert {
    public void sendBookingAlert(Booking booking){
        System.out.println("Remainder: your check-in date is approaching for "+booking.getRoom().getNumber());
    }
    public void sendCancellationAlert(Booking booking){
        System.out.println("Remainder: your booking has been cancelled for "+booking.getRoom().getNumber());
    }
    public void sendSpecialRequestAlert(Booking booking){
        System.out.println("Remainder: your check-in date is approaching for "+booking.getRoom().getNumber());
    }
    public void scheduleCheckInTimer(Booking booking,int daysBefore){
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                sendBookingAlert(booking);
            }
        },daysBefore*24*60*60*1000L);
    }
}
