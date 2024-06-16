package homeworks.lesson7;

public enum Head implements RobotPart{

    ROUND(HEAD_TITLES[0], NOTATATIONS[0]),
    SQUARE(HEAD_TITLES[1], NOTATATIONS[1]),
    TRIANGULAR(HEAD_TITLES[2], NOTATATIONS[2]);

    private final String TITLE;
    private final String NOTATATION;

    Head(String TITLE, String NOTATATION) {
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
