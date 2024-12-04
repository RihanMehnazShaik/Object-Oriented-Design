import java.time.LocalDateTime;
import java.util.List;

enum MeetingType{
    IN_PERSON,VIRTUAL,HYBRID;
}
public class Meeting {
    private String meetId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<User> participants;
    private String agenda;
    private MeetingType type;

    public Meeting(String meetId, LocalDateTime startTime, LocalDateTime endTime, List<User> participants, String agenda, MeetingType type) {
        this.meetId = meetId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.participants = participants;
        this.agenda = agenda;
        this.type = type;
    }

    public String getMeetId() {
        return meetId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public String getAgenda() {
        return agenda;
    }

    public MeetingType getType() {
        return type;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
