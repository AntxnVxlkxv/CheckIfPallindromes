import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Type how many numbers will you add to each array ");
		int b = sc.nextInt();
		int arr[] = new int[b];
		int arr1[] = new int[b];
		System.out.println();
		System.out.println("enter elements");

		for (int i = 0; i < b; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("enter elements(2)");

		for (int i = 0; i < b; i++) {
			arr1[i] = sc.nextInt();

		}

		if (Arrays.equals(arr, arr1)) {
			System.out.println("Same");
		} else {
			System.out.println("Not same");

		}

	}
}
