import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int exp = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello and welcome");
		System.out.println("Please choose between these figures");
		System.out.println(
				"1 - rectangular Parallelopiped;; 2 - Cube; 3 - Cylinder; 4 - cone; 5 - circle; 6 - parallelogram; 7 - trapezoid;");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			try {
				System.out.println("Type in A: ");
				double a = sc.nextDouble();
				System.out.println("Type in B: ");
				double b = sc.nextDouble();
				System.out.println("Type in C: ");
				double c = sc.nextDouble();
				System.out.println("The area is: " + exp * (a * b + b * c + c * a));
				System.out.println("The volume is: " + a * b * c);
			} catch (Exception e) {
				System.err.println("an error has occured ");
			}
			break;
		case 2:
			try {
				System.out.println("Type in A: ");
				double a = sc.nextDouble();
				System.out.println("The area is: " + 6 * Math.pow(a, exp));
				System.out.println("The volume is: " + Math.pow(a, 3));
			} catch (Exception e) {
				System.err.println("an error has occured ");
			}
			break;
		case 3:
			try {
				System.out.println("Type in Perimeter of base: ");
				double a = sc.nextDouble();
				System.out.println("Type in Radius: ");
				double b = sc.nextDouble();
				System.out.println("Type in Height: ");
				double c = sc.nextDouble();
				System.out.println("The area of its curved surface is: " + exp * Math.PI * b * c);
				System.out.println("The area is: " + exp * Math.PI * b * c + exp * Math.PI * Math.pow(b, exp));
				System.out.println("The volume is: " + Math.PI * (c + b));

			} catch (Exception e) {
				System.err.println("an error has occured ");
			}
			break;
		case 4:
			try {
				System.out.println("Type in Radius: ");
				double b = sc.nextDouble();
				System.out.println("Type in Height: ");
				double c = sc.nextDouble();
				System.out.println("Type in Slant Height: ");
				double d = sc.nextDouble();
				double k = (1 / 2) * exp * Math.PI * b * d;
				System.out.println("The area of its curved surface: " + k);
				System.out.println("The whole area is: " + k * Math.PI * Math.pow(c, exp));
				System.out.println("The volume is: " + (1 / 3) * Math.PI * Math.pow(b, exp) * c);

			} catch (Exception e) {
				System.err.println("an error has occured ");
			}
			break;
		case 5:

		}
	}

}
