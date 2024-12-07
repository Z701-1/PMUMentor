class Event {
    private int eventId;
    private String eventType;
    private String eventDetails;
    private String dateTime;

    public Event(int eventId, String eventType, String eventDetails, String dateTime) {
        this.eventId = eventId;
        this.eventType = eventType;
        this.eventDetails = eventDetails;
        this.dateTime = dateTime;
    }

    public void trackAttendance() {
        System.out.println("Tracking attendance for event: " + eventId);
    }
}
