package filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		File readtxt = new File("C:\\Users\\hp\\OneDrive\\Desktop\\FileReader\\readdoc.txt");

		BufferedReader breader = new BufferedReader(new FileReader(readtxt));

		//Scanner sc = new Scanner(new FileReader(readtxt));

		try {
			String line = "";
			while ((line = breader.readLine()) != null) {
				System.out.println(line);
			}

		} finally {
			breader.close();
		}
	}
}
