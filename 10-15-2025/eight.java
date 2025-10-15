import java.util.Scanner;

public class eight {
    public static int[][] addTwoMatrix(int matrix1[][], int matrix2[][], int sizeOfMatrix) {
        int newMatrix[][] = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                newMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return newMatrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hello from java");
        System.out.println("enter the size of the matrix");
        int sizeOfMatrix = sc.nextInt();
        System.out.println("please enter the element of the first matrix");
        int matrix1[][] = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("please enter the element of the second matrix");
        int matrix2[][] = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        matrix2 = addTwoMatrix(matrix1, matrix2, sizeOfMatrix);

        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                System.out.print(matrix2[i][j]);
            }
            System.out.println("");
        }
    }
}
