import java.util.Date;
import java.util.ArrayList;

public class Tutored {
    private User name;
    private Date firstDate; 
    private Date endDate; 
    private ArrayList<User> tutoredUsers;

    public ArrayList<User> getTutoredUsers() {
        return this.tutoredUsers;
    }

    public void addTutoredUser(User tutoredUsers) {
        this.tutoredUsers.add(tutoredUsers);
    }
}
