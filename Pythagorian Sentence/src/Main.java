import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int exp = 2;
		System.out.println("Hello and welcome!");
		System.out.println("Type in what do you want to find, 1 - a; 2 - b; 3 - c");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			try {
				System.out.println("Type in b");
				double b = sc.nextDouble();
				System.out.println("Type in c");
				double c = sc.nextDouble();
				System.out.println();
				double a2 = Math.pow(c, exp) - Math.pow(b, exp);
				double a1 = Math.sqrt(a2);
				System.out.println(a1);
				break;
			} catch (Exception e) {
				System.err.println("Something went wrong");
			}
		case 2:
			try {
				System.out.println("Type in a");
				double a = sc.nextDouble();
				System.out.println("Type in c");
				double c1 = sc.nextDouble();
				System.out.println();
				double b2 = Math.pow(c1, exp) - Math.pow(a, exp);
				double b1 = Math.sqrt(b2);
				System.out.println(b1);
				break;
			} catch (Exception e) {
				System.err.println("Something went wrong");
			}
		case 3:
			try {
				System.out.println("Type in a");
				double a3 = sc.nextDouble();
				System.out.println("Type in b");
				double b3 = sc.nextDouble();
				System.out.println();
				double c2 = Math.pow(a3, exp) + Math.pow(b3, exp);
				double c3 = Math.sqrt(c2);
				System.out.println(c3);
				break;
			} catch (Exception e) {
				System.err.println("Something went wrong");
			}
		}
	}
}
