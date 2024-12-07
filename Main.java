public class Main {
    public static void main(String[] args) {
        // Create users
        User user1 = new User(1, "Alice", "alice@example.com", "S1234", "CS", "password123", "Email");
        user1.register();
        User.login("alice@example.com", "password123");
        user1.updateDetails("Software Engineering");
        user1.resetPassword("newpassword123");

        // Create mentee and test functionality
        Mentee mentee = new Mentee(2, "Bob", "bob@example.com", "S5678", "IT", "menteePass", "SMS", 101);
        mentee.register();
        mentee.searchMentors("AI");
        mentee.sendMentorshipRequest(201);
        mentee.createEvent("Workshop on Data Science");

        // Create mentor and test functionality
        Mentor mentor = new Mentor(3, "Charlie", "charlie@example.com", "S91011", "Data Science", "mentorPass", "Email", 202, "5 years", "IT", "Available");
        mentor.register();
        mentor.scheduleVideoCall("Zoom link: xyz");

        // Test event
        Event event = new Event(301, "Webinar", "Introduction to AI", "2024-12-01 10:00 AM");
        event.trackAttendance();

        // Test study material
        StudyMaterial material = new StudyMaterial(401, "Data Structures Guide");
        material.create();
        material.share(2);

        // Test file exchange
        FileExchange exchange = new FileExchange(501, 1, 2, "path/to/file.pdf");
        exchange.sendFile();

        // Test message
        Message message = new Message(601, 1, 3, "Hello, Charlie!", "2024-12-07 09:00 AM");
        message.send();

        // Test feedback
        Feedback feedback = new Feedback(701, 202, 101, 5, "Great mentorship session!");
        feedback.submit();

        // Test suggestion
        Suggestion suggestion = new Suggestion(801, 1, "Feature", "Add a dark mode option");
        suggestion.create();
    }
}