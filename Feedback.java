class Feedback {
    private int feedbackId;
    private int mentorId;
    private int menteeId;
    private int rating;
    private String comments;

    public Feedback(int feedbackId, int mentorId, int menteeId, int rating, String comments) {
        this.feedbackId = feedbackId;
        this.mentorId = mentorId;
        this.menteeId = menteeId;
        this.rating = rating;
        this.comments = comments;
    }

    public void submit() {
        System.out.println("Feedback submitted by mentee ID: " + menteeId + " for mentor ID: " + mentorId);
    }
}
