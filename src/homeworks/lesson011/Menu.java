package homeworks.lesson011;

import java.util.Scanner;

public abstract class Menu {

    protected boolean isActive = true;
    protected static final Scanner SCANNER = new Scanner(System.in);

    protected abstract void start();

    protected abstract void doUserSelection(int userSelection);

    protected void close() {
        isActive = false;
        System.out.println("Program is closing");
    }

}
