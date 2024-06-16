package homeworks.lesson3.rainbow;

import java.util.Scanner;

public class Rainbow {

    private final String YELLOW = "жёлтый";
    private final String ORANGE = "оранжевый";
    private final String RED = "красный";
    private final String GREEN = "зелёный";
    private final String CYAN = "голубой";
    private final String BLUE = "синий";
    private final String PURPLE = "фиолетовый";
    private final String BROWN = "коричневый";

    private int colorNum;
    private Scanner in = new Scanner(System.in);

    private void printMainColor(int colorNum) {
        switch (colorNum) {
            case 0:
                System.out.print("белый");
                break;
            case 1:
                System.out.print(YELLOW);
                break;
            case 2:
                System.out.print(ORANGE);
                break;
            case 3:
                System.out.print(RED);
                break;
            case 4:
                System.out.print(GREEN);
                break;
            case 5:
                System.out.print(CYAN);
                break;
            case 6:
                System.out.print(BLUE);
                break;
            case 7:
                System.out.print(PURPLE);
                break;
            case 8:
                System.out.print(BROWN);
                break;
            default:
                System.out.print("чёрный");
        }
    }

    public void printColor() {

        if (colorNum == 0) {
            System.out.print("Введите число от 0 до 99: ");
            colorNum = in.nextInt();
        }

        if (colorNum < 0 || colorNum > 99) {
            System.out.print("Число выходит за необходимый диапазон");
            return;
        }

        if (colorNum < 10) {
            printMainColor(colorNum);
        } else {
            int firstColor = colorNum / 10;
            int secondColor = colorNum % 10;

            if (firstColor == secondColor) {
                colorNum = firstColor;
                printColor();
                return;
            }

            if (secondColor == 0) {
                System.out.print("светло-");
                printMainColor(firstColor);
                return;
            } else if (secondColor == 9) {
                System.out.print("тёмно-");
                printMainColor(firstColor);
                return;
            }

            switch (firstColor) {
                case 1:
                    System.out.print("жёлто");
                    break;
                case 2:
                    System.out.print("оранжево");
                    break;
                case 3:
                    System.out.print("красно");
                    break;
                case 4:
                    System.out.print("зелёно");
                    break;
                case 5:
                    System.out.print("голубо");
                    break;
                case 6:
                    System.out.print("сине");
                    break;
                case 7:
                    System.out.print("фиолетово");
                    break;
                case 8:
                    System.out.print("коричнево");
                    break;
                case 9:
                    System.out.print("чёрно");
            }

            System.out.print("-");

            switch (secondColor) {
                case 1:
                    System.out.print(YELLOW);
                    break;
                case 2:
                    System.out.print(ORANGE);
                    break;
                case 3:
                    System.out.print(RED);
                    break;
                case 4:
                    System.out.print(GREEN);
                    break;
                case 5:
                    System.out.print(CYAN);
                    break;
                case 6:
                    System.out.print(BLUE);
                    break;
                case 7:
                    System.out.print(PURPLE);
                    break;
                case 8:
                    System.out.print(BROWN);
                    break;
            }
        }
    }
}
