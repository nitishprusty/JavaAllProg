import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Task2 {

	public static void main(String[] args) {
		
		int wordcount = 0;
		int totalwordlength = 0;
		
		try (BufferedReader reader = new BufferedReader(new FileReader("c:\\Demo/myfile.txt"))){
			String line;
			while((line = reader.readLine()) != null) {
				String [] words = line.split("\\s+");
				for(String word : words) {
					wordcount++;
					totalwordlength += wordcount;
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		int averagewordsize = totalwordlength/wordcount;
		System.out.println("Total word count = " + wordcount);
		System.out.println("Average word size = " + averagewordsize);
		

	}

}
