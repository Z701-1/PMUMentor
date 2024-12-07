    class Mentee extends User {
        private int menteeId;

        public Mentee(int userId, String name, String email, String studentId, String major, String password, String notificationPreferences, int menteeId) {
            super(userId, name, email, studentId, major, password, notificationPreferences);
            this.menteeId = menteeId;
        }

        public void searchMentors(String criteria) {
            System.out.println("Searching mentors with criteria: " + criteria);
        }

        public void sendMentorshipRequest(int mentorId) {
            System.out.println("Mentorship request sent to mentor ID: " + mentorId);
        }

        public void createEvent(String eventDetails) {
            if (eventDetails == null || eventDetails.isEmpty()) {
                System.out.println("Error: Event details cannot be null or empty.");
                return;
            }
            System.out.println("Event created with details: " + eventDetails);
            }
        }