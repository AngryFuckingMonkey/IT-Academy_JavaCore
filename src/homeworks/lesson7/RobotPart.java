package homeworks.lesson7;

public interface RobotPart {

    String[] HEAD_TITLES = {"круглой", "квадратной", "треугольной"};
    String[] BODY_TITLES = {"круглым", "квадратным", "треугольным"};
    String[] NOTATATIONS = {"R", "S", "T"};

    String getTitle();

    String getNotatation();

}
