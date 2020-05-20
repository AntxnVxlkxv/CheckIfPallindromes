import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		System.out.println("Type in what do you want to do (+ - * /)");
		String k = sc.nextLine();
		switch (k) {
		case "+":
			try {
				System.out.println("Type in first number");
				double f = sc.nextDouble();
				System.out.println("Type in second number");
				double f2 = sc.nextDouble();
				double answer = f + f2;
				System.out.println("Answer: " + answer);
				break;
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		case "-":
			try {
				System.out.println("Type in first number");
				double v = sc.nextDouble();
				System.out.println("Type in second number");
				double v2 = sc.nextDouble();
				double answer1 = v - v2;
				System.out.println("Answer: " + answer1);
				break;
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		case "*":
			try {
				System.out.println("Type in first number");
				double c = sc.nextDouble();
				System.out.println("Type in second number");
				double c2 = sc.nextDouble();
				double answer2 = c * c2;
				System.out.println("Answer: " + answer2);
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		case "/":
			while (a) {
				System.out.println("Type in first number");
				double h = sc.nextDouble();
				System.out.println("Type in second number");
				double h2 = sc.nextDouble();
				if (h2 == 0) {
					System.err.println("Error divided by zero");
				} else {
					a = false;
				}

				double answer3 = h / h2;
				System.out.println("Answer: " + answer3);
			}
			break;
		}

	}

}
