
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in path: ");
		String filePath = sc.nextLine();
		File file = new File(filePath);
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		reader = new BufferedReader(input);

		int lineCount = 0;
		String data;
		while ((data = reader.readLine()) != null) {
			lineCount++;
		}
		System.out.println(lineCount);
	}

}
