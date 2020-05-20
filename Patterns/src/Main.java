
public class Main {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		int n = 5;
		int z = 1;
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < z; k++) {
				System.out.print(z - i);
			}
			z += 2;
			System.out.println();
		}
		int i, j;
		for (i = 1; i <= 15; i++) {
			for (j = 1; j <= 10; j++) {

				if (((i >= 4 && i <= 6) && (j >= 4)) || ((i >= 10 && i <= 12) && (j <= 7))) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		int wave_height = 5;
		int wave_length = 2;
		int i1, j1, k;

		for (i1 = 1; i1 <= wave_height; i1++) {
			for (j1 = 1; j1 <= wave_length; j1++) {
				if (i1 != wave_height)
					System.out.print("##");
				else
					System.out.print(" ");
				for (k = 1; k <= 4; k++) {
					if (i1 == 1 || k == 1 || k == 4) {
						System.out.print(" ");
					} else {
						System.out.print("##");
					}
					if (i1 != wave_height)
						System.out.print("##");
					else
						System.out.print(" ");
				}
				System.out.println();
			}

		}

	}
}
