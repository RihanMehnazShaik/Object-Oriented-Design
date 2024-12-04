import java.util.List;

public class VehicleLog {
    private String id;
    private String location;
    private String msg;


    public VehicleLog(String id, String location,String msg) {
        this.id = id;
        this.location = location;
        this.msg=msg;
    }

    public String getMsg() {
        return msg+" vehicle id: "+id+" location: "+location;
    }
}
