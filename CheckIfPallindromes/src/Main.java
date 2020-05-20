import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a string");
		String s = sc.nextLine();
		boolean full;
		int n = s.length();
		for (int i = 0; i < (n / 2); ++i) {
			if (s.charAt(i) != s.charAt(n - i - 1)) {
				full = false;
			}
		}
		full = true;

		if (full == true) {
			System.out.println("They are Pall");
		} else {
			System.out.println("They are not");
		}
	}
}
