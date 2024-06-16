package homeworks.lesson7;

public class BodyFactory implements RobotCreation {

    private final Body[] BODIES = Body.values();

    public void createRobotPart(Robot robot, int bodyIndex) {
        robot.setBody(BODIES[bodyIndex]);
    }

}
