# PMUMentor
Class Descriptions
1. User:  
   Handles core user functionality, including registration, login, updating details, and password reset. Serves as a base class for Mentor and Mentee.

2. Mentee:  
   Extends User. Enables mentees to search for mentors, send mentorship requests, and create events.

3. Mentor:  
   Extends User. Includes functionalities for mentors to schedule video calls and provide mentorship.

4. Event:  
   Represents an event with details like event type, description, and date. Provides functionality for tracking attendance.

5. MentorshipRequest:  
   Models a request from a mentee to a mentor, with attributes for request status and associated IDs.

6. StudyMaterial:  
   Allows users to create and share study materials, such as guides and tutorials.

7. FileExchange:  
   Manages the exchange of files between users, with attributes for sender, receiver, and file path.

8. Message:  
   Handles messaging functionality between users, including sender, receiver, and content.

9. Feedback:  
   Enables mentees to submit feedback for mentors, with attributes for ratings and comments.

10. Suggestion:  
    Allows users to submit suggestions for features or improvements, with attributes for type and details.

11. Main:  
    Includes a Main method to test all classes and their functionalities.