import java.util.Scanner;

public class ten {
    public static int addDiagonalOfMatrix(int matrix1[][], int sizeOfMatrix) {
        int sum = 0;
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                if (i == j) {
                    sum += matrix1[i][j];
                }
            }
        }
        return sum;
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
        int sum = addDiagonalOfMatrix(matrix1, sizeOfMatrix);
        System.out.println(sum);
    }
}
