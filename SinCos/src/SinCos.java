import java.util.*;

public class SinCos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int exp = 2;
		System.out.println("What do you want to find? 1 - a; 2 - b; 3 - c ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			try {
				System.out.println("Type in B: ");
				double b = sc.nextDouble();
				System.out.println("Type in C: ");
				double c = sc.nextDouble();
				System.out.println("Type in Alfa");
				double alfa = sc.nextDouble();
				alfa = Math.toRadians(alfa);
				double a2 = Math.pow(b, exp) + Math.pow(c, exp) - 2 * b * c * Math.cos(alfa);
				double a = Math.sqrt(a2);
				System.out.println("The answer is: " + a);
			} catch (Exception e) {
				System.err.println("An error has occured");
			}
			break;
		case 2:
			try {
				System.out.println("Type in C: ");
				double c3 = sc.nextDouble();
				System.out.println("Type in A: ");
				double a3 = sc.nextDouble();
				System.out.println("Type in Gamma: ");
				double beta = sc.nextDouble();
				beta = Math.toRadians(beta);
				double b2 = Math.pow(c3, exp) + Math.pow(a3, exp) - exp * c3 * a3 * Math.cos(beta);
				double b3 = Math.sqrt(b2);
				System.out.println("The answer is: " + b3);
			} catch (Exception e) {
				System.err.println("An error has occured");
			}
			break;
		case 3:
			try {
				System.out.println("Type in A: ");
				double a1 = sc.nextDouble();
				System.out.println("Type in B: ");
				double b1 = sc.nextDouble();
				System.out.println("Type in Gamma: ");
				double gamma = sc.nextDouble();
				gamma = Math.toRadians(gamma);
				double c2 = Math.pow(a1, exp) + Math.pow(b1, exp) - exp * a1 * b1 * Math.cos(gamma);
				double c1 = Math.sqrt(c2);
				System.out.println("The answer is: " + c1);
			} catch (Exception e) {
				System.err.println("An error has occured");
			}
			break;

		}
	}
}
