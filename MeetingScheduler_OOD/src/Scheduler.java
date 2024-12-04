import java.time.LocalDateTime;
import java.util.List;

public class Scheduler {

    public Meeting createMeeting(String meetId, List<User> participants, LocalDateTime startTime,LocalDateTime endTime,MeetingType type,String agenda){
        Meeting meeting=new Meeting(meetId,startTime,endTime,participants,agenda,type);
        notifyParticipants(meeting,"Meeting Scheduled: "+meeting.getAgenda());
        return meeting;
    }
    public void rescheduleMeeting(Meeting meeting,LocalDateTime newStartTime,LocalDateTime newEndTime){
        meeting.setStartTime(newStartTime);
        meeting.setEndTime(newEndTime);
        notifyParticipants(meeting,"Meeting rescheduled to: "+meeting.getStartTime()+" till "+meeting.getEndTime()+" agenda:"+meeting.getAgenda());
    }

    public void cancelMeeting(Meeting meeting){
        notifyParticipants(meeting,"Meeting "+meeting.getMeetId()+" is cancelled"+" ,agenda: "+meeting.getAgenda());
    }

    public void notifyParticipants(Meeting meeting,String message){
       EmailNotification emailNotification=new EmailNotification();
       for(User participant:meeting.getParticipants()){
           emailNotification.sendNotification(participant,message);
       }
    }
}
