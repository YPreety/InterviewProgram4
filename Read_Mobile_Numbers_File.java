package Programming;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Read_Mobile_Numbers_File {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("C:/Users/136342/workspace/Programming_Projects/output.txt");
		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		BufferedReader br = new BufferedReader(
				new FileReader("C:/Users/136342/workspace/Programming_Projects/input.txt"));
		String line = br.readLine();
		while (line != null) {
			Matcher m = p.matcher(line);
			while (m.find()) {
				pw.println(m.group());
			}
			line = br.readLine();
		}
		pw.flush();
	}
}
