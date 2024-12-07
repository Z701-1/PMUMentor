import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private int userId;
    private String name;
    private String email;
    private String studentId;
    private String major;
    private String password;
    private String notificationPreferences;

    private static Map<String, User> users = new HashMap<>(); // For demonstration purposes

    public User(int userId, String name, String email, String studentId, String major, String password, String notificationPreferences) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.studentId = studentId;
        this.major = major;
        this.password = password;
        this.notificationPreferences = notificationPreferences;
    }

    public void register() {
        if (!users.containsKey(email)) {
            users.put(email, this);
            System.out.println("User registered: " + name);
        } else {
            System.out.println("User with this email already exists.");
        }
    }

    public static User login(String email, String password) {
        User user = users.get(email);
        if (user != null && user.password.equals(password)) {
            System.out.println("Login successful for: " + user.name);
            return user;
        } else {
            System.out.println("Invalid login credentials.");
            return null;
        }
    }

    public void updateDetails(String updatedMajor) {
        this.major = updatedMajor;
        System.out.println("User details updated for: " + name);
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Password reset for: " + email);
    }
}
