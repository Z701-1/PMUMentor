class Suggestion {
    private int suggestionId;
    private int userId;
    private String suggestionType;
    private String details;

    public Suggestion(int suggestionId, int userId, String suggestionType, String details) {
        this.suggestionId = suggestionId;
        this.userId = userId;
        this.suggestionType = suggestionType;
        this.details = details;
    }

    public void create() {
        System.out.println("Suggestion created by user ID: " + userId);
    }
}
