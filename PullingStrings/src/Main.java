import java.util.*;

public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int a = r.nextInt(100 - 1) + 1;
		int a1 = r.nextInt(50 - 1) + 1;
		int a2 = r.nextInt(10 - 1) + 1;
		int a3 = r.nextInt(500 - 1) + 1;
		boolean o = true;
		while (o) {
			System.out.println("Welcome, the point is you pull out a string if you pull the death string you die");
			System.out.println("Type in difficulty: hard, medium, easy or experimental");
			String s;
			try {
				s = sc.nextLine();

				switch (s) {
				case "hard":
					for (int i = 0; i < 10; i++) {
						System.out.println("you pulled a string..." + i);
						if (i == a2) {
							System.out.println("You LOST");
							break;
						}
						i++;
						System.out.println("enemy pulled a string..." + i);
						if (i == a2) {
							System.out.println("You WIN");
							break;
						}
						i++;

					}
					System.out.println("END The death string was " + a2);
					break;
				case "medium":
					for (int i = 0; i < 50; i++) {
						System.out.println("you pulled a string..." + i);
						if (i == a1) {
							System.out.println("You LOST");
							break;
						}
						i++;
						System.out.println("enemy pulled a string..." + i);
						if (i == a1) {
							System.out.println("You WIN");
							break;
						}
						i++;

					}
					System.out.println("END The death string was " + a1);
					break;
				case "easy":
					for (int i = 0; i < 100; i++) {
						System.out.println("you pulled a string..." + i);
						if (i == a) {
							System.out.println("You LOST");
							break;
						}
						i++;
						System.out.println("enemy pulled a string..." + i);
						if (i == a) {
							System.out.println("You WIN");
							break;

						}
						i++;

					}
					System.out.println("END The death string was " + a);

				case "experimental":
					for (int i = 0; i < 500; i++) {
						System.out.println("you pulled a string..." + i);
						if (i == a3) {
							System.out.println("You LOST");
							break;
						}
						i++;
						System.out.println("enemy pulled a string..." + i);
						if (i == a3) {
							System.out.println("You WIN");
							break;

						}
						i++;

					}
					System.out.println("END The death string was " + a3);
					
				}
				System.out.println("Thank you for playing!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
