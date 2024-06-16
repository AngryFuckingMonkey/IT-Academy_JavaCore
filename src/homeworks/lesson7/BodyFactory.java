package homeworks.lesson7;

public class BodyFactory implements RobotCreation <Body> {

    public Robot createRobot(Robot robot, Body body) {
        return robot;
    }

}
