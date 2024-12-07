class FileExchange {
    private int exchangeId;
    private int senderId;
    private int receiverId;
    private String filePath;

    public FileExchange(int exchangeId, int senderId, int receiverId, String filePath) {
        this.exchangeId = exchangeId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.filePath = filePath;
    }

    public void sendFile() {
        System.out.println("File exchanged from sender ID: " + senderId + " to receiver ID: " + receiverId);
    }
}
