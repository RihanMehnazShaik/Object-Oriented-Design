import java.time.LocalDate;

public class Post {
    private final User owner;
    private final String content;
    private final PrivacySetting privacySetting;
    private final LocalDate date;

    public Post(User owner, String content, PrivacySetting privacySetting) {
        this.owner = owner;
        this.content = content;
        this.privacySetting = privacySetting;
        this.date=LocalDate.now();
    }

    public boolean isVisible(User user){
        return privacySetting.isVisibleTo(user,this.owner);
    }

    public String getContent() {
        return content;
    }

    public User getOwner() {
        return owner;
    }
}
