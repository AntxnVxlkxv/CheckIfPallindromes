
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number Of Matrix Rows");
		int matrixRow = scan.nextInt();
		System.out.println("Enter The Number Of Matrix Columns");
		int matrixCol = scan.nextInt();
		int[][] matrix = new int[matrixRow][matrixCol];

		System.out.println("Enter Matrix Numbers");

		for (int i = 0; i < matrixRow; i++) {
			for (int j = 0; j < matrixCol; j++) {
				matrix[i][j] = scan.nextInt();

			}
		}

		System.out.println("Your Matrix is : ");
		for (int i = 0; i < matrixRow; i++) {
			for (int j = 0; j < matrixCol; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
