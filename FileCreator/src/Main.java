import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\Users\\HP\\Desktop\\Test\\test.txt");
		if (file.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File already created.");
		}
		FileWriter writer;
		writer = new FileWriter(file);
		System.out.println("Type in what do you want to type: ");
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Fuck");
		list1.add("haha");
		for (int i = 0; i < list1.size(); i++) {
			String a = list1.get(i);
			writer.write(a + " ");
		}
		writer.close();
	}
}
