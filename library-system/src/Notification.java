package librarysystem;

/**
 * Notifications to the user
 */
public class Notification {

    private User user;
    private String type;
    private String content;


    public Notification(User user, String type, String content) {
        this.user = user;
        this.type = type;
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
