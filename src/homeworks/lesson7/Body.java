package homeworks.lesson7;

public enum Body implements RobotPart{

    ROUND(BODY_TITLES[0], NOTATATIONS[0]),
    SQUARE(BODY_TITLES[1], NOTATATIONS[1]),
    TRIANGULAR(BODY_TITLES[2], NOTATATIONS[2]);

    private final String TITLE;
    private final String NOTATATION;

    Body(String TITLE, String NOTATATION) {
        this.TITLE = TITLE;
        this.NOTATATION = NOTATATION;
    }

    public String getTitle() {
        return TITLE;
    }

    public String getNotatation() {
        return NOTATATION;
    }
}
