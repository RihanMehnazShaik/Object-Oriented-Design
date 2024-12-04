import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //creating users
        User u1=new User("Mini","mini@gmail.com");
        User u2=new User("tanu","tanu@gmail.com");

        //creating a scheduller
        Scheduler scheduler=new Scheduler();

        //creating a meeting
        LocalDateTime startTime=LocalDateTime.now().plusHours(1);
        LocalDateTime endTime=startTime.plusHours(2);
        Meeting meeting1=scheduler.createMeeting("M1", Arrays.asList(u1,u2),startTime,endTime,MeetingType.IN_PERSON,"Chatbot changes");

        LocalDateTime startTime2=LocalDateTime.now().plusHours(1);
        LocalDateTime endTime2=startTime.plusHours(2);
        Meeting meeting2=scheduler.createMeeting("M2", Arrays.asList(u1,u2),startTime,endTime,MeetingType.HYBRID,"Project kickoff");
        startTime2=LocalDateTime.now().plusHours(4);
        endTime2=startTime2.plusHours(2);
        scheduler.rescheduleMeeting(meeting2,startTime2,endTime2);
    }
}