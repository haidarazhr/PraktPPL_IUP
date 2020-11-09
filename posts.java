public class posts {
    private User writer;
    private Date postDate;
    private ArrayList<String> content;
    
    public posts() {
        this.writer = new writer;
        this.postDate = new postDate;
        this.content = new ArrayList<>();
    }
    
    public void addUserWriter(User writers) {
        this.User.add(writers);
    }
    
    public void addPostContent(String newContent){
        this.posts.add(newContent);
    }
    
    public String toString() {
        return "This content was made by " + this.writer() + " with overview content: " + this.content();
    }
}




