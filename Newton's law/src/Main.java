import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int exp = 2;
		double G = 6.674 * 10 * Math.pow(10, -11);
		System.out.println("Hello and welcome");
		System.out.println("This program has Newton's law in it");
		System.out.println("What do you want to find? 1 - F; 2 - m1; 3 - m2; 4 - r;");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			try {
				System.out.println("Type in m1: ");
				double m1 = sc.nextDouble();
				System.out.println("Type in m2: ");
				double m2 = sc.nextDouble();
				System.out.println("Type in r: ");
				double r = sc.nextDouble();
				double F = G * ((m1 * m2) / Math.pow(r, exp));
				System.out.println("F = " + F);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				System.out.println("Type in m2: ");
				double m2 = sc.nextDouble();
				System.out.println("Type in r: ");
				double r = sc.nextDouble();
				System.out.println("Type in F: ");
				double F = sc.nextDouble();
				double m1 = (F * Math.pow(r, exp)) / (G * m2);
				System.out.println(m1);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 3:
			try {
				System.out.println("Type in m1: ");
				double m1 = sc.nextDouble();
				System.out.println("Type in r: ");
				double r = sc.nextDouble();
				System.out.println("Type in F: ");
				double F = sc.nextDouble();
				double m2 = (F * Math.pow(r, exp)) / (G * m1);
				System.out.println(m2);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 4:
			try {
				System.out.println("Type in m1: ");
				double m1 = sc.nextDouble();
				System.out.println("Type in m2: ");
				double m2 = sc.nextDouble();
				System.out.println("Type in F: ");
				double F = sc.nextDouble();
				double r = (F * m1 * m2) / G;
				r = Math.sqrt(r);
				System.out.println(r);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
	}
}
