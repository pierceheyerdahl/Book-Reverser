import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment03 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileLocation = new Scanner(System.in);
		
		System.out.print("Please enter location of mobydick.txt: ");
		File file = new File(fileLocation.nextLine());
		while (!file.exists()) {
			System.out.print("Error: Enter file name: ");
			file = new File(fileLocation.nextLine());
		}
		fileLocation.close();
		
		Scanner input = new Scanner(file);
		
		ArrayList<String> list = new ArrayList<String>();
		
		while (input.hasNext()) {
			list.add(input.nextLine());
		}
		input.close();
		
		PrintWriter output = new PrintWriter(file);
		
		for (int i = list.size() - 1; i >= 0; i--) {
			StringBuilder line = new StringBuilder(list.get(i));
			if (i == 0) {
				output.print(line.reverse());
			} else {
				output.println(line.reverse());
			}
		}
		output.close();		
	}
}