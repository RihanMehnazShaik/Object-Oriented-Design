import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrivacySetting {
    private final Set<User> allowedUsers;

    public PrivacySetting() {
        this.allowedUsers = new HashSet<>();
    }
    public void addAllowedUser(User user){
        allowedUsers.add(user);
    }
    public void removeAllowedUser(User user){
        allowedUsers.remove(user);
    }
    public boolean isVisibleTo(User viewer,User author){
        return allowedUsers.contains(viewer)||viewer.equals(author);
    }
}
