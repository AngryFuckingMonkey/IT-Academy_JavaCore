package homeworks.lesson7;

public class RobotFactory {

    static Robot createRobot(int headIndex, int bodyIndex) {
        Robot robot = new Robot();
        new HeadFactory().createRobotPart(robot, headIndex);
        new BodyFactory().createRobotPart(robot, bodyIndex);
        robot.setName(robot.getHead().getNotatation() + headIndex + robot.getBody().getNotatation() + bodyIndex);
        return robot;
    }

    static void createManyDifferentRobots() {
        for(int headIndex = 0; headIndex < Head.values().length; headIndex++) {
            for(int bodyIndex = 0; bodyIndex < Body.values().length; bodyIndex++) {
                System.out.println(createRobot(headIndex, bodyIndex));
            }
        }
    }

}
