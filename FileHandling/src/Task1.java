import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Task1 {

	public static void main(String[] args) {
		
		char targetchar = 't';
		int count = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader("c:\\Demo/myfile.txt"))) {
			int c;
			while((c = reader.read()) != -1) {
				if(Character.toLowerCase((char) c) == targetchar) {
					count++;
				}
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(count);

	}

}
