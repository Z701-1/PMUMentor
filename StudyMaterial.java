class StudyMaterial {
    private int materialId;
    private String content;

    public StudyMaterial(int materialId, String content) {
        this.materialId = materialId;
        this.content = content;
    }

    public void create() {
        System.out.println("Study material created: " + content);
    }

    public void share(int receiverId) {
        System.out.println("Shared study material with user ID: " + receiverId);
    }
}
