import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String phoneNumber;
    private String  id;
    private List<MemberLog> memberLogs;

    public Member(String name, String phoneNumber, String id) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.memberLogs = new ArrayList<MemberLog>();
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getId() {
        return id;
    }

    public List<MemberLog> getMemberLogs() {
        return memberLogs;
    }
    public void addMemberLog(Member member){
        memberLogs.add(new MemberLog(member.getName(),member.getPhoneNumber()));
    }
}
