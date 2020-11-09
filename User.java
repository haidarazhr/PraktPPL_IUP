public class User {
    private String name;
    private String faculty;
    private String major;
    private int semester;
    private int age;
    private boolean isMentor;

    public User(String initialName, String initialFaculty, String initialMajor) {
        this.name = initialName;
        this.age = 0;
        this.faculty = initialFaculty;
        this.major = initialMajor;
        this.semester = 0;
        this.isMentor = false;
    }

    public void printUserBasic() {
        System.out.println(this.name + ", age " +   this.age + " years, from " + this.faculty + ", " + this.major + ", semester = ", this.semester);
    }

    public void printUserMentor(){
        System.out.println(this.name + "'s mentor status is = " + this.isMentor);
    }
    public String getName() {
        return this.name;
    }
    
    public boolean getMentorStatus(){
        return this.isMentor;
    }
}