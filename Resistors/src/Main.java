import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("what type of connection, 1 - parallel, 2 - serial ");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			Scanner input1 = new Scanner(System.in);
			System.out.println("Enter in numbers (1-10) enter 0 when finished:");

			double x1 = input1.nextInt();
			ArrayList<Double> list1 = new ArrayList<Double>();
			double num1;
			while (sc.hasNextInt()) {
				num1 = sc.nextInt();
				if (num1 == 0) {
					break;
				}
				double shit = 1 / num1;
				list1.add(shit);

			}

			System.out.println(list1);
			double sum1 = 0;
			for (int i = 0; i < list1.size(); i++) {
				sum1 += list1.get(i);
			}
			System.out.println(sum1);
			break;
		case 2:
			Scanner input = new Scanner(System.in);
			System.out.println("Enter in numbers (1-10) enter 0 when finished:");

			int x = input.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			int num;
			while (sc.hasNextInt()) {
				num = sc.nextInt();
				list.add(num);
				if (num == 0) {
					break;
				}
			}
			int sum = list.stream().mapToInt(Integer::intValue).sum();

			System.out.println(sum);
			break;
		}
	}

}
