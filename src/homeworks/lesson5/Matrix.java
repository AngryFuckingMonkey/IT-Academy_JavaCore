package homeworks.lesson5;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix {

    public static final String REGEX = "\\d+";

    public static String[][] fillArray (String[][] array) {
        int count = 1;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = generateArrayCell(count);
                count++;
            }
        }
        return array;
    }

    public static String generateArrayCell (int count) {
        char letter;
        boolean isCapital;
        Random rand = new Random();
        String cellContent = new String();

        if (count % 3 == 0) {
            cellContent = String.valueOf((rand.nextInt(10000000)) / 1000000.0);
        } else {
            for (int k = 0; k < 7; k++) {
                isCapital = rand.nextBoolean();
                if (isCapital) {
                    letter = (char) (rand.nextInt(90 - 65 + 1) + 65);
                } else {
                    letter = (char) (rand.nextInt(122 - 97 + 1) + 97);
                }
                cellContent += letter;
            }
        }
        return cellContent;
    }


    public static void showArray (String[][] array) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static String[] createDiagonalsArray (String[][] array) {
        String[] diagonals = new String[20];

        for (int i = 0, j = 9, k = 10; i <= 9 && j >= 0 && k <= 19; i++, j--, k++) {
            diagonals[i] = array[i][i];
            diagonals[k] = array[i][j];
        }

        return diagonals;
    }

    public static void compareDiagonals (String[] diagonals) {
        boolean isEqual = false;

        for (int firstIndex = 0, secondIndex = 10; firstIndex <= 9 && secondIndex <=19; firstIndex++, secondIndex++) {
            if (diagonals[firstIndex].equals(diagonals[secondIndex])) {
                isEqual =  true;
            } else {
                break;
            }
        }

        if (isEqual) {
            System.out.println("Диагонали равны");
        } else {
            System.out.println("Диагонали не равны");
        }
    }

    public static int countNumberOfNumbers (String[] array, Pattern pat) {
        int numberOfNumbers = 0;
        Matcher mat;
        for (String str : array) {
            mat = pat.matcher(str);
            if (mat.find()) {
                numberOfNumbers++;
            }
        }
        return numberOfNumbers;
    }

    public static void printArrayOfNumbers (Integer[] numArray) {
        for (Integer num : numArray) {
            System.out.print(num + "_");
        }
        System.out.println();
    }

    public static void doThirdPoint (String[] array) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher mat;
        StringBuilder sb;
        Integer num;
        int tempNum;
        Integer[] numArray = new Integer[countNumberOfNumbers(array, pattern)];
        int index = 0;

        for (String str : array) {
            mat = pattern.matcher(str);
            if(mat.find()) {
                tempNum = ((int)(Double.valueOf(str) * 10)) % 10;
                if (tempNum > 6) {
                    num = Double.valueOf(str).intValue() + 1;
                } else {
                    num = Double.valueOf(str).intValue();
                }
                numArray[index] = num;
                index++;
            } else {
                sb = new StringBuilder();
                for(int i = 1; i < 3; i++) {
                    sb.append(str.charAt(i)).append(", ");
                }
                sb.append(str.charAt(3));
                System.out.println(sb);
            }

        }
        printArrayOfNumbers(numArray);
    }
}

