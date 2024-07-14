package homeworks.additionalTasks.lesson012.shapes;

public class Rectangle extends Shape {

    private final int[][] POINTS;

    @Override
    public void draw() {
        doFirstIndent();
        drawHorizontalLine();
        drawVerticalLines();
        System.out.println();
        doIndent(POINTS[0][0]);
        drawHorizontalLine();
    }

    private void drawHorizontalLine() {
        for(int i = POINTS[0][0]; i < POINTS[1][0]; i++) {
            System.out.print("--");
        }
    }

    private void drawVerticalLines() {
        for(int i = POINTS[0][1]; i < POINTS[2][1]; i++) {
            System.out.println();
            doIndent(POINTS[0][0]);
            System.out.print("|");
            doIndent(POINTS[1][0] - POINTS[0][0] - 1);
            System.out.print("|");
        }
    }

    private void doFirstIndent() {
        for(int i = 0; i < POINTS[0][1]; i++) {
            System.out.println();
        }
        for(int i = 0; i < POINTS[0][0]; i++) {
            System.out.print("  ");
        }
    }

    private void doIndent(int indent) {
        for(int i = 0; i < indent; i++) {
            System.out.print("  ");
        }
    }

    public Rectangle(int[][] points) {
        this.POINTS = points;
    }

}
