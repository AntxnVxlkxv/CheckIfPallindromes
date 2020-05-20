import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type in some string..");
		String s = sc.nextLine();
		System.out.println("Type in shift");
		int a = sc.nextInt();
		System.out.println("Your text: " + s);
		System.out.println("The shift: "+a);
		System.out.println("Encrypted message: "+ CaesarCipher.crypt(s,a));
		sc.close();
	}
}
