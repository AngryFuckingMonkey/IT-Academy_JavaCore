package homeworks.lesson7;

public class HeadFactory implements RobotCreation {

    private final Head[] HEADS = Head.values();

    public void createRobotPart(Robot robot, int headIndex) {
        robot.setHead(HEADS[headIndex]);
    }

}
