import javax.management.Notification;
import java.util.ArrayList;
import java.util.List;

public class User {
    private final String userId;
    private String name;
    private String email;
    private List<Post> posts;
    private List<User> followers;
    private List<User> following;
    private List<Notification> notifications;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.posts = new ArrayList<Post>();
        this.followers = new ArrayList<User>();
        this.following = new ArrayList<User>();
        this.notifications = new ArrayList<Notification>();
    }

    public void follow(User user){
        followers.add(user);
    }
    public void unfollow(User user){
        followers.remove(user);
    }
    public void createPost(String content,PrivacySetting privacySetting){
        Post post=new Post(this,content,privacySetting);
        posts.add(post);
    }
    public List<User> searchUsers(String keyword,List<User> allUsers){
        List<User> res=new ArrayList<>();
        for(User user:allUsers){
            if(user.getName().toLowerCase().contains(keyword.toLowerCase())){
                res.add(user);
            }
        }
        return res;
    }
    public void receiveNotification(Notification notification){
        notifications.add(notification);
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public List<User> getFollowing() {
        return following;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }
}
