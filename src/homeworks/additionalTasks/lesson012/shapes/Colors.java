package homeworks.additionalTasks.lesson012.shapes;

public enum Colors {

    BLUE("blue"),
    GREEN("green"),
    RED("red"),
    WHITE("white"),
    BLACK("black"),
    YELLOW("yellow"),
    ORANGE("orange"),
    PURPLE("purple"),
    BROWN("brown");

    private final String DEFINITION;

    public String getDEFINITION() {
        return DEFINITION;
    }

    Colors(String DEFINITION) {
        this.DEFINITION = DEFINITION;
    }

}
