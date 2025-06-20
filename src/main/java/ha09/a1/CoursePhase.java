package ha09.a1;

public enum CoursePhase {
    NOT_STARTED("Course not started yet”"),
    ONGOING("Course is in progress"),
    FINISHED("Course has ended");

    private final String message;

    CoursePhase(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
