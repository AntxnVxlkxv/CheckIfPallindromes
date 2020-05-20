import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want timer from 0 to infinity or to a certain point? 1 or 2");
		int h = sc.nextInt();
		switch (h) {
		case 1:
			System.out.println("Start: ");
			int a = sc.nextInt();
			Class timer1 = new Class(a, 0);
			timer1.start1();
			break;
		case 2:
			System.out.println("Start: ");
			int a1 = sc.nextInt();
			System.out.println("End: ");
			int b = sc.nextInt();
			Class timer = new Class(a1, b);
			timer.start();
			break;
		}

	}

}
