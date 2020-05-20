import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int guess;
		int random = r.nextInt(100) + 1;
		int attempt = 1;
		boolean b = true;

		System.out.println("Random number between 1 to 100 generated, you may now begin");

		guess = sc.nextInt();
		while (guess != random) {
			if (guess > random) {
				System.out.println("Lower!");
				attempt += 1;
			} else {
				System.out.println("Higher!");
				attempt += 1;
			}
			guess = sc.nextInt();

		}
		System.out.println(random + " Is the number");
		System.out.println("It took you over " + attempt+ " attempts!");
		if(attempt==1) {
			System.out.println("Almost FLAWLESS");
		}
	}
}
