import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferedReader {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(FileReader f = new FileReader("c:\\programdemo/myfile.txt");
				BufferedReader bf = new BufferedReader(f);){
			
			String s;
			while((s = bf.readLine()) != null) {
				System.out.println(s);
			}
			
		}

	}

}
