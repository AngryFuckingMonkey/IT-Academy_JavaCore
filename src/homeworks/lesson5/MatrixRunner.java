package homeworks.lesson5;

public class MatrixRunner {

    public static void main(String[] args) {

        String[][] arr = new String[10][10];

        Matrix.fillArray(arr);

        String[] diagonals = Matrix.createDiagonalsArray(arr);

        Matrix.compareDiagonals(diagonals);

        Matrix.doThirdPoint(diagonals);

        Matrix.showArray(arr);

    }

}