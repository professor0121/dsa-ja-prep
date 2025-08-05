import java.util.ArrayList;
import java.util.Arrays;

public class Matrix {

    public static ArrayList<ArrayList<Integer>> rotateMatrix90Degrees(ArrayList<ArrayList<Integer>> matrix) {
        int n = matrix.size();
        ArrayList<ArrayList<Integer>> rotatedMatrix = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> newRow = new ArrayList<>();
            for (int j = n - 1; j >= 0; j--) {
                newRow.add(matrix.get(j).get(i));
            }
            rotatedMatrix.add(newRow);
        }

        return rotatedMatrix;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        matrix.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        ArrayList<ArrayList<Integer>> rotated = rotateMatrix90Degrees(matrix);
        for (ArrayList<Integer> row : rotated) {
            System.out.println(row);
        }
    }
}
