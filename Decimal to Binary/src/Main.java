import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> List = new Stack<Integer>();
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		while (a != 0) {
			int d = a % 2;
			List.push(d);
			a /= 2;
		}
		System.out.println();
		System.out.println("Binary: ");
		while (!(List.isEmpty())) {
			System.out.print(List.pop());
		}
		System.out.println();
	}

}
