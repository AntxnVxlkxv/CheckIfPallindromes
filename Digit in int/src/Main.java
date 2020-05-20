import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an int: ");
		int temp = sc.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		do {
			array.add(temp % 10);
			temp /= 10;
		} while (temp > 0);
		System.out.println(array.size());
	}

}
