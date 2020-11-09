public class Admin {
    private String adminID;
    private int adminPass;
    private boolean isAdmin = true; 

    public Admin(String adminID, int adminPass, boolean isAdmin ) {
        this.adminID = adminID;
        this.adminPass = 0;
        this.isAdmin = true;
    }

    public String getAdminID() {
        return this.adminID;
    }
    
    private int getAdminPass(String adminID){
        return this.adminPass;
    }
    
}