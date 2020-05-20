import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int a1 = 0;

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) {
			int a = 1 + r.nextInt(10);
			list.add(a);
		}
		Iterator<Integer> itr = list.iterator();
		System.out.println("1- find odd numbers, 2 - find even numbers, 3 - find count of x number ");
		a1 = sc.nextInt();

		switch (a1) {
		case 1:
			System.out.println("Original array: ");
			while (itr.hasNext()) {

				int i = (Integer) itr.next();

				System.out.print( i + " ");

				if (i % 2 != 0)
					itr.remove();
			}
			System.out.println();
			System.out.println("Sorted array: ");
			System.out.println(list);
			break;
		case 2:
			System.out.println("Original array: ");
			while (itr.hasNext()) {

				int i = (Integer) itr.next();

				System.out.print(i + " ");

				if (i % 2 == 0)
					itr.remove();
			}
			System.out.println();
			System.out.println("Sorted array: ");
			System.out.println(list);
			break;
		case 3:
			int a = 0;
			System.out.println("What number you want to find the count of");
			int b = sc.nextInt();
			while (itr.hasNext()) {

				int i = (Integer) itr.next();

				if (i == b)
					a++;

			}
			System.out.println();
			System.out.println("The count is: " + a);
			System.out.println("Sorted array: ");
			System.out.println(list);
			break;
		}
		sc.close();
	}

}
