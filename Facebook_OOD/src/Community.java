import java.util.ArrayList;
import java.util.List;

public abstract class Community {
    private User owner;
    private List<User> members;
    private String name;

    public Community(User owner, String name) {
        this.owner = owner;
        this.name = name;
        this.members=new ArrayList<>();
    }

    public void addMember(User user){
        members.add(user);
    }
    public void removeMember(User user){
        members.remove(user);
    }
    abstract void postUpdate(String content,User user);
    public User getOwner() {
        return owner;
    }

    public List<User> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }
}
class Group extends Community{
    public Group(User owner,String name) {
        super(owner,name);
    }

    public void postUpdate(String content, User member){
        if(this.getMembers().contains(member)){
            System.out.println("Group post by "+member.getName()+" content: "+content);
        }else{
            System.out.println("Only group members can post");
        }
    }
}
class Page extends Community{
    public Page(User owner,String name){
        super(owner,name);
    }
    public void postUpdate(String content,User member){
        if(this.getOwner().equals(member)){
            System.out.println("Posted by "+member.getName()+" content: "+content);
        }else{
            System.out.println("Only owner can post");
        }
    }
}
