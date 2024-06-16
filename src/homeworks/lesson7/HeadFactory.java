package homeworks.lesson7;

public class HeadFactory implements RobotCreation <Head> {

    public Robot createRobot(Robot robot, Head head) {
        return robot;
    }

}
