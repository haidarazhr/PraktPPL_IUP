import java.util.Date;
import java.util.ArrayList;

public class Tutors {
    private User name;
    private Date firstDate; 
    private Date endDate; 
    private ArrayList<User> tutoredBy;

    public ArrayList<User> getTutoredBy() {
        return this.tutoredBy;
    }

    public void addTutoredBy(User tutoredBy) {
        this.tutoredBy.add(tutoredBy);
    }
    
}
