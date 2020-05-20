import java.util.*;

public class Main {

	public static void main(String[] args) {
		int exp = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello and welcome");
		System.out.println("How do you wish to check? 1 - angles; 2 - Hypotenuse and legs; 3 - pythagorian");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			try {
				System.out.println("Type in first sharp angle: ");
				double angle1 = sc.nextDouble();
				System.out.println("Type in second sharp angle: ");
				double angle2 = sc.nextDouble();
				double check = angle1 + angle2;
				if (check != 90) {
					System.out.println("It is not rectangular");
				} else {
					System.out.println("It is rectangular");
				}
			} catch (Exception e) {
				System.err.println("an error has occured");
			}
			break;
		case 2:
			try {
				System.out.println("Type in hypotenuse: ");
				double hypotenuse = sc.nextDouble();
				System.out.println("Type in first leg: ");
				double leg1 = sc.nextDouble();
				System.out.println("Type in second leg: ");
				double leg2 = sc.nextDouble();
				if (hypotenuse > leg1 && hypotenuse > leg2) {
					System.out.println("It is rectangular");
				} else {
					System.out.println("It is not rectangular");
				}
			} catch (Exception e) {
				System.err.println("an error has occured");
			}
			break;
		case 3:
			try {
				System.out.println("Type in hypotenuse: ");
				double hypotenuse = sc.nextDouble();
				System.out.println("Type in first leg: ");
				double leg1 = sc.nextDouble();
				System.out.println("Type in second leg: ");
				double leg2 = sc.nextDouble();
				double c = Math.pow(hypotenuse, exp);
				double a = Math.pow(leg1, exp);
				double b = Math.pow(leg2, exp);
				if (c == a + b) {
					System.out.println("It is rectangular");
				} else {
					System.out.println("It is not rectangular");
				}
			} catch (Exception a) {
				System.err.println("an error has occured ");
			}
		}
	}

}
