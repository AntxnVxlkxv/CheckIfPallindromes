import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in path: ");
		String a = sc.nextLine();
		BufferedReader bufReader = new BufferedReader(new FileReader(a));
		ArrayList<String> list = new ArrayList<String>();
		String line;

		line = bufReader.readLine();

		while (line != null) {
			list.add(line);
			line = bufReader.readLine();
		}

		Collections.sort(list);
		System.out.println(list);
		bufReader.close();
	}

}
