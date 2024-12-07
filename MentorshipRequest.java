class MentorshipRequest {
    private int requestId;
    private int menteeId;
    private int mentorId;
    private String status;

    public MentorshipRequest(int requestId, int menteeId, int mentorId, String status) {
        this.requestId = requestId;
        this.menteeId = menteeId;
        this.mentorId = mentorId;
        this.status = status;
    }
}
