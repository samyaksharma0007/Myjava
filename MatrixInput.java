import java.util.Scanner;

public class MatrixInput
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a 3x4 matrix
        int[][] matrix = new int[3][4];

        // Get input from the user for each element
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
