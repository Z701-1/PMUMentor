class Message {
    private int messageId;
    private int senderId;
    private int receiverId;
    private String content;
    private String timestamp;

    public Message(int messageId, int senderId, int receiverId, String content, String timestamp) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.content = content;
        this.timestamp = timestamp;
    }

    public void send() {
        System.out.println("Message sent from sender ID: " + senderId + " to receiver ID: " + receiverId);
    }
}
