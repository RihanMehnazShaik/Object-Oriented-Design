import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    private List<ShowTime> showTimes;

    public Cinema(String name) {
        this.name = name;
        this.showTimes=new ArrayList<>();
    }
    public void addShowTime(List<ShowTime> showTime){
        showTimes.addAll(showTime);
    }

    public String getName() {
        return name;
    }
}
