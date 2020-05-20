import java.util.*;
public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> arr = new ArrayList<Person>();
		for(int i = 0; i<7;i++) {
			int d = 1+r.nextInt(31);
			int m = 1+r.nextInt(12);
			int y = r.nextInt(1960-1930)+1930;
			int y2 = r.nextInt(2000-1960)+1960;
			int place = r.nextInt(10-1)+1;
			String dateOfBirth = Integer.toString(d)+"."+Integer.toString(m)+"."+Integer.toString(y);
			String dateOfExpiration = Integer.toString(d)+"."+Integer.toString(m)+"."+Integer.toString(y2);
			arr.add(new Person(dateOfBirth,dateOfExpiration,place,r.nextBoolean(),r.nextBoolean()));
		}
		System.out.println("Place of living 1- Czech Republic; 2 - Russia; 3 - Ukraine; 4 - Poland; 5 - Germany; 6 - UK; 7 - France \n8 - Netherlands; 9 - Portugal; 10 - Spain ");
		int i = 0;
		System.out.println("Welcome to your new work \nToday's date is 23.5.1972");
		System.out.println("Someone comes in...");
		System.out.println(arr.get(i));
		System.out.println("Will you let him through?");
		String s = sc.nextLine();
		i++;
		System.out.println("Someone comes in...");
		System.out.println(arr.get(i));
		System.out.println("Will you let him through?");
		String s1 = sc.nextLine();
		i++;
		System.out.println("Welcome to your new work \nToday's date is 24.5.1972");
		System.out.println("Someone comes in...");
		System.out.println(arr.get(i));
		System.out.println("Will you let him through?");
		String s2 = sc.nextLine();
		i++;
		System.out.println("Welcome to your new work \nToday's date is 25.5.1972");
		System.out.println("Someone comes in...");
		System.out.println(arr.get(i));
		System.out.println("Will you let him through?");
		String s3 = sc.nextLine();
		i++;
		System.out.println("Welcome to your new work \nToday's date is 26.5.1972");
		System.out.println("Someone comes in...");
		System.out.println(arr.get(i));
		System.out.println("Will you let him through?");
		String s4 = sc.nextLine();
		i++;
		System.out.println("Welcome to your new work \nToday's date is 27.5.1972");
		System.out.println("Someone comes in...");
		System.out.println(arr.get(i));
		System.out.println("Will you let him through?");
		String s5 = sc.nextLine();
		i++;
		System.out.println("Welcome to your new work \nToday's date is 28.5.1972");
		System.out.println("Someone comes in...");
		System.out.println(arr.get(i));
		System.out.println("Will you let him through?");
		String s6 = sc.nextLine();
		i++;
		System.out.println("Welcome to your new work \nToday's date is 29.5.1972");
		System.out.println("Someone comes in...");
		System.out.println(arr.get(i));
		System.out.println("Will you let him through?");
		String s7 = sc.nextLine();
		System.out.println("Thank you for playing");
		System.out.println("I will proceed doing this later");
	}

}
