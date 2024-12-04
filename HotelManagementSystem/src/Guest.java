public class Guest {
    private String name;
    private String emailId;
    private String phonenumber;
    private String id;

    public Guest(String name, String emailId, String phonenumber, String id) {
        this.name = name;
        this.emailId = emailId;
        this.phonenumber = phonenumber;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getId() {
        return id;
    }
}
