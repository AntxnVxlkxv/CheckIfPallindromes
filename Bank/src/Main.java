import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bol = true;
		while (bol) {
			System.out.println("Enter the amount of money ");
			int a = sc.nextInt();

			System.out.println("Enter deposit percentage ");
			double b = sc.nextDouble();
			System.out.println("Enter the amount of years ");
			int a1 = sc.nextInt();
			if (a < 0 || b < 0 || b > 100) {
				System.err.println("Invalid");

			} else {
				bol = false;
			}
			double dep = a1 * ((a / 100) * b);
			System.out.println(dep + a);
		}

	}
}