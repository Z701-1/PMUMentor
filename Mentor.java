class Mentor extends User {
    private int mentorId;
    private String experience;
    private String industry;
    private String availability;

    public Mentor(int userId, String name, String email, String studentId, String major, String password, String notificationPreferences, int mentorId, String experience, String industry, String availability) {
        super(userId, name, email, studentId, major, password, notificationPreferences);
        this.mentorId = mentorId;
        this.experience = experience;
        this.industry = industry;
        this.availability = availability;
    }

    public void scheduleVideoCall(String details) {
        System.out.println("Scheduled video call with details: " + details);
    }
}